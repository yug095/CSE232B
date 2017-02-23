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
import java.util.List;

public interface xPathHelper {


  List<Node> relaTive(xPathParser.RpContext ctx, Node n);

  boolean filTer(xPathParser.FilterContext ctx, Node n);

  Node root(String fileName);

  List<Node> children(Node n);

  List<Node> parent(Node n);

  String tag(Node n);

  List<Node> txt(Node n);
}
