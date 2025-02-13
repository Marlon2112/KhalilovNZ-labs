package laba9.example1;

public class Main {
    // Пример 1: вывод последовательности
    public static void printSequence(int x) {
        if (x >= 20) return;
        System.out.println(x);
        printSequence(2 * x + 1);
    }

    // Пример 2: обратный вывод
    public static void printReverseSequence(int x) {
        if (x >= 20) return;
        printReverseSequence(2 * x + 1);
        System.out.println(x);
    }

    // Пример 3: вывод до и после рекурсии
    public static void printBeforeAfter(int x) {
        System.out.println("До: " + x);
        if (x > 0) printBeforeAfter(x - 1);
        System.out.println("После: " + x);
    }
    //Код для примера 4 (факториал)
    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        System.out.println("Пример 1:");
        printSequence(1);
        System.out.println("\nПример 2:");
        printReverseSequence(1);
        System.out.println("\nПример 3:");
        printBeforeAfter(3);
        System.out.println("\nПример 4: \n5! = " + factorial(5)); // 120
        System.out.println("\nПример 5: \nF(5) = " + fibonacci(5)); // 5
    }
}
