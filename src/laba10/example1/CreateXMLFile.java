package laba10.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;

public class CreateXMLFile {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            //Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("Libray");
            doc.appendChild(rootElement);

            //Добавление первой книги
            Element book1 = doc.createElement("Book");
            rootElement.appendChild(book1);

            Element title1 = doc.createElement("Title");
            title1.appendChild(doc.createTextNode("Война и Мир"));
            book1.appendChild(title1);

            Element author1 = doc.createElement("Author");
            author1.appendChild(doc.createTextNode("Лев Толстой"));
            book1.appendChild(author1);

            Element year1 = doc.createElement("Year");
            year1.appendChild(doc.createTextNode("1869"));
            book1.appendChild(year1);

            //Добавление второй книги
            Element book2 = doc.createElement("Book");
            rootElement.appendChild(book2);

            Element title2 = doc.createElement("Title");
            title2.appendChild(doc.createTextNode("Мастер и Маргарита"));
            book2.appendChild(title2);

            Element author2 = doc.createElement("Author");
            author2.appendChild(doc.createTextNode("Михаил Булгаков"));
            book2.appendChild(author2);

            Element year2 = doc.createElement("Year");
            year2.appendChild(doc.createTextNode("1967"));
            book2.appendChild(year2);

            //Запись XML файла
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.STANDALONE, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/laba10/example1/example.xml"));
            transformer.transform(source, result);

            System.out.println("XML файл успешно создан");

        }catch (Exception pce){
            pce.printStackTrace();
        }
    }
}
