package timus2semester.task_1263;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < m; ++i) {
            int t = scanner.nextInt();
            a[t - 1]++;
        }

        for (int i = 0; i < a.length; ++i) {
            double percentage = (double) a[i] / m * 100;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}
