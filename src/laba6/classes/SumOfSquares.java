package laba6.classes;

public class SumOfSquares {
    // Статический метод для вычисления суммы квадратов без рекурсии
    public static long sumOfSquaresIterative(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // Статический метод для вычисления суммы квадратов с рекурсией
    public static long sumOfSquaresRecursive(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        if (n == 1) {
            return 1;
        }

        return n * n + sumOfSquaresRecursive(n - 1);
    }

    // Статический метод для проверки результата с использованием формулы
    public static long sumOfSquaresFormula(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n must be a positive integer");
        }

        return (long) n * (n + 1) * (2 * n + 1) / 6;
    }
}
