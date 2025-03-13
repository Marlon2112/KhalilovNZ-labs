package laba10.example4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        String filePath = "src/laba10/example4/example4bad.xlsx";

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            XSSFWorkbook workbook = null;
            try {
                workbook = new XSSFWorkbook(inputStream); // Попытка прочитать файл
            } catch (IOException e) {
                // Проверка на ошибку, которая возникает при поврежденном или некорректном файле
                if (e.getMessage().contains("No valid entries or contents found") || e.getMessage().contains("this is not a valid OOXML")) {
                    System.out.println("Ошибка при чтении файла: Файл поврежден или не является .xlsx.");
                } else {
                    System.out.println("Ошибка при чтении файла: " + e.getMessage());
                }
                return;
            }

            // Проверка на наличие листа с заданным именем
            String sheetName = "Sheet0фыа";
            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Ошибка: Лист с именем '" + sheetName + "' не найден.");
                return;
            }

            // Чтение данных из листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            workbook.close(); // Закрытие книги
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка: Файл не найден. Проверьте путь: " + filePath);
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Неизвестная ошибка: " + e.getMessage());
        }
    }
}