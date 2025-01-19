package laba6.classes;

import java.util.Arrays;

public class CharToCodeArray {
    // Статический метод для преобразования символьного массива в массив кодов символов
    public static int[] convertToCodeArray(char[] charArray) {
        if (charArray == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int[] codeArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            codeArray[i] = (int) charArray[i];
        }
        return codeArray;
    }

    // Статический метод для вычисления среднего значения элементов целочисленного массива
    public static double calculateAverage(int[] intArray) {
        if (intArray == null || intArray.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty");
        }

        double sum = 0;
        for (int num : intArray) {
            sum += num;
        }
        return sum / intArray.length;
    }

    // Статический метод для попарной замены элементов массива для 9 задания
    public static void swapPairs(char[] charArray) {
        if (charArray == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int length = charArray.length;
        for (int i = 0; i < length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[length - 1 - i];
            charArray[length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        char[] inputArray = {'H', 'e', 'l', 'l', 'o', '!', '1', '2', '3'};

        // Преобразование массива символов в массив кодов символов
        int[] result = convertToCodeArray(inputArray);

        // Вывод результата
        System.out.println("Character array: " + Arrays.toString(inputArray));
        System.out.println("Code array: " + Arrays.toString(result)); // Пример: [72, 101, 108, 108, 111, 33, 49, 50, 51]

        // Пример: Вычисление среднего значения для массива кодов символов
        double average = calculateAverage(result);
        System.out.println("Average of code array: " + average);

        // Пример: Попарная замена элементов массива
        swapPairs(inputArray);
        System.out.println("Swapped character array: " + Arrays.toString(inputArray)); // Пример: ['3', '2', '1', '!', 'o', 'l', 'l', 'e', 'H']
    }
}
