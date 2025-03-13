package laba10.example1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.stream.IntStream;

public class EmployeeXmlManager {
    private static final String FILE_PATH = "src/laba10/example1/exampleEmployee.xml";

    public void addEmployee(String name, String position, String birthday) {
        try {
            Document doc = loadDocument();
            Element root = doc.getDocumentElement();

            Element employee = doc.createElement("Employee");
            Element nameElem = doc.createElement("Name");
            nameElem.appendChild(doc.createTextNode(name));
            Element positionElem = doc.createElement("Position");
            positionElem.appendChild(doc.createTextNode(position));
            Element birthdayElem = doc.createElement("Birthday");
            birthdayElem.appendChild(doc.createTextNode(birthday));

            employee.appendChild(nameElem);
            employee.appendChild(positionElem);
            employee.appendChild(birthdayElem);
            root.appendChild(employee);

            saveDocument(doc);
            System.out.println("Сотрудник добавлен.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void searchEmployee(String query) {
        try {
            Document doc = loadDocument();
            NodeList employees = doc.getElementsByTagName("Employee");
            IntStream.range(0, employees.getLength()).mapToObj(employees::item)
                    .filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(emp -> emp.getElementsByTagName("Name").item(0).getTextContent().equalsIgnoreCase(query) ||
                            emp.getElementsByTagName("Birthday").item(0).getTextContent().contains(query))
                    .forEach(emp -> System.out.println("Найден: " + emp.getElementsByTagName("Name").item(0).getTextContent()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteEmployee(String name) {
        try {
            Document doc = loadDocument();
            NodeList employees = doc.getElementsByTagName("Employee");
            for (int i = 0; i < employees.getLength(); i++) {
                Element emp = (Element) employees.item(i);
                if (emp.getElementsByTagName("Name").item(0).getTextContent().equalsIgnoreCase(name)) {
                    emp.getParentNode().removeChild(emp);
                    saveDocument(doc);
                    System.out.println("Сотрудник удален.");
                    return;
                }
            }
            System.out.println("Сотрудник не найден.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Document loadDocument() throws Exception {
        File file = new File(FILE_PATH);
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        return dBuilder.parse(file);
    }

    private void saveDocument(Document doc) throws TransformerException {
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }
}
