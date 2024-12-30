package laba4;

public class example7 {
    public static void main(String[] args) {
        int rows = 5; // Количество строк
        int cols = 4; // Количество столбцов

        // Создаем двумерный массив
        int[][] array = new int[rows][cols];

        int num = 1; // Число для заполнения массива
        int startRow = 0, endRow = rows - 1;
        int startCol = 0, endCol = cols - 1;

        // Заполнение "змейкой"
        while (startRow <= endRow && startCol <= endCol) {
            // Слева направо (по строке)
            for (int col = startCol; col <= endCol; col++) {
                array[startRow][col] = num++;
            }
            startRow++;

            // Снизу вверх (по столбцу)
            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    array[row][endCol] = num++;
                }
                endCol--;
            }

            // Слева направо (по строке)
            if (startRow <= endRow) {
                for (int col = startCol; col <= endCol; col++) {
                    array[startRow][col] = num++;
                }
                startRow++;
            }

            // Снизу вверх (по столбцу)
            if (startCol <= endCol) {
                for (int row = endRow; row >= startRow; row--) {
                    array[row][startCol] = num++;
                }
                startCol++;
            }
        }

        // Вывод массива
        System.out.println("Массив, заполненный змейкой:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%3d ", array[i][j]);
            }
            System.out.println();
        }
    }
}
