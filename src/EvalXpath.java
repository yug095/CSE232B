/*
 * Copyright © 2017 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

/**
 * Created by gaoyue on 17/1/27.
 */

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import org.w3c.dom.Element;
import org.w3c.dom.xpath.XPathEvaluator;

import java.io.File;
import java.util.Set;

public class EvalXpath extends xPathBaseVisitor<List<Node>>  implements xPathHelper{

  private  Node currentNode;
  @Override
  public List<Node> visitApsl(xPathParser.ApslContext ctx) {
    String fileName = ctx.NAME().getText();

    Node root = root(fileName);

    xPathParser.RpContext rpctx = ctx.rp();
    List<Node> nList = relaTive(rpctx, root);
    System.out.println("size is " + nList.size());
    for(Node n : nList) {
//      System.out.println("ret name: " + n.getNodeName() );
      System.out.println("ret name: " + n.getNodeName() + " " + "ret txt  " + n.getTextContent());
    }
    return nList;
  }

  @Override
  public List<Node> visitApslsl(xPathParser.ApslslContext ctx) {
    xPathParser.RpContext rp =ctx.rp();
    String fileName = ctx.NAME().getText();
    List<Node> nList = doubeSlash(new xPathParser.DotContext(new xPathParser.RpContext()), rp, root(fileName));
    System.out.println("size is " + nList.size());
    for(Node n : nList) {
//      System.out.println("ret name: " + n.getNodeName() );
      System.out.println("ret name: " + n.getNodeName() + " " + "ret txt  " + n.getTextContent());
    }
    return nList;
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



  public List<Node> absoLute (xPathParser.ApContext ctx) {
    List<Node> ret;
    if (ctx instanceof xPathParser.ApslContext) {
      ret = visitApsl((xPathParser.ApslContext) ctx);
    } else {
      ret = visitApslsl((xPathParser.ApslslContext) ctx);
    }
    return ret;
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
      System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
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
}
