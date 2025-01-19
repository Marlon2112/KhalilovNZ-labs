package laba6;

import static laba6.classes.NumberUtils.*;

public class example3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Max: " + findMax(numbers)); // Вывод: Max: 50
        System.out.println("Min: " + findMin(numbers)); // Вывод: Min: 10
        System.out.println("Average: " + findAverage(numbers)); // Вывод: Average: 30.0

        // Использование с произвольным количеством аргументов
        System.out.println("Max: " + findMax(1, 2, 3, 4, 5));
        System.out.println("Min: " + findMin(1, 2, 3, 4, 5));
        System.out.println("Average: " + findAverage(1, 2, 3, 4, 5));
    }
}
