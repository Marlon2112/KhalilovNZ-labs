package timus2semester.task_1082;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] result = generateArray(N);

        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] generateArray(int N) {
        int[] array = new int[N];


        int base = 1;
        for (int i = 0; i < N; i++) {
            array[i] = base;
            base += 6;
        }

        return array;
    }
}
