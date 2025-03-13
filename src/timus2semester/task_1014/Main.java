package timus2semester.task_1014;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(10);
            return;
        }

        if (n == 1) {
            System.out.println(1);
            return;
        }

        long[] a = new long[10];
        for (int i = 0; i < 10; ++i) {
            a[i] = 0;
        }

        for (int i = 9; i > 1; --i) {
            while (n % i == 0) {
                n /= i;
                a[i]++;
            }
        }

        if (n == 1) {
            for (int i = 2; i <= 9; ++i) {
                while (a[i] > 0) {
                    a[i]--;
                    System.out.print(i);
                }
            }
        } else {
            System.out.println(-1);
        }
    }
}
