
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

      String test = "for $s in doc(\"j_caesar.xml\")//SPEAKER, $a in doc(\"j_caesar.xml\")//ACT,\n" +
        "    $sp in $a//SPEAKER, $stxt in $s/text()\n" +
        "where $sp eq $s and $stxt = \"CAESAR\"\n" +
        "return <act> { $a/TITLE/text()} </act>\n";

      ANTLRInputStream input = new ANTLRInputStream(test);
      xPathLexer lexer = new xPathLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);
      xPathParser parser = new xPathParser(tokens);
      parser.removeErrorListeners();
      ParseTree tree = parser.subxq();
      EvalXpath evalpath = new EvalXpath();
      List<Node> ret = evalpath.visit(tree);
//      for(Node node : ret) {
//        evalpath.display(node);
//      }
    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Error: " + e.getMessage());
    }
  }
}
