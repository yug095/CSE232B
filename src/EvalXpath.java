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
import org.w3c.dom.Element;
import org.w3c.dom.xpath.XPathEvaluator;

import java.io.File;
public class EvalXpath extends xPathBaseVisitor<NodeList>  implements xPathHelper{

  private static Node currentNode;
  @Override
  public NodeList visitApsl(xPathParser.ApslContext ctx) {
    return null;
  }

  @Override
  public NodeList visitTagName(xPathParser.TagNameContext ctx) {
    return null;
  }

  public NodeList absoLute (xPathParser.ApContext ctx) {
    if (ctx instanceof xPathParser.ApslContext) {
      return visitApsl((xPathParser.ApslContext) ctx);
    } else {
      return visitApslsl((xPathParser.ApslslContext) ctx);
    }
  }

  public NodeList relaTive(xPathParser.RpContext ctx, Node n) {
    this.currentNode = n;
    if (ctx instanceof xPathParser.TagNameContext) {
      return visitTagName((xPathParser.TagNameContext)ctx);
    }
    if (ctx instanceof xPathParser.StarContext) {
      return visitStar((xPathParser.StarContext) ctx);
    }
    if (ctx instanceof xPathParser.DotContext) {
      return visitDot((xPathParser.DotContext) ctx);
    }
    if (ctx instanceof xPathParser.ParentContext) {
      return visitParent((xPathParser.ParentContext) ctx);
    }
    if (ctx instanceof xPathParser.TextContext) {
      return visitText((xPathParser.TextContext) ctx);
    }
    if (ctx instanceof xPathParser.AttributeContext) {
      return visitAttribute((xPathParser.AttributeContext) ctx);
    }
    if (ctx instanceof xPathParser.ParensContext) {
      return visitParens((xPathParser.ParensContext) ctx);
    }
    if (ctx instanceof xPathParser.SingleSlashRpContext) {
      return visitSingleSlashRp((xPathParser.SingleSlashRpContext) ctx);
    }
    if (ctx instanceof xPathParser.DoubleSlashRpContext) {
      return visitDoubleSlashRp((xPathParser.DoubleSlashRpContext) ctx);
    }
    if (ctx instanceof xPathParser.FilterRpContext) {
      return visitFilterRp((xPathParser.FilterRpContext) ctx);
    }
    if (ctx instanceof xPathParser.CommaRpContext) {
      return visitCommaRp((xPathParser.CommaRpContext) ctx);
    }
    return null;
  }
  public boolean filTer(xPathParser.FilterContext ctx, Node n) {
    return true;
  }

  public Node root(String fileName) {
    return null;
  }

  public NodeList children(Node n) {
    return null;
  }

  public NodeList parent(Node n) {
    return null;
  }

  public String tag(Node n) {
    return n.getNodeName();
  }



  public Node txt(Node n) {
    return null;
  }
}
