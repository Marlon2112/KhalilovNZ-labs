package laba10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XmlParserEmployee {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/laba10/example1/exampleEmployee.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
            System.out.println("Корневой элемент :" + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("Employee");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Имя сотрудника: " + element.getElementsByTagName("Name").item(0).getTextContent());
                    System.out.println("Должность: " + element.getElementsByTagName("Position").item(0).getTextContent());
                    System.out.println("День рождения: " + element.getElementsByTagName("Birthday").item(0).getTextContent());
                }
            }

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
