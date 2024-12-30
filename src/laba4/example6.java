package laba4;

import java.util.Random;

public class example6 {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int cols = 6; // Количество столбцов

        // Создаем и инициализируем двумерный массив
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

        // Генерируем случайные индексы для удаления строки и столбца
        int removeRow = random.nextInt(rows); // Индекс строки для удаления
        int removeCol = random.nextInt(cols); // Индекс столбца для удаления
        System.out.println("\nУдаляем строку: " + removeRow + ", удаляем столбец: " + removeCol);

        // Создаем новый массив меньшего размера
        int[][] newArray = new int[rows - 1][cols - 1];

        // Заполняем новый массив, исключая удаленные строку и столбец
        for (int i = 0, newI = 0; i < rows; i++) {
            if (i == removeRow) continue; // Пропускаем удаляемую строку

            for (int j = 0, newJ = 0; j < cols; j++) {
                if (j == removeCol) continue; // Пропускаем удаляемый столбец

                newArray[newI][newJ] = originalArray[i][j];
                newJ++;
            }
            newI++;
        }

        // Выводим новый массив
        System.out.println("\nМассив после удаления строки и столбца:");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
