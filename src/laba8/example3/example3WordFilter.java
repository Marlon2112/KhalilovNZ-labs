package laba8.example3;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class example3WordFilter {
    private static final String BASE_PATH = "src/laba8/example3/wordfilter/";

    public static void main(String[] args) {
        File inputFile = new File(BASE_PATH + "literature.txt");
        File outputFile = new File(BASE_PATH + "filtered_words.txt");

        try {
            inputFile.getParentFile().mkdirs();
            if (!inputFile.exists()) {
                createSampleInputFile(inputFile);
                System.out.println("Записал исходный файл: " + inputFile.getAbsolutePath());
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8))) {

                System.out.println("Читаю данные из исходного файла...");
                String consonants = "бвгджзклмнпрстфхцчшщБВГДЖЗКЛМНПРСТФХЦЧШЩ";

                String line;
                int lineNumber = 0;
                while ((line = reader.readLine()) != null) {
                    lineNumber++;
                    String[] words = line.replaceAll("[^а-яА-ЯёЁ\s]", "").split("\\s+"); // Убираем знаки препинания и разбиваем слова
                    List<String> consonantWords = new ArrayList<>();

                    for (String word : words) {
                        if (!word.isEmpty() && consonants.indexOf(word.charAt(0)) != -1) {
                            consonantWords.add(word);
                        }
                    }

                    if (!consonantWords.isEmpty()) {
                        writer.write("Строка " + lineNumber + ": " + String.join(", ", consonantWords) + " (слов: " + consonantWords.size() + ")");
                        writer.newLine();
                        System.out.println("Записал из строки " + lineNumber + " (слов: " + consonantWords.size() + "): " + consonantWords);
                    }
                }
                System.out.println("Переписал данные в результирующий файл: " + outputFile.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createSampleInputFile(File inputFile) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(inputFile), StandardCharsets.UTF_8))) {
            writer.write("Буря мглою небо кроет, Вихри снежные крутя.");
            writer.newLine();
            writer.write("То, как зверь, она завоет, То заплачет, как дитя.");
            writer.newLine();
            writer.write("Бледный свет на путь унылый Льет печально лунный свет.");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
