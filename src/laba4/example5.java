package laba4;

import java.util.Random;

public class example5 {
    public static void main(String[] args) {
        int rows = 3; // Количество строк
        int cols = 5; // Количество столбцов

        // Создаем и заполняем двумерный массив случайными числами
        int[][] originalArray = new int[rows][cols];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(100); // Случайное число от 0 до 99
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }

        // Создаем новый массив для транспонированного результата
        int[][] transposedArray = new int[cols][rows];

        // Транспонируем массив
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedArray[j][i] = originalArray[i][j];
            }
        }

        // Выводим транспонированный массив
        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transposedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
