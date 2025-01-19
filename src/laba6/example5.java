package laba6;

import static laba6.classes.SumOfSquares.*;

public class example5 {
    public static void main(String[] args) {
        int n = 5;

        System.out.println("суммы квадратов без рекурсии:");
        System.out.println("Сумма квадратов " + n + " = " + sumOfSquaresIterative(n)); // Вывод: 55

        System.out.println("суммы квадратов с рекурсией:");
        System.out.println("Сумма квадратов " + n + " = " + sumOfSquaresRecursive(n)); // Вывод: 55

        System.out.println("результат с использованием формулы:");
        System.out.println("Сумма квадратов " + n + " = " + sumOfSquaresFormula(n)); // Вывод: 55
    }
}
