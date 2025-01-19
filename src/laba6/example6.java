package laba6;
import java.util.Arrays;

import static laba6.classes.staticmassive.*;
public class example6 {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        // Пример 1: Берем первые 3 элемента
        int[] result1 = takeInitialElements(originalArray, 3);
        System.out.println("Результат 1: " + Arrays.toString(result1)); // Вывод: [1, 2, 3]

        // Пример 2: Количество элементов больше длины массива
        int[] result2 = takeInitialElements(originalArray, 10);
        System.out.println("Результат 2: " + Arrays.toString(result2)); // Вывод: [1, 2, 3, 4, 5]

        // Пример 3: Количество элементов равно длине массива
        int[] result3 = takeInitialElements(originalArray, 5);
        System.out.println("Результат 3: " + Arrays.toString(result3)); // Вывод: [1, 2, 3, 4, 5]
    }
}
