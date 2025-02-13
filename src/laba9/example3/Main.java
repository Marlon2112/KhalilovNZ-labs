package laba9.example3;

import java.util.Scanner;

public class Main {
    // Рекурсивный метод для чтения массива
    static int[] readArray(int size, int index, int[] arr, Scanner scanner) {
        // Базовый случай: если индекс достиг размера массива, возвращаем массив
        if (index == size) return arr;

        System.out.print("Введите элемент " + (index + 1) + ": ");
        arr[index] = scanner.nextInt(); // Считываем элемент
        return readArray(size, index + 1, arr, scanner); // Рекурсивно вызываем метод для следующего элемента
    }

    // Рекурсивный метод для печати массива
    static void printArray(int[] arr, int index) {
        // Базовый случай: если индекс превышает длину массива, выходим из метода
        if (index == arr.length) return;

        System.out.print(arr[index] + " "); // Печатаем текущий элемент
        printArray(arr, index + 1); // Рекурсивно вызываем метод для следующего элемента
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Размер массива: ");
        int size = in.nextInt(); // Считываем размер массива

        int[] arr = new int[size]; // Создаем массив указанного размера
        readArray(size, 0, arr, in); // Читаем элементы массива
        System.out.print("Элементы массива: ");
        printArray(arr, 0); // Печатаем элементы массива
    }
}
