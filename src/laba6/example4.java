package laba6;
import laba6.classes.DoubleFactorial;

import static laba6.classes.DoubleFactorial.*;

public class example4 {
    public static void main(String[] args) {
        int number1 = 6;
        int number2 = 5;

        System.out.println("без рекурсии:");
        System.out.println(number1 + "!! = " + doubleFactorialIterative(number1)); // Вывод: 6!! = 48
        System.out.println(number2 + "!! = " + doubleFactorialIterative(number2)); // Вывод: 5!! = 15

        System.out.println("с рекурсией:");
        System.out.println(number1 + "!! = " + doubleFactorialRecursive(number1)); // Вывод: 6!! = 48
        System.out.println(number2 + "!! = " + doubleFactorialRecursive(number2)); // Вывод: 5!! = 15
    }
}