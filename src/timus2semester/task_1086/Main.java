package timus2semester.task_1086;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int k = scanner.nextInt();
        int[] numbers = new int[k];


        for (int i = 0; i < k; i++) {
            numbers[i] = scanner.nextInt();
        }


        int maxN = findMax(numbers);

        // Генерируем первые n простых чисел с использованием решета Эратосфена
        List<Integer> primes = generatePrimes(maxN);


        for (int n : numbers) {
            System.out.println(primes.get(n - 1));
        }

        scanner.close();
    }


    private static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Генерируем список первых n простых чисел с использованием решета Эратосфена
    private static List<Integer> generatePrimes(int n) {
        int limit = estimateUpperBound(n);
        boolean[] isPrime = new boolean[limit + 1];
        // Инициализация массива решета
        for (int i = 2; i <= limit; i++) {
            isPrime[i] = true;
        }
        // Применение алгоритма решета Эратосфена
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }


        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit && primes.size() < n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }


    private static int estimateUpperBound(int n) {
        if (n <= 6) {
            return 15;

        }
        return (int) (n * (Math.log(n) + Math.log(Math.log(n))));
    }
}
