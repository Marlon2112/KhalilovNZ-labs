package laba10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class TestParser {
    public static void main(String[] args) {
        try {

            Document doc = Jsoup.connect("https://www.e1.ru/horoscope/daily/").get();


            System.out.println(doc.html());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
