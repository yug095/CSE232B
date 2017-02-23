
/**
 * Created by gaoyue on 17/1/27.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
public class App {
  public static void main(String[] args) {
        try {
//      ANTLRInputStream input = new ANTLRInputStream("doc(doc)/PERSONAE");
ANTLRInputStream input = new ANTLRInputStream("doc(haha)/(PERSONAE,ACT)/TITLE");

      xPathLexer lexer = new xPathLexer(input);
      CommonTokenStream tokens = new CommonTokenStream(lexer);

      xPathParser parser = new xPathParser(tokens);
      parser.removeErrorListeners();
      ParseTree tree = parser.ap();
      EvalXpath evalpath = new EvalXpath();
      evalpath.visit(tree);

    } catch (Exception e) {
      e.printStackTrace();
      System.err.println("Error: " + e.getMessage());
    }
  }
}
