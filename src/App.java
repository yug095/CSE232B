
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
        "\n" +
        "for $s in document(\"j_caesar.xml\")//SCENE \n" +
        " \n" +
        "where $s//SPEAKER/text()=\"CAESAR\"\n" +
        "return \n" +
        "<scenes> { <scene> {$s/TITLE/text()} </scene>,\n" +
        "\n" +
        "for $a in document(\"j_caesar.xml\")//ACT\n" +
        "where some $s1 in (for $x in $a//SCENE where $x/TITLE/text()=\"SCENE II. A public place.\" return $x) satisfies $s1 eq $s and $a/TITLE/text() = \"ACT I\"\n" +
        "return <act>\n" +
        "{$a/TITLE/text()}\n" +
        "</act>\n" +
        "}\n" +
        "</scenes>\n" +
        "}\n" +
        "</result>";


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
