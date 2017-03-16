

/**
 * Created by gaoyue on 17/1/27.
 */
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.omg.PortableInterceptor.USER_EXCEPTION;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.lang.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import java.io.File;
import java.io.StringWriter;
import java.util.Queue;
import java.util.Set;

public class EvalXpath extends xPathBaseVisitor<List<Node>>  implements xPathHelper {

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
    String fileName = ctx.StringConstant().getText().substring(1, ctx.StringConstant().getText().length()-1);
    Node root = root(fileName);

    xPathParser.RpContext rpctx = ctx.rp();
    List<Node> nList = relaTive(rpctx, root);
    return nList;
  }

  @Override
  public List<Node> visitApslsl(xPathParser.ApslslContext ctx) {
    xPathParser.RpContext rp =ctx.rp();
    String fileName = ctx.StringConstant().getText().substring(1, ctx.StringConstant().getText().length()-1);
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
    xPathParser.RpContext rp1 =ctx.rp(0);
    xPathParser.RpContext rp2 = ctx.rp(1);
    List<Node> l1 = relaTive(rp1, n);
    List<Node> l2 = relaTive(rp2, n);
    for(Node i : l1) {
      for(Node j : l2) {
        if(i.isEqualNode(j)) {
          return true;
        }
      }
    }
    return false;
  }

  public boolean visitEq2Filter (xPathParser.Eq2FilterContext ctx, Node n) {
    xPathParser.RpContext rp1 =ctx.rp(0);
    xPathParser.RpContext rp2 = ctx.rp(1);
    List<Node> l1 = relaTive(rp1, n);
    List<Node> l2 = relaTive(rp2, n);
    for(Node i : l1) {
      for(Node j : l2) {
        if(i.isEqualNode(j)) {
          return true;
        }
      }
    }
    return false;
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

    File fXmlFile = new File("/Users/gaoyue/Desktop/CSE_232b/" + fileName);
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

  //take a tag name t and a list of XML nodes l and return a new XML element node n with tag(n) = t and children(n)=copy(l)
  public List<Node> makeElement(String t, List<Node> l) {
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

  //takes as  a String constant s and return an XML TEXT NODE WITH VALUE S
  public List<Node> makeText(String s) {
    createDoc();
    List<Node> ret = new ArrayList<>();
    ret.add(resDoc.createTextNode(s));
    return ret;
  }

  //This function record the var in the context to the value v.
  Map<String, List<Node>>  assign(String var, List<Node> v) {
    context.put(var, v);
    return context;
  }

  List<Node> getValue(String var) {
    return context.get(var);
  }

  public List<Node> visitVarXQ(xPathParser.VarXQContext ctx) {
    String s = ctx.var().NAME().getText();
    return getValue(s);
  }

  public List<Node> visitScXQ(xPathParser.ScXQContext ctx) {
    String sc = ctx.StringConstant().getText().substring(1, ctx.StringConstant().getText().length()-1);
    return makeText(sc);
  }

  public List<Node> visitApXQ(xPathParser.ApXQContext ctx) {
    List<Node> ret = new ArrayList<>();
    if(ctx.ap() instanceof xPathParser.ApslContext) {
      ret = visitApsl((xPathParser.ApslContext) ctx.ap());
    } else {
      ret = visitApslsl((xPathParser.ApslslContext) ctx.ap());
    }
    return ret;
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
    if(ctx instanceof xPathParser.JoinXQContext) {
      return visitJoinXQ((xPathParser.JoinXQContext) ctx);
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
    if(xq instanceof xPathParser.VarXQContext) {
    }
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
    return makeElement(ctx.NAME().get(0).getText(), l);
  }

  public List<Node> visitLetXQ(xPathParser.LetXQContext ctx) {
    xPathParser.XqContext finalxq = ctx.xq();
    xPathParser.LetClauseContext let = ctx.letClause();
    List<xPathParser.VarContext> varList = let.var();
    List<xPathParser.XqContext> xqList = let.xq();
    for(int i=0;i<varList.size();i++) {
      List<Node> value = visitXQ(xqList.get(i));
      context = assign(varList.get(i).NAME().getText(), value);
    }
    return visitXQ(finalxq);
  }



  public List<Node> visitFlwrXQ(xPathParser.FlwrXQContext ctx) {
    List<xPathParser.VarContext> varList = ctx.forClause().var();
    List<xPathParser.XqContext> xqList = ctx.forClause().xq();
    List<xPathParser.VarContext> letvarList = ctx.letClause()==null? new ArrayList<>() : ctx.letClause().var();
    List<xPathParser.XqContext> letxqList = ctx.letClause()==null? new ArrayList<>() : ctx.letClause().xq();
    xPathParser.XqContext finalXq = ctx.returnClause().xq();
    xPathParser.CondContext condctx = ctx.whereClause() == null? null : ctx.whereClause().cond();
    List<Node> ret = new ArrayList<>();
    flwrHelper(varList, xqList, 0, letvarList, letxqList, finalXq, condctx, ret);
    return ret;
  }

  public List<Node> visitJoinXQ(xPathParser.JoinXQContext ctx) {
    xPathParser.XqContext xq1 = ctx.joinClause().xq(0);
    xPathParser.XqContext xq2 = ctx.joinClause().xq(1);
    int varListSize = ctx.joinClause().varList(0).NAME().size();
    List<String> varList1 = new ArrayList<>();
    List<String> varList2 = new ArrayList<>();
    for(int i=0;i<varListSize;i++) {
      varList1.add(ctx.joinClause().varList(0).NAME(i).getText());
      varList2.add(ctx.joinClause().varList(1).NAME(i).getText());
    }
    List<Node> xq1List = visitXQ(xq1);
    List<Node> xq2List = visitXQ(xq2);
    List<Map<String, List<Node>>> mapList = new ArrayList<>();

    System.out.println("xq1list size is : " + xq1List.size());
    System.out.println("xq2list size is : " + xq2List.size());
    for(int i=0;i<varListSize;i++) {
      String varName = varList1.get(i);
//      System.out.println("varName is : " + varName);
      Map<String, List<Node>> map = new HashMap<>();
      for(Node node : xq1List) {
        String key0 = nodeToString(((Element) node).getElementsByTagName(varName).item(0));
        String starter = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        System.out.println("node to string key0 is " + key0);
        String key = key0.substring(starter.length()+varName.length()+2, key0.length()-2-1-varName.length());
        System.out.println("node to string key is " + key);
        List<Node> tmpList;
        if(map.containsKey(key)) {
//          System.out.println("contain");
          tmpList = map.get(key);
          tmpList.add(node.cloneNode(true));
        } else {
//          System.out.println("not contain");
          tmpList = new ArrayList<>();
          tmpList.add(node.cloneNode(true));
        }
        map.put(key, tmpList);
      }
      mapList.add(i, map);
    }

    List<Node> retList = new ArrayList<>();
    for(Node node : xq2List) {
      List<Node> nodeJoinList = new ArrayList<>();
      for(int i=0;i<varListSize;i++) {
        String varName = varList2.get(i);
        String key0 = nodeToString(((Element) node).getElementsByTagName(varName).item(0));
//        System.out.println("xq2List node to key0 string is : " + key0);
        String starter = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>";
        String key = key0.substring(starter.length()+varName.length()+2, key0.length()-2-1-varName.length());
//        System.out.println("xq2List node to key string is : " + key);

        //check if list(i) contains key, if not ,break
        if(!mapList.get(i).containsKey(key)) {
          break;
        }
        //else : update the compare list;
        else {
//          System.out.println("does this ever into?");
          if(i==0) nodeJoinList.addAll(mapList.get(i).get(key));
          else {
            List<Node> getList = mapList.get(i).get(key);
            Set<String> nodeJoinSet = new HashSet<>();
            List<Node> tmpJoinList = new ArrayList<>();
            for(Node n : nodeJoinList) {
              String nodeString = nodeToString(n);
              nodeJoinSet.add(nodeString);
            }
            for(Node n : getList) {
              String nString = nodeToString(n);
              if(nodeJoinSet.contains(nString)) {
                tmpJoinList.add(n.cloneNode(true));
              }
            }
            nodeJoinList = tmpJoinList;
          }
        }
      }
      int childNum = node.getChildNodes().getLength();
      for(Node joinNode : nodeJoinList) {
        for(int k=0;k<childNum;k++) {
          joinNode.appendChild(node.getChildNodes().item(k).cloneNode(true));
        }
      }
      retList.addAll(nodeJoinList);
    }
    System.out.println("retList size is : " + retList.size());
    return retList;
  }

  public String nodeToString(Node n) {
    try {
      StringWriter writer = new StringWriter();
      Transformer transformer = TransformerFactory.newInstance().newTransformer();
      transformer.transform(new DOMSource(n), new StreamResult(writer));
      return writer.toString();
    } catch (TransformerConfigurationException e) {
      e.printStackTrace();
    }catch (TransformerException e) {
      e.printStackTrace();
    }
    System.err.println("Error: Failed to transform node to String!");
    return null;
  }

  //This is a helper function to make it easier for visitFlwrXQ to recusive.
  public void flwrHelper(List<xPathParser.VarContext> varList, List<xPathParser.XqContext> xqList, int i, List<xPathParser.VarContext> letvarList, List<xPathParser.XqContext> letxqList, xPathParser.XqContext finalXq, xPathParser.CondContext condctx,  List<Node> ret) {
    if(i == varList.size()) {
      for(int j=0; j<letvarList.size();j++) {
        List<Node> value = visitXQ(letxqList.get(j));
        context = assign(letvarList.get(j).NAME().getText(), value);
      }
      if(condctx == null || visitCond(condctx)) {
        ret.addAll(visitXQ(finalXq));
      }
    } else {
      List<Node> nodeList = visitXQ(xqList.get(i));
      for (Node node : nodeList) {

        List<Node> l = new ArrayList<>();
        l.add(node);
        context = assign(varList.get(i).NAME().getText(), l);
        flwrHelper(varList, xqList, i + 1, letvarList, letxqList, finalXq, condctx, ret);
      }
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
      if(visitCond(cond)) {
        boolean r = true;
        ret.clear();
        ret.add(r);
    }
    } else {
      List<Node> nodeList = visitXQ(xqList.get(i));
      for (Node node : nodeList) {
        List<Node> l = new ArrayList<>();
        l.add(node);
        context = assign(varList.get(i).NAME().getText(), l);
        getCond(varList, xqList, i + 1, ret, cond);
      }
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


  public void display(Node node) {
      System.out.println('<' + node.getNodeName() + '>');
      if (node.getChildNodes() != null) {
        for (int i = 0; i < node.getChildNodes().getLength(); i++) {
          if (node.getChildNodes().item(i).getNodeName() == "#text") {
            System.out.println(node.getTextContent());
          } else display(node.getChildNodes().item(i));
        }
      }
      System.out.println("</" + node.getNodeName() + '>');
    }


  public Set<String> usedRoots;
  public Map<String, Map<String, List<String>>> eqMap;
  public Map<String, Set<String>> graphMap;
  public Map<String, String> rootMap;
  public Map<String, List<String>> pathMap;
  public Map<String, List<String>> whereMap;
  public Set<String> sortSet;
  public Map<String, List<String>> retVarMap;
  String joinString;
  String retString;


  @Override
  public List<Node> visitSubxq(xPathParser.SubxqContext ctx) {

    usedRoots = new HashSet<>();
    rootMap = new HashMap<>();
    eqMap = new HashMap<>();
    graphMap = new HashMap<>();
    pathMap = new HashMap<>();
    whereMap = new HashMap<>();
    retVarMap = new HashMap<>();
    sortSet = new LinkedHashSet<>();


    //Construct rootMap
    List<xPathParser.VarContext> varList = ctx.var();
    List<xPathParser.PathContext> pathList = ctx.path();
    int vpSize = varList.size();
    for(int i=0;i<vpSize;i++) {
      if(pathList.get(i) instanceof xPathParser.RootnodePathContext ||
        pathList.get(i) instanceof xPathParser.RoottextPathContext) {
          String rootName = varList.get(i).NAME().getText();
          rootMap.put(rootName, rootName);
          graphMap.put(rootName, new HashSet<>());
      } else {
        String childName = varList.get(i).NAME().getText();
        xPathParser.VarContext var;
        if(pathList.get(i) instanceof xPathParser.VarnodePathContext) {
          var = ((xPathParser.VarnodePathContext) pathList.get(i)).var();
        } else {
          var = ((xPathParser.VartextPathContext)pathList.get(i)).var();
        }
        String parentName = var.NAME().getText();
        rootMap.put(childName, parentName);
      }
    }

    //Construct eqMap and whereMap
    constructEqMap(ctx.subcond());


    //Construct pathMap
    for(int i=0;i<vpSize;i++) {
      String varName = varList.get(i).NAME().getText();
      String inPath = "" + varList.get(i).getText() + " in" + " " + pathList.get(i).getText() ;

      String root = getRoot(varList.get(i).NAME().getText());
      List<String> inPList = pathMap.getOrDefault(root, new ArrayList<>());
      List<String> varNList = retVarMap.getOrDefault(root, new ArrayList<>());
      inPList.add(inPath);
      varNList.add(varName);
      pathMap.put(root, inPList);
      retVarMap.put(root, varNList);
    }


    //Construct graphMap
    for(String root : graphMap.keySet()) {
      Map<String, List<String>> eqmap = eqMap.getOrDefault(root, new HashMap<>());
      graphMap.get(root).addAll(eqmap.keySet());
    }


    //Construct returnList
    retString = constructRetList(ctx.subreturn()).replaceAll(", }", " }");


    //Construct sortSet
    constructSortSet();

    //Construct joinString;
    List<String> sortList = new ArrayList<>(sortSet);
    String first = sortList.get(0);
    usedRoots.add(first);
    String forString = getFor(pathMap.get(first));
    List<String> whereList = whereMap.get(first);
    String whereString = "";
    if(whereList!=null) {
      whereString = getWhere(whereMap.get(first));
    }
    String retVarString = getReturn(retVarMap.get(first));
    String original = "";
    original += forString + whereString + retVarString;

    for(int i=1;i<sortList.size();i++) {
      String next = sortList.get(i);
      boolean last = false;
      if(i==sortList.size()-1) {
        last = true;
      }
      original = joinNext(original, next,usedRoots, last);
    }

    joinString = "";
    joinString += "for $tuple in " + original + "return " + retString;

    System.out.println("Now we test!");
    System.out.println();
    System.out.println("rootMap is : " + rootMap);
    System.out.println("eqMap is : " + eqMap);
    System.out.println("whereMap is : " + whereMap);
    System.out.println("pathMap is : " + pathMap);
    System.out.println("graph map is : " + graphMap);
    System.out.println("retString is : " + retString);
    System.out.println("sortSet is : " + sortSet);
    System.out.println("retVarMap is : " + retVarMap);
    System.out.println("final join String is \n" + joinString);
    System.out.println();
    System.out.println("Test Done!");

    return null;
  }

  public String constructRetList(xPathParser.SubreturnContext ctx) {
    if(ctx instanceof xPathParser.TagSubReturnContext) {
      String tagName = ((xPathParser.TagSubReturnContext) ctx).NAME(0).getText();
      String middle = constructRetList(((xPathParser.TagSubReturnContext) ctx).subreturn());
      return String.format("<%s>{ %s }</%s>", tagName,middle,tagName);
    } else if(ctx instanceof xPathParser.CommaSubReturnContext) {
      return constructRetList(((xPathParser.CommaSubReturnContext) ctx).subreturn(0)) + " "
                  + constructRetList(((xPathParser.CommaSubReturnContext) ctx).subreturn(1));
    } else if (ctx instanceof xPathParser.VarSubReturnContext) {
//      System.out.println("Ever in side?????");
      return "$tuple/" + ((xPathParser.VarSubReturnContext) ctx).var().NAME().getText() + "/*,";
    } else {
      if(((xPathParser.XqSubReturnContext)ctx).path() instanceof xPathParser.VarnodePathContext) {
        String var = ((xPathParser.VarnodePathContext) ((xPathParser.XqSubReturnContext) ctx).path()).var().NAME().getText();
        return "$tuple/" + var + "/*" +
          ((xPathParser.VarnodePathContext) ((xPathParser.XqSubReturnContext) ctx).path()).getText().
            substring(var.length()+1) + ",";
      } else {
        String var = ((xPathParser.VartextPathContext) ((xPathParser.XqSubReturnContext) ctx).path()).var().NAME().getText();
        return "$tuple/" + var + "/*" +
          ((xPathParser.VartextPathContext) ((xPathParser.XqSubReturnContext) ctx).path()).getText().
            substring(var.length()+1) + ",";
      }
    }
  }

  public void constructEqMap(xPathParser.SubcondContext ctx) {
//    System.out.println("inside construct eqMap!");
    if(ctx instanceof xPathParser.VarStrEq1SubCondContext || ctx instanceof xPathParser.VarStrEq2SubCondContext) {
      xPathParser.VarContext var;
      String constant;
      if(ctx instanceof xPathParser.VarStrEq1SubCondContext) {
        var = ((xPathParser.VarStrEq1SubCondContext) ctx).var();
        constant = ((xPathParser.VarStrEq1SubCondContext) ctx).StringConstant().getText();
      } else {
        var = ((xPathParser.VarStrEq2SubCondContext) ctx).var();
        constant = ((xPathParser.VarStrEq2SubCondContext) ctx).StringConstant().getText();
      }
      List<String> whereList = whereMap.getOrDefault(getRoot(var.NAME().getText()), new ArrayList<>());
      whereList.add(var.getText() + " eq " + constant);
      whereMap.put(getRoot(var.NAME().getText()), whereList);
    } else if(ctx instanceof xPathParser.VarEq1SubCondContext || ctx instanceof xPathParser.VarEq2SubCondContext) {
        String  var1;
        String  var2;
        if(ctx instanceof xPathParser.VarEq1SubCondContext) {
           var1 = ((xPathParser.VarEq1SubCondContext) ctx).var().get(0).NAME().getText();
           var2 = ((xPathParser.VarEq1SubCondContext) ctx).var().get(1).NAME().getText();
        } else {
            var1 = ((xPathParser.VarEq2SubCondContext) ctx).var().get(0).NAME().getText();
            var2 = ((xPathParser.VarEq2SubCondContext) ctx).var().get(1).NAME().getText();
        }
        if(getRoot(var1).equals(getRoot(var2))) {
          List<String> whereList = whereMap.getOrDefault(getRoot(var1), new ArrayList<>());
          whereList.add(var1 + " eq " + var2);
          whereMap.put(getRoot(var1), whereList );
        } else {
          String root1 = getRoot(var1);
          String root2 = getRoot(var2);
          Map<String, List<String>> subMap1 = eqMap.getOrDefault(root1, new HashMap<>());
          Map<String, List<String>> subMap2 = eqMap.getOrDefault(root2, new HashMap<>());
          List<String> subList1 = subMap1.getOrDefault(root2, new ArrayList<>());
          List<String> subList2 = subMap2.getOrDefault(root1, new ArrayList<>());
          subList1.add(var1);
          subList2.add(var2);
          subMap1.put(root2, subList1);
          eqMap.put(root1, subMap1);
          subMap2.put(root1, subList2);
          eqMap.put(root2, subMap2);
        }
    } else {
      xPathParser.SubcondContext subcond1 = ((xPathParser.AndSubCondContext) ctx).subcond(0);
      xPathParser.SubcondContext subcond2 = ((xPathParser.AndSubCondContext) ctx).subcond(1);
      constructEqMap(subcond1);
      constructEqMap(subcond2);
    }
  }

  public String getRoot(String varName) {
//    System.out.println("varName is " + varName);
    while(!rootMap.get(varName).equals(varName)) {
      varName = rootMap.get(varName);
    }
    return rootMap.get(varName);
  }

  public void constructSortSet() {
    int rootNum = graphMap.size();
    Queue<String> q = new LinkedList<>();
    List<String> rootList = new ArrayList<>();
    rootList.addAll(graphMap.keySet());
    if(rootList.isEmpty()) {
      System.err.println("No root error!");
    }
    q.offer(rootList.get(0));
    while(sortSet.size()<rootNum) {
      while(!q.isEmpty()) {
        String top = q.poll();
        sortSet.add(top);
        Set<String> next = graphMap.get(top);
        for(String n : next) {
          if(!sortSet.contains(n)) {
            q.offer(n);
          }
        }
      }
      if(sortSet.size()<rootNum) {
        for(String root : graphMap.keySet()) {
          if(!sortSet.contains(root)) {
            q.offer(root);
            break;
          }
        }
      }
    }
  }

  public String getFor(List<String> strList) {
    String ret = "for ";
    for(int i=0;i<strList.size();i++) {
      if(i!=strList.size()-1) {
        ret += strList.get(i) + ", \n";
      } else {
        ret += strList.get(i) + " \n";
      }
    }
    return ret;
  }

  public String getWhere(List<String> strList) {
    String ret = "where ";
    for(int i=0;i<strList.size();i++) {
      if(i!=strList.size()-1) {
        ret += strList.get(i) + ", \n";
      } else {
        ret += strList.get(i) + " \n";
      }
    }
    return ret;
  }

  public String getReturn(List<String> strList) {
    String ret = "return <tuple>{\n";
    for(int i=0;i<strList.size();i++) {
      String varName = strList.get(i);
      if(i != strList.size()-1) {
        ret += String.format("<%s>{$%s}</%s>, \n", varName,varName,varName);
      } else {
        ret += String.format("<%s>{$%s}</%s> \n", varName,varName,varName);
      }
    }
    ret += "}</tuple>, \n";
    return ret;
  }

  public String joinNext(String original, String next, Set<String> usedRoots, boolean last) {
    String ret = "join(";
    String forString = getFor(pathMap.get(next));
    List<String> whereList = whereMap.get(next);
    String whereString = "";
    if(whereList!=null) {
      whereString = getWhere(whereMap.get(next));
    }
    String retVarString = getReturn(retVarMap.get(next));
    original += forString + whereString + retVarString;
    List<String> first = new ArrayList<>();
    List<String> second = new ArrayList<>();
    for(String usedRoot : usedRoots) {
      if(!eqMap.containsKey(usedRoot)) continue;
      if(eqMap.get(usedRoot).containsKey(next)) {
        first.addAll(eqMap.get(usedRoot).get(next));
        second.addAll(eqMap.get(next).get(usedRoot));
      }
    }
    String f = "[";
    String s = "[";
    for(int i=0;i<first.size();i++) {
      if(i!=first.size()-1) {
        f += first.get(i) + ", ";
        s += second.get(i) + ", ";
      } else {
        f += first.get(i) + "]";
        s += second.get(i) + "]";
      }
    }
    ret += original + f + ",\n" + s + ")";
    if(last) {
      ret += "\n";
    } else {
      ret += ",\n";
    }
    usedRoots.add(next);
    return ret;
  }
  public List<List<String>> addRoot(String newRoot, Set<String> usedRoots, Map<String, Map<String, List<String>>> eqMap) {
    // TODO: 17/3/14
    return null;
  }
  public List<String> sortList(List<String> list, Map<String, Set<String>> graphMap) {
    List<String> ret = new ArrayList<>();
    Set<String> set = new HashSet<>();
    if(list.size()==0) {
      System.err.println("Err: Root list is empty!");
      return null;
    }
    // TODO: 17/3/14
    return null;
  }
}
