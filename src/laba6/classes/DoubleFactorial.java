package laba6.classes;

public class DoubleFactorial {
    // Статический метод для вычисления двойного факториала без рекурсии
    public static long doubleFactorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        long result = 1;
        for (int i = n; i > 0; i -= 2) {
            result *= i;
        }
        return result;
    }

    // Статический метод для вычисления двойного факториала с рекурсией
    public static long doubleFactorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * doubleFactorialRecursive(n - 2);
    }
}
