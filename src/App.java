
/**
 * Created by gaoyue on 17/1/27.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import java.util.*;
public class App {
  public static void main(String[] args) {
    try {

      String test = "<result>{\n" +
        "for $a in document(\"j_caesar.xml\")//PERSONAE, $b in $a/PERSONA \n" +
        "  where not (($b/text() = \"JULIUS CAESAR\") or ($b/text() = \"Another Poet\") )\n" +
        "   return $b\n" +
        "}\n" +
        "</result>\n";

      ANTLRInputStream input = new ANTLRInputStream(test);
      xPathLexer lexer = new xPathLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      xPathParser parser = new xPathParser(tokens);
      parser.removeErrorListeners();
      ParseTree tree = parser.xq();
      EvalXpath evalpath = new EvalXpath();
      List<Node> ret = evalpath.visit(tree);
      for(Node node : ret) {
        evalpath.display(node);
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Error: " + e.getMessage());
    }
  }
}
