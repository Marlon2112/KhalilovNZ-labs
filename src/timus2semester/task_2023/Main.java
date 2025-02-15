package timus2semester.task_2023;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = 0;
        String b;
        int pos = 1;

        for (int i = 0; i < n; i++) {
            b = scanner.next();
            char firstChar = b.charAt(0);

            if (firstChar == 'A' || firstChar == 'P' || firstChar == 'O' || firstChar == 'R') {
                s += Math.abs(pos - 1);
                pos = 1;
            } else if (firstChar == 'B' || firstChar == 'M' || firstChar == 'O' || firstChar == 'S') {
                s += Math.abs(pos - 2);
                pos = 2;
            } else {
                s += Math.abs(pos - 3);
                pos = 3;
            }
        }

        System.out.println(s);
        scanner.close();
    }
}

