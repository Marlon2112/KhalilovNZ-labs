package laba8.example2;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class example2filter {
    private static final String BASE_PATH = "src/laba8/example2/filter/";

    public static void main(String[] args) {
        File inputFile = new File(BASE_PATH + "input.txt");
        File outputFile = new File(BASE_PATH + "output.txt");

        try {
            inputFile.getParentFile().mkdirs();
            if (!inputFile.exists()) {
                createSampleInputFile(inputFile);
                System.out.println("Записал исходный файл: " + inputFile.getAbsolutePath());
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(inputFile), StandardCharsets.UTF_8));
                 BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8))) {

                System.out.println("Читаю данные из исходного файла...");
                String firstLine = reader.readLine();
                String secondLine = reader.readLine();

                if (secondLine != null) {
                    writer.write(secondLine);
                    writer.newLine();
                    System.out.println("Записал строку: " + secondLine);
                }

                String line;
                while ((line = reader.readLine()) != null) {
                    try {
                        double number = Double.parseDouble(line);
                        if (number > 0) {
                            writer.write(String.valueOf(number));
                            writer.newLine();
                            System.out.println("Записал число: " + number);
                        }
                    } catch (NumberFormatException ignored) {
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
            writer.write(" Задание 2 Первая строка");
            writer.newLine();
            writer.write("Задание 2 Вторая строка");
            writer.newLine();
            writer.write("-3.5");
            writer.newLine();
            writer.write("7.2");
            writer.newLine();
            writer.write("0.0");
            writer.newLine();
            writer.write("4.1");
            writer.newLine();
            writer.write("-1.9");
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
