package laba4;

public class example4 {
    public static void main(String[] args) {
        int size = 6; // Высота треугольника (количество строк)

        // Создаем двумерный массив
        int[][] triangle = new int[size][];

        // Заполняем массив
        for (int i = 0; i < size; i++) {
            // Каждая строка массива имеет длину, равную номеру строки + 1
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = 1; // Заполняем массив значениями, например, цифрой 1
            }
        }

        // Выводим массив в виде прямоугольного треугольника
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку
        }
    }
}
