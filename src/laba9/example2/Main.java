package laba9.example2;

import java.util.Scanner;

public class Main {

    // Метод для перевода целого числа в двоичную систему
    public static String toBinary(int n) {
        if (n == 0) return "";
        return toBinary(n / 2) + (n % 2); // Рекурсивный вызов
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = in.nextInt(); // Считываем число

        if (number == 0) {
            System.out.println("Двоичное представление: 0"); // Обработка случая, когда число 0
        } else {
            System.out.println("Двоичное представление: " + toBinary(number)); // Вывод двоичное представление
        }

        in.close(); // Закрываем сканер
    }
}