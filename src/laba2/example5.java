package laba2;

import java.util.Scanner;

public class example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод числа
        System.out.print("Введите число: ");
        long number = in.nextLong();
        //деление на 1000
        long thousand = Math.abs(number) / 1000;
        System.out.println("Тысяч в введенном числе: " + thousand);

    }
}
