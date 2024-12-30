package laba4;

public class example3 {
    public static void main(String[] args) {
        int rows = 6;  // Количество строк
        int cols = 10; // Количество столбцов

        // Создаем двумерный массив
        int[][] rectangle = new int[rows][cols];

        // Заполняем массив цифрой 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rectangle[i][j] = 2;
            }
        }

        // Выводим массив в консоль
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(rectangle[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку
        }
    }
}
