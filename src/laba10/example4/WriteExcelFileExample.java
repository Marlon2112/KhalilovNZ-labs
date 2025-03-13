package laba10.example4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {

        //Создаем книгу excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        //Создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet();

        //Записываем данные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Халилов Н.З.");
        dataRow1.createCell(2).setCellValue(500.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("ЦПУ: Intel core i5, ОЗУ: 32ГБ");
        dataRow2.createCell(2).setCellValue(32000.0);

        Row dataRow3 = sheet.createRow(3);
        dataRow3.createCell(0).setCellValue("Компьютер");
        dataRow3.createCell(1).setCellValue("ЦПУ: AMD Ryzen 5600, ОЗУ: 32ГБ");
        dataRow3.createCell(2).setCellValue(31000.0);

        String filepath = "src/laba10/example4/example4.xlsx";
        FileOutputStream fileOut = new FileOutputStream(filepath);
        workbook.write(fileOut);
        workbook.close();
        fileOut.close();

        System.out.println("Данные записаны в файл" + filepath);
    }
}
