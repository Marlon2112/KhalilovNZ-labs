package laba3;

import java.util.Scanner;

public class example3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество числе Фибоначи: ");
        int number = in.nextInt();
        int first_number = 1;
        int second_number = 1;
        int next_number = 0;
        Fibonacci.ForFibanacci(number, first_number, second_number, next_number);
        Fibonacci.WhileFibanacci(number, first_number, second_number, next_number);
    }
    static class Fibonacci {
        static void ForFibanacci(int number, int first_number, int second_number, int next_number) {
            System.out.println("Оператор For");
            System.out.printf("%d, ", first_number);
            System.out.printf("%d, ", second_number);
            for (int i = 2; i < number; i++) {
                next_number = first_number + second_number;
                first_number = second_number;
                second_number = next_number;
                System.out.printf("%d, ", next_number);
            }
        }
        static void WhileFibanacci(int number, int first_number, int second_number, int next_number) {
            int count = 2;
            System.out.println("\nОператор While");
            System.out.printf("%d, ", first_number);
            System.out.printf("%d, ", second_number);
            while (number > count) {
                next_number = first_number + second_number;
                first_number = second_number;
                second_number = next_number;
                System.out.printf("%d, ", next_number);
                count++;
            }
        }
    }
}