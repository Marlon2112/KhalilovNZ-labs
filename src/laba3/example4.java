package laba3;

import java.util.Scanner;

public class example4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first_number = in.nextInt();
        System.out.print("Введите второе число: ");
        int second_number = in.nextInt();
        IntegersRange.ForIntegers(first_number, second_number);
        IntegersRange.WhileIntegers(first_number, second_number);
    }
    static class IntegersRange{
        static void ForIntegers(int first_number, int second_number) {
            System.out.println("Оператор For");
            if (first_number < second_number) {
                for (;first_number <= second_number;first_number++) {
                    System.out.printf("%d, ", first_number);
                }
            } else if (first_number > second_number) {
                for (;second_number <= first_number;second_number++) {
                    System.out.printf("%d, ", second_number);
                }
            } else {
                System.out.printf("%d, ", first_number);
            }
        }
        static void WhileIntegers(int first_number, int second_number) {
            System.out.println("\nОператор while");
            if (first_number < second_number) {
                while (first_number <= second_number) {
                    System.out.printf("%d, ", first_number);
                    first_number++;
                }
            } else if (first_number > second_number) {
                while (first_number >= second_number) {
                    System.out.printf("%d, ", second_number);
                    second_number++;
                }
            } else {
                System.out.printf("%d, ", first_number);
            }
        }
    }
}