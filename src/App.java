
/**
 * Created by gaoyue on 17/1/27.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.*;
public class App {
  public static void main(String[] args) {
    try {

      String test = "doc(\"j_caesar.xml\")//ACT[./TITLE]/*/SPEECH/../TITLE";

      ANTLRInputStream input = new ANTLRInputStream(test);
      xPathLexer lexer = new xPathLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      xPathParser parser = new xPathParser(tokens);
      parser.removeErrorListeners();
      ParseTree tree = parser.ap();
      EvalXpath evalpath = new EvalXpath();
      List<Node> ret = evalpath.visit(tree);
          /*for(Nod n : ret) {
            System.out.println("ret name: " + n.getNodeName() + " " + "ret txt  " + n.getTextContent());
          }*/
//      System.out.println("ret size is : " + ret.size());
      for(Node node : ret) {
        output(node);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Error: " + e.getMessage());
    }
  }
  public static void output (Node x) {
    System.out.println('<' + x.getNodeName() + '>');
    if (x.getChildNodes()!=null) {
      for (int i = 0; i<x.getChildNodes().getLength(); i++) {
        if (x.getChildNodes().item(i).getNodeName()=="#text") {
          System.out.println(x.getTextContent());
        }
        else output(x.getChildNodes().item(i));
      }
    }
    System.out.println("</" + x.getNodeName() + '>');
  }
}
