

/**
 * Created by gaoyue on 17/1/27.
 */

import javax.management.ListenerNotFoundException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import com.sun.org.apache.xalan.internal.xsltc.compiler.XPathParser;
import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.webkit.dom.NodeImpl;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.*;
import java.lang.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

import java.io.File;
import java.util.Set;

public class EvalXpath extends xPathBaseVisitor<List<Node>>  implements xPathHelper {

  private  Node currentNode;

  private Document resDoc;

  private Map<String, List<Node>> context = new HashMap<>();

  public void createDoc() {
    if(resDoc == null) {
      try {
        resDoc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
      } catch (ParserConfigurationException e) {
        e.printStackTrace();
        System.err.println("Error: " + e.getMessage());
      }
    }
  }
  @Override
  public List<Node> visitApsl(xPathParser.ApslContext ctx) {
    String fileName = ctx.NAME().getText();

    Node root = root(fileName);

    xPathParser.RpContext rpctx = ctx.rp();
    List<Node> nList = relaTive(rpctx, root);
    return nList;
  }

  @Override
  public List<Node> visitApslsl(xPathParser.ApslslContext ctx) {
    xPathParser.RpContext rp =ctx.rp();
    String fileName = ctx.NAME().getText();
    List<Node> nList = doubeSlash(new xPathParser.DotContext(new xPathParser.RpContext()), rp, root(fileName));
    return nList;
  }

  public List<Node> visit(xPathParser.ApContext ctx) {
    if(ctx instanceof xPathParser.ApslContext) {
      return visitApsl((xPathParser.ApslContext) ctx);
    }
    if(ctx instanceof  xPathParser.ApslslContext) {
      return visitApslsl((xPathParser.ApslslContext) ctx);
    }
    return null;
  }

  public List<Node> visitTagName(xPathParser.TagNameContext ctx, Node n) {
    List<Node> nList = new ArrayList<>();
    List<Node> cList = visitStar(n);
    String tagName = ctx.NAME().getText();
    for(Node node : cList) {
      if(node.getNodeName().equals(tagName)) {
        nList.add(node);
      }
    }
    return nList;
  }

  public List<Node> visitStar (Node n) {
    return children(n);
  }

  public List<Node> visitDot(xPathParser.DotContext ctx, Node n) {
    List<Node> ret = new ArrayList<>();
    ret.add(n);
    return ret;
  }

  public  List<Node> visitText( Node n) {
    return txt(n);
  }

  public  List<Node> visitParent(Node n) {
    return  parent(n);
  }

  public  List<Node> visitAttribute(xPathParser.AttributeContext ctx, Node n) {
    String nodeName = ctx.NAME().getText();
    List<Node> nList = new ArrayList<>();
    nList.add(n.getAttributes().getNamedItem(nodeName));
    return nList;
  }

  public  List<Node> visitParens(xPathParser.ParensContext ctx, Node n) {
    xPathParser.RpContext rpctx = ctx.rp();
    return relaTive(rpctx, n);
  }

  public  List<Node> singleSlash (xPathParser.RpContext rp1, xPathParser.RpContext rp2, Node n) {
    Set<Node> set = new LinkedHashSet<>();
    List<Node> nList = relaTive(rp1, n);
    for(Node node : nList) {
      set.addAll(relaTive(rp2, node));
    }
    return new ArrayList<>(set);
  }

  public List<Node>  doubeSlash(xPathParser.RpContext rp1, xPathParser.RpContext rp2, Node n) {
    Set<Node> set = new LinkedHashSet<>();
    List<Node> list1 = singleSlash(rp1, rp2, n);
    set.addAll(list1);
    List<Node> tmpList = relaTive(rp1, n);
    for(Node node : tmpList) {
      set.addAll(doubeSlash(new xPathParser.StarContext(new xPathParser.RpContext()), rp2, node));
    }
    return new ArrayList<>(set);
  }
  public  List<Node> visitSingleSlashRp(xPathParser.SingleSlashRpContext ctx, Node n) {
    xPathParser.RpContext rp1 = ctx.rp(0);
    xPathParser.RpContext rp2 = ctx.rp(1);
    return singleSlash(rp1, rp2, n);
  }

  public  List<Node> visitDoubleSlashRp(xPathParser.DoubleSlashRpContext ctx, Node n) {
    return doubeSlash(ctx.rp(0), ctx.rp(1), n);
  }

  public  List<Node> visitFilterRp(xPathParser.FilterRpContext ctx, Node n) {
    xPathParser.FilterContext fctx = ctx.filter();
    xPathParser.RpContext rpctx = ctx.rp();
    List<Node> nList = new ArrayList<>();
    List<Node> tmpList = relaTive(rpctx, n);
    for(Node node : tmpList) {
      if(filTer(fctx, node)) {
        nList.add(node);
      }
    }
    return nList;
  }

  public List<Node> visitCommaRp(xPathParser.CommaRpContext ctx, Node n) {
    Set<Node> set = new LinkedHashSet<>();
    xPathParser.RpContext rp1 = ctx.rp(0);
    xPathParser.RpContext rp2 = ctx.rp(1);
    set.addAll(relaTive(rp1, n));
    set.addAll(relaTive(rp2, n));
    return new ArrayList<>(set);
  }

  public boolean visitRpFilter (xPathParser.RpFilterContext ctx, Node n) {
    xPathParser.RpContext rp = ctx.rp();
    return !relaTive(rp, n).isEmpty();
  }

  public boolean visitEq1Filter (xPathParser.Eq1FilterContext ctx, Node n) {
    return true;
  }

  public boolean visitEq2Filter (xPathParser.Eq2FilterContext ctx, Node n) {
      return true;
  }

  public boolean visitIs1Filter (xPathParser.Is1FilterContext ctx, Node n) {
    xPathParser.RpContext rp1 = ctx.rp(0);
    xPathParser.RpContext rp2 = ctx.rp(1);
    List<Node> l1 = relaTive(rp1, n);
    List<Node> l2 = relaTive(rp2, n);
    l1.retainAll(l2);
    return !l1.isEmpty();
  }

  public boolean visitIs2Filter (xPathParser.Is2FilterContext ctx, Node n) {
    xPathParser.RpContext rp1 = ctx.rp(0);
    xPathParser.RpContext rp2 = ctx.rp(1);
    List<Node> l1 = relaTive(rp1, n);
    List<Node> l2 = relaTive(rp2, n);
    l1.retainAll(l2);
    return !l1.isEmpty();
  }

  public boolean visitParensFilter (xPathParser.ParensFilterContext ctx, Node n) {
    return filTer(ctx.filter(), n);
  }


  public boolean visitAndFilter (xPathParser.AndFilterContext ctx, Node n) {
    return filTer(ctx.filter().get(0), n) && filTer(ctx.filter().get(1), n);
  }

  public boolean visitNotFilter (xPathParser.NotFilterContext ctx, Node n) {
    return !filTer(ctx.filter(), n);
  }

  public boolean visitOrFilter (xPathParser.OrFilterContext ctx, Node n) {
    return filTer(ctx.filter().get(0), n) || filTer(ctx.filter().get(1), n);
  }
  

  public List<Node> relaTive(xPathParser.RpContext ctx, Node n) {
    if (ctx instanceof xPathParser.TagNameContext) {
      return visitTagName((xPathParser.TagNameContext)ctx, n);
    }
    if (ctx instanceof xPathParser.StarContext) {
      return visitStar(n);
    }
    if (ctx instanceof xPathParser.DotContext) {
      return visitDot((xPathParser.DotContext) ctx, n);
    }
    if (ctx instanceof xPathParser.ParentContext) {
      return visitParent(n);
    }
    if (ctx instanceof xPathParser.TextContext) {
      return visitText(n);
    }
    if (ctx instanceof xPathParser.AttributeContext) {
      return visitAttribute((xPathParser.AttributeContext) ctx, n);
    }
    if (ctx instanceof xPathParser.ParensContext) {
      return visitParens((xPathParser.ParensContext) ctx, n);
    }
    if (ctx instanceof xPathParser.SingleSlashRpContext) {
      return visitSingleSlashRp((xPathParser.SingleSlashRpContext) ctx, n);
    }
    if (ctx instanceof xPathParser.DoubleSlashRpContext) {
      return visitDoubleSlashRp((xPathParser.DoubleSlashRpContext) ctx, n);
    }
    if (ctx instanceof xPathParser.FilterRpContext) {
      return visitFilterRp((xPathParser.FilterRpContext) ctx, n);
    }
    if (ctx instanceof xPathParser.CommaRpContext) {
      return visitCommaRp((xPathParser.CommaRpContext) ctx, n);
    }
    return null;
  }
  public boolean filTer(xPathParser.FilterContext ctx, Node n) {
    if (ctx instanceof xPathParser.RpFilterContext) {
      return visitRpFilter((xPathParser.RpFilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.Eq1FilterContext) {
      return visitEq1Filter((xPathParser.Eq1FilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.Eq2FilterContext) {
      return visitEq2Filter((xPathParser.Eq2FilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.Is1FilterContext) {
      return visitIs1Filter((xPathParser.Is1FilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.Is2FilterContext) {
      return visitIs2Filter((xPathParser.Is2FilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.ParensFilterContext) {
      return visitParensFilter((xPathParser.ParensFilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.AndFilterContext) {
      return visitAndFilter((xPathParser.AndFilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.OrFilterContext) {
      return visitOrFilter((xPathParser.OrFilterContext) ctx, n);
    }
    if(ctx instanceof xPathParser.NotFilterContext) {
      return visitOrFilter((xPathParser.OrFilterContext) ctx, n);
    }
    return false;
  }

  public Node root(String fileName) {

    File fXmlFile = new File("/Users/gaoyue/Desktop/CSE_232b/" + fileName + ".xml");
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(fXmlFile);
      doc.getDocumentElement().normalize();
      Node root = doc.getDocumentElement();
      return root;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;

  }

  public List<Node> children(Node n) {
    NodeList l = n.getChildNodes();
    int len = l.getLength();
    List<Node> nList = new ArrayList<>();
    for(int i = 0; i < len; i++) {
      Node c = l.item(i);
      if(c.getNodeType() != Node.TEXT_NODE) {
        nList.add(l.item(i));
      }
    }
    return  nList;
  }

  public List<Node> parent(Node n) {
    List<Node> nList = new ArrayList<>();
    nList.add(n.getParentNode());
    return nList;
  }

  public String tag(Node n) {
    return n.getNodeName();
  }



  public List<Node> txt(Node n) {
    NodeList cList = n.getChildNodes();
    List<Node> nList = new ArrayList<>();
    for(int i=0;i<cList.getLength();i++) {
      Node cNode = cList.item(i);
      if(cNode.getNodeType() == Node.TEXT_NODE) {
        nList.add(cNode);
      }
    }
    return nList;
  }


  //Below is what we add for milestone 2

  public List<Node> makeElement(String t, List<Node> l) {
    //take a tag name t and a list of XML nodes l and return a new XML element node n with tag(n) = t and children(n)=copy(l)
    createDoc();
    Node ret = resDoc.createElement(t);
    for(Node n : l) {
      if(n!=null) {
        ret.appendChild(resDoc.importNode(n, true));
      }
    }
    List<Node> res = new ArrayList<>();
    res.add(ret);
    return res;
  }

  public List<Node> makeText(String s) {
    //takes as  a String constant s and return an XML TEXT NODE WITH VALUE S
    List<Node> ret = new ArrayList<>();
    ret.add(resDoc.createTextNode(s));
    return ret;
  }

  Map<String, List<Node>>  assign(String var, List<Node> v, Map<String, List<Node>> c) {
    //assign a value to a var, copy the c, add , return a new c
    Map<String, List<Node>> map = new HashMap<>(c);
    //那原来的怎么处理???
    c.put(var, v);
    return map;
  }

  List<Node> getValue(String var) {
    return context.get(var);
  }
  
  public List<Node> visitVarXQ(xPathParser.VarXQContext ctx) {
    String s = ctx.var().NAME().getText();
    return getValue(s);
  }
  
  public List<Node> visitScXQ(xPathParser.ScXQContext ctx) {
    String sc = ctx.StringConstant().getText();
    return makeText(sc);
  }

  public List<Node> visitApXQ(xPathParser.ApXQContext ctx) {
    if(ctx.ap() instanceof xPathParser.ApslContext) {
      return visitApsl((xPathParser.ApslContext) ctx.ap());
    } else {
      return visitApslsl((xPathParser.ApslslContext) ctx.ap());
    }
  }
  public List<Node> visitXQ(xPathParser.XqContext ctx) {
    if(ctx instanceof xPathParser.VarXQContext) {
      return visitVarXQ((xPathParser.VarXQContext) ctx);
    }
    if(ctx instanceof xPathParser.ScXQContext) {
      return visitScXQ((xPathParser.ScXQContext) ctx);
    }
    if(ctx instanceof xPathParser.ApXQContext) {
      return visitApXQ((xPathParser.ApXQContext) ctx);
    }
    if(ctx instanceof xPathParser.ParensXQContext) {
      return visitParensXQ((xPathParser.ParensXQContext) ctx);
    }
    if(ctx instanceof xPathParser.CommaXQContext) {
      return visitCommaXQ((xPathParser.CommaXQContext) ctx);
    }
    if(ctx instanceof xPathParser.SingleSlashXQContext) {
      return visitSingleSlashXQ((xPathParser.SingleSlashXQContext) ctx);
    }
    if(ctx instanceof xPathParser.DoubleSlashXQContext) {
      return visitDoubleSlashXQ((xPathParser.DoubleSlashXQContext) ctx);
    }
    if(ctx instanceof xPathParser.TagNameXQContext) {
      return visitTagNameXQ((xPathParser.TagNameXQContext) ctx);
    }
    if(ctx instanceof xPathParser.FlwrXQContext) {
      return visitFlwrXQ((xPathParser.FlwrXQContext) ctx);
    }
    if(ctx instanceof xPathParser.LetXQContext) {
      return visitLetXQ((xPathParser.LetXQContext) ctx);
    }
    return null;
  }
  public List<Node> visitParensXQ(xPathParser.ParensXQContext ctx) {
    return visitXQ(ctx.xq());
  }
  
  public List<Node> visitCommaXQ(xPathParser.CommaXQContext ctx) {
    List<Node> ret = new LinkedList<>();
    xPathParser.XqContext xq1 = ctx.xq(0);
    xPathParser.XqContext xq2 = ctx.xq(1);
    ret.addAll(visitXQ(xq1));
    ret.addAll(visitXQ(xq2));
    return ret;
  }
  
  public List<Node> visitSingleSlashXQ(xPathParser.SingleSlashXQContext ctx) {
    xPathParser.XqContext xq = ctx.xq();
    xPathParser.RpContext rp = ctx.rp();
    List<Node> list = visitXQ(xq);
    Set<Node> set = new LinkedHashSet<>();
    for(Node node : list) {
      set.addAll(relaTive(rp, node));
    }
    return new ArrayList<>(set);
  }
  
  public List<Node> visitDoubleSlashXQ(xPathParser.DoubleSlashXQContext ctx) {
    xPathParser.XqContext xq = ctx.xq();
    xPathParser.RpContext rp = ctx.rp();
    List<Node> list = visitXQ(xq);
    Set<Node> set = new LinkedHashSet<>();
    for(Node node : list) {
      set.addAll(doubeSlash(new xPathParser.DotContext(new xPathParser.RpContext()), rp, node));
    }
    return new ArrayList<>(set);
  }

  public List<Node> visitTagNameXQ(xPathParser.TagNameXQContext ctx) {
    List<Node> l = visitXQ(ctx.xq());
    if(l == null) System.out.println("Oh, null list!");
    else System.out.println("size is " + l.size());
    return makeElement(ctx.NAME().get(0).getText(), l);
  }

  public List<Node> visitLetXQ(xPathParser.LetXQContext ctx) {
    xPathParser.XqContext finalxq = ctx.xq();
    xPathParser.LetClauseContext let = ctx.letClause();
    List<xPathParser.VarContext> varList = let.var();
    List<xPathParser.XqContext> xqList = let.xq();
    for(int i=0;i<varList.size();i++) {
      List<Node> value = visitXQ(xqList.get(i));
      context = assign(varList.get(i).NAME().getText(), value, context);
    }
    return visitXQ(finalxq);
  }

  public List<Node> visitFlwrXQ(xPathParser.FlwrXQContext ctx) {
    List<xPathParser.VarContext> varList = ctx.forClause().var();
    List<xPathParser.XqContext> xqList = ctx.forClause().xq();
    List<xPathParser.VarContext> letvarList = ctx.letClause().var();
    List<xPathParser.XqContext> letxqList = ctx.letClause().xq();
    xPathParser.XqContext finalXq = ctx.returnClause().xq();
    xPathParser.CondContext condctx = ctx.whereClause().cond();
    List<Node> ret = new ArrayList<>();
    flwrHelper(varList, xqList, 0, letvarList, letxqList, finalXq, condctx, ret);
    return ret;
  }


  public void flwrHelper(List<xPathParser.VarContext> varList, List<xPathParser.XqContext> xqList, int i, List<xPathParser.VarContext> letvarList, List<xPathParser.XqContext> letxqList, xPathParser.XqContext finalXq, xPathParser.CondContext condctx,  List<Node> ret) {
    if(i == varList.size()) {
      for(int j=0; j<letvarList.size();j++) {
        List<Node> value = visitXQ(letxqList.get(i));
        context = assign(letvarList.get(i).NAME().getText(), value, context );
      }
      if(visitCond(condctx)) {
        ret.addAll(visitXQ(finalXq));
      }
    }
    List<Node> nodeList = visitXQ(xqList.get(i));
    for(Node node : nodeList) {
      List<Node> l = new ArrayList<>();
      l.add(node);
      context = assign(varList.get(i).NAME().getText(), l, context);
      flwrHelper(varList, xqList, i+1, letvarList, letxqList, finalXq, condctx, ret);
    }
  }

  public boolean visitCond(xPathParser.CondContext ctx) {
    if(ctx instanceof xPathParser.Eq1CondContext) {
      return myVisitEq1Cond((xPathParser.Eq1CondContext) ctx);
    }
    if(ctx instanceof xPathParser.Eq2CondContext) {
      return myVisitEq2Cond((xPathParser.Eq2CondContext) ctx);
    }
    if(ctx instanceof xPathParser.Is1CondContext) {
      return myVisitIs1Cond((xPathParser.Is1CondContext) ctx);
    }
    if(ctx instanceof xPathParser.Is2CondContext) {
      return myVisitIs2Cond((xPathParser.Is2CondContext) ctx);
    }
    if(ctx instanceof xPathParser.EmptyCondContext) {
      return myVisitEmptyCond((xPathParser.EmptyCondContext) ctx);
    }
    if(ctx instanceof xPathParser.SomeSatisCondContext) {
      return myVisitSomeSatisCond((xPathParser.SomeSatisCondContext) ctx);
    }
    if(ctx instanceof xPathParser.ParensCondContext) {
      return myVisitParensCond((xPathParser.ParensCondContext) ctx);
    }
    if(ctx instanceof xPathParser.AndCondContext) {
      return myVisitAndCond((xPathParser.AndCondContext) ctx);
    }
    if(ctx instanceof xPathParser.OrCondContext) {
      return myVisitOrCond((xPathParser.OrCondContext) ctx);
    }
    if(ctx instanceof xPathParser.NotCondContext) {
      return myVisitNotCond((xPathParser.NotCondContext) ctx);
    }
    return true;
  }



  public boolean myVisitEq1Cond (xPathParser.Eq1CondContext ctx) {
    xPathParser.XqContext xq1 =ctx.xq(0);
    xPathParser.XqContext xq2 = ctx.xq(1);
    List<Node> l1 = visitXQ(xq1);
    List<Node> l2 = visitXQ(xq2);
    for(Node i : l1) {
      for(Node j : l2) {
        if(i.isEqualNode(j)) {
          return true;
        }
      }
    }
    return false;
  }
  public boolean myVisitEq2Cond(xPathParser.Eq2CondContext ctx) {
    xPathParser.XqContext xq1 =ctx.xq(0);
    xPathParser.XqContext xq2 = ctx.xq(1);
    List<Node> l1 = visitXQ(xq1);
    List<Node> l2 = visitXQ(xq2);
    for(Node i : l1) {
      for(Node j : l2) {
        if(i.isEqualNode(j)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean myVisitIs1Cond(xPathParser.Is1CondContext ctx ) {
    xPathParser.XqContext xq1 = ctx.xq(0);
    xPathParser.XqContext xq2 = ctx.xq(1);
    List<Node> l1 = visitXQ(xq1);
    List<Node> l2 = visitXQ(xq2);
    l1.retainAll(l2);
    return !l1.isEmpty();
  }

  public boolean myVisitIs2Cond(xPathParser.Is2CondContext ctx) {
    xPathParser.XqContext xq1 = ctx.xq(0);
    xPathParser.XqContext xq2 = ctx.xq(1);
    List<Node> l1 = visitXQ(xq1);
    List<Node> l2 = visitXQ(xq2);
    l1.retainAll(l2);
    return !l1.isEmpty();
  }

  public boolean myVisitEmptyCond(xPathParser.EmptyCondContext ctx) {
    return visitXQ(ctx.xq()).isEmpty();
  }

  public boolean myVisitSomeSatisCond(xPathParser.SomeSatisCondContext ctx) {
    List<Boolean> ret = new ArrayList<>();
    boolean r = false;
    ret.add(r);
    List<xPathParser.VarContext> varList = ctx.var();
    List<xPathParser.XqContext> xqList = ctx.xq();
    xPathParser.CondContext cond = ctx.cond();
    getCond(varList, xqList, 0, ret, cond);
    return ret.get(0);
  }

  public void getCond(List<xPathParser.VarContext> varList, List<xPathParser.XqContext> xqList, int i, List<Boolean> ret, xPathParser.CondContext cond) {
    if(i == varList.size()) {
      boolean r = true;
      ret.clear();
      ret.add(r);
    }
    List<Node> nodeList = visitXQ(xqList.get(i));
    for(Node node : nodeList) {
      List<Node> l = new ArrayList<>();
      l.add(node);
      context = assign(varList.get(i).NAME().getText(), l, context);
      getCond(varList, xqList, i+1, ret, cond);
    }
  }

  public boolean myVisitParensCond(xPathParser.ParensCondContext ctx) {
    return visitCond(ctx.cond());
  }

  public boolean myVisitAndCond(xPathParser.AndCondContext ctx) {
    return visitCond(ctx.cond(0)) && visitCond(ctx.cond(1));
  }

  public boolean myVisitOrCond(xPathParser.OrCondContext ctx) {
    return visitCond(ctx.cond(0)) || visitCond(ctx.cond(1));
  }

  public boolean myVisitNotCond(xPathParser.NotCondContext ctx) {
    return !visitCond(ctx.cond());
  }
}
