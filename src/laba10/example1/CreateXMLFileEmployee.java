package laba10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class CreateXMLFileEmployee {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            //Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Libray");
            doc.appendChild(rootElement);

            //Добавление первой книги
            Element employee1 = doc.createElement("Employee");
            rootElement.appendChild(employee1);

            Element name1 = doc.createElement("Name");
            name1.appendChild(doc.createTextNode("Иванов И.И."));
            employee1 .appendChild(name1);

            Element position1 = doc.createElement("Position");
            position1 .appendChild(doc.createTextNode("Разработчик"));
            employee1 .appendChild(position1 );

            Element birthday1 = doc.createElement("Birthday");
            birthday1.appendChild(doc.createTextNode("01.01.1990"));
            employee1 .appendChild(birthday1);

            //Добавление второй книги
            Element employee2  = doc.createElement("Employee");
            rootElement.appendChild(employee2);

            Element name2 = doc.createElement("Name");
            name2.appendChild(doc.createTextNode("Петров П.П."));
            employee2.appendChild(name2);

            Element position2 = doc.createElement("Position");
            position2.appendChild(doc.createTextNode("Аналитик"));
            employee2.appendChild(position2);

            Element birthday2 = doc.createElement("Birthday");
            birthday2.appendChild(doc.createTextNode("02.02.1990"));
            employee2.appendChild(birthday2);

            //Добавление третьего сотрудника
            Element employee3  = doc.createElement("Employee");
            rootElement.appendChild(employee3);

            Element name3 = doc.createElement("Name");
            name3.appendChild(doc.createTextNode("Сидоров В.П."));
            employee3.appendChild(name3);

            Element position3 = doc.createElement("Position");
            position3.appendChild(doc.createTextNode("DevOps engineer"));
            employee3.appendChild(position3);

            Element birthday3 = doc.createElement("Birthday");
            birthday3.appendChild(doc.createTextNode("12.02.1994"));
            employee3.appendChild(birthday3);

            //Запись XML файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/laba10/example1/exampleEmployee.xml"));
            transformer.transform(source, result);

            System.out.println("XML файл успешно создан");

        }catch (Exception pce){
            pce.printStackTrace();
        }
    }
}
