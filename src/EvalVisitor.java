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
import java.io.File;


public class EvalVisitor extends xPathBaseVisitor<NodeList> {
  public NodeList visitAp (xPathParser.ApContext ctx) {
    String fileName = ctx.FILENAME().getText();
    File fXmlFile = new File("/Users/gaoyue/Desktop/CSE_232b/" + fileName + ".xml");
    DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    try {
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      Document doc = dBuilder.parse(fXmlFile);
      doc.getDocumentElement().normalize();
      System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());

      NodeList nList = doc.getElementsByTagName("PLAY");
      return nList;
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
}
