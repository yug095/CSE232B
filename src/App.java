
/**
 * Created by gaoyue on 17/1/27.
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Node;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.*;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;
public class App {
  public static void main(String[] args) {
    try {
      String fileName = "/Users/gaoyue/Desktop/CSE_232b/test.txt";
      String line = null;

        InputStream is = new FileInputStream(fileName);
        BufferedReader buf = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        while ((line = buf.readLine()) != null) {
          sb.append(line).append("\n");
        }
        String test = sb.toString();

        ANTLRInputStream input = new ANTLRInputStream(test);
        xPathLexer lexer = new xPathLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        xPathParser parser = new xPathParser(tokens);
        parser.removeErrorListeners();
        ParseTree tree = parser.xq();
        FileWriter fw = new FileWriter("/Users/gaoyue/Desktop/CSE_232b/result.xml");
        EvalXpath evalpath = new EvalXpath();
        List<Node> ret = evalpath.visit(tree);
        for (Node node : ret) {
          evalpath.display(node);
        }
        evalpath.getString();
        System.out.println("\n \n \n");

      } catch (Exception e) {
        e.printStackTrace();
        System.err.println("Error: " + e.getMessage());
      }
  }
}
