package laba3;

import java.util.Random;

public class example9 {
    public static void main(String[] args) {
        int n = 10; // Размер массива
        int[] array = new int[n];
        Random random = new Random();

        // Заполнение массива случайными числами и вывод его на экран
        System.out.println("Элементы массива:");
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // Случайные числа от 0 до 99
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Поиск минимального значения в массиве
        int minValue = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        // Вывод минимального значения и его индексов
        System.out.println("Минимальное значение: " + minValue);
        System.out.print("Индексы минимального значения: ");
        for (int i = 0; i < n; i++) {
            if (array[i] == minValue) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
