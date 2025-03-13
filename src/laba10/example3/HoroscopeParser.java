package laba10.example3;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import java.io.*;
import java.util.List;

public class HoroscopeParser {
    private static final String FILE_PATH = "src/laba10/example3/horoscope_data.txt";
    private static final int MAX_RETRIES = 3;

    public static void main(String[] args) {
        int attempts = 0;
        while (attempts < MAX_RETRIES) {
            try {
                // Получаем HTML код страницы
                Document doc = Jsoup.connect("https://www.e1.ru/horoscope/daily/").get();

                // Извлекаем список гороскопов
                Elements newsParent = doc.select("#app > div.global-wrapper > div.app-content > div > div.inner-columns-wrapper > div.central-right-wrapper > div.central-column-container > section");

                if (newsParent.isEmpty()) {
                    System.out.println("Гороскопы не найдены! Проверьте селектор.");
                    return;
                }

                List<Node> nodes = newsParent.get(0).childNodes();
                System.out.println("Обнаружено элементов: " + nodes.size());

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
                    for (int i = 1; i < nodes.size(); i++) {
                        if (!(i % 12 == 0) && nodes.get(i) instanceof Element) {
                            Element element = (Element) nodes.get(i);

                            Elements signElements = element.getElementsByClass("_4K6U+ _9dcVo");
                            Elements horoscopeElements = element.getElementsByClass("BDPZt KUbeq");
                            Elements dateElements = element.getElementsByClass("vpvdP _9TfK4");

                            if (!signElements.isEmpty() && !horoscopeElements.isEmpty() && !dateElements.isEmpty()) {
                                String sign = signElements.get(0).text();
                                String horoscope = horoscopeElements.get(0).text();
                                String date = dateElements.get(0).text();

                                System.out.println("Знак зодиака: " + sign);
                                System.out.println("Гороскоп: " + horoscope);
                                System.out.println("Дата: " + date + "\n");

                                writer.write("Знак зодиака: " + sign + "\n");
                                writer.write("Гороскоп: " + horoscope + "\n");
                                writer.write("Дата: " + date + "\n\n");
                            } else {
                                System.out.println("Пропущен элемент №" + i + " (не все данные найдены).");
                            }
                        }
                    }
                }

                System.out.println("Данные успешно сохранены в файл " + FILE_PATH);
                break;
            } catch (IOException e) {
                attempts++;
                System.out.println("Ошибка загрузки страницы (попытка " + attempts + " из " + MAX_RETRIES + "): " + e.getMessage());
                if (attempts == MAX_RETRIES) {
                    System.out.println("Не удалось загрузить страницу после " + MAX_RETRIES + " попыток.");
                }
            }
        }
    }
}