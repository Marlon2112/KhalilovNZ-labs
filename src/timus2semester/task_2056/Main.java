package timus2semester.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = 0;

        for (int i = 0; i < n; ++i) {
            int t = scanner.nextInt();
            s += t;
            if (t == 3) {
                System.out.println("None");
                return;
            }
        }

        if (s == n * 5) {
            System.out.println("Named");
        } else if ((double) s / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }
    }
}
