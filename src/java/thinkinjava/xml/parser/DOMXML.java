package thinkinjava.xml.parser;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by yelianghuo on 2018/8/25.
 */
public class DOMXML {



    public static void main(String[] args) throws Exception{
        DocumentBuilderFactory  builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = builderFactory.newDocumentBuilder();
        Document document = builder.parse(new File("src/book.xml"));

        NodeList bookList = document.getElementsByTagName("book");

        for (int i = 0; i < bookList.getLength(); i++) {
            Node book = bookList.item(i);
            NamedNodeMap attrs = book.getAttributes();
            for (int j = 0; j < attrs.getLength(); j++) {
                if(attrs.item(j).getNodeType() == Node.ATTRIBUTE_NODE){
                    System.out.println(bookList.item(j).getNodeName() + "'s attribute");
                }
                Node node = attrs.item(j);
                System.out.println(node.getNodeName() + ": " + node.getNodeValue());
            }
            NodeList childNodeList = book.getChildNodes();

            for (int k = 0; k < childNodeList.getLength(); k++) {
                //区分出text类型的node以及element类型的node
//                System.out.println(childNodeList.item(k));
                if (childNodeList.item(k).getNodeType() == Node.TEXT_NODE){
                    System.out.println(childNodeList.item(k).getNodeName() + childNodeList.item(k).getNodeValue().length());
                }
                if (childNodeList.item(k).getNodeType() == Node.ELEMENT_NODE) {
                    //获取了element类型节点的节点名
                    System.out.print("第" + (k + 1) + "个节点的节点名："
                            + childNodeList.item(k).getNodeName());
                    //获取了element类型节点的节点值
                    System.out.println("--节点值是：" + childNodeList.item(k).getFirstChild().getNodeValue());
                    //System.out.println("--节点值是：" + childNodes.item(k).getTextContent());
                }
//                System.out.println(childNodeList.item(k).getTextContent());

            }

        }
    }
}
