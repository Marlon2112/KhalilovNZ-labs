package laba3;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = 0;

        // Ввод размера массива с обработкой возможных ошибок
        while (true) {
            try {
                System.out.print("Введите размер массива: ");
                size = Integer.parseInt(in.nextLine());

                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным числом. Попробуйте снова.");
                    continue;
                }

                break;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
            }
        }

        // Создание и заполнение массива
        int[] array = new int[size];
        int number = 2;  // Начинаем с числа 2

        for (int i = 0; i < size; i++) {
            array[i] = number;
            number += 5;  // Увеличиваем на 5 для следующего числа, делящегося на 5 с остатком 2.
        }

        // Вывод массива
        System.out.println("Полученный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
