package laba13;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        try {
            System.out.print("Введите номер столбца: ");
            int col = Integer.parseInt(scanner.nextLine());

            for (int[] row : matrix) {
                System.out.println(row[col]);
            }

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: столбца с таким номером не существует.");
        } finally {
            scanner.close();
            System.out.println("Завершение работы.");
        }
    }
}
