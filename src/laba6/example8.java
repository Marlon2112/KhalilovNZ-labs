package laba6;

import java.util.Arrays;

import static laba6.classes.CharToCodeArray.*;

public class example8 {
    public static void main(String[] args) {
        char[] inputArray = {'H', 'e', 'l', 'l', 'o', '!', '1', '2', '3'};

        // Преобразование массива символов в массив кодов символов
        int[] result = convertToCodeArray(inputArray);

        System.out.println("Массив символов: " + Arrays.toString(inputArray));
        System.out.println("Код символов: " + Arrays.toString(result)); // Пример: [72, 101, 108, 108, 111, 33, 49, 50, 51]

        // Пример: Вычисление среднего значения для массива кодов символов
        double average = calculateAverage(result);
        System.out.println("Среднее значения массива кода символов: " + average);
    }
}
