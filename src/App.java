
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

      String test = "for $b1 in doc(\"book.xml\")//book,\n" +
        "$aj in $b1/author/first/text(),\n" +
        "$a1 in $b1/author, \n" +
        "$af1 in $a1/first/text(),\n" +
        "$al1 in $a1/last/text(),\n" +
        "\n" +
        "$b2 in doc(\"book.xml\")//book,\n" +
        "$a21 in $b2/author,\n" +
        "$af21 in $a21/first/text(),\n" +
        "$al21 in $a21/last/text(),\n" +
        "$a22 in $b2/author,\n" +
        "$af22 in $a22/first/text(),\n" +
        "$al22 in $a22/last/text(),\n" +
        "\n" +
        "$b3 in doc(\"book.xml\")//book,\n" +
        "$a3 in $b3/author,\n" +
        "$af3 in $a3/first/text(),\n" +
        "$al3 in $a3/last/text()\n" +
        "where $aj eq \"W.\" and $af1 eq $af21 and $al1 eq $al21 and $af22 eq $af3 and $al22 eq $al3\n" +
        "return <triplet> { $b1, $b2, $b3} </triplet>\n";

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
