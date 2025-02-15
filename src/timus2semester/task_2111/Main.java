package timus2semester.task_2111;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        long y = 0;
        long z = 0;
        int[] array1 = new int[x];

        for (int i = 0; i < x; i++) {
            array1[i] = a.nextInt();
            y += array1[i];

            if (i == 1 && array1[i] < array1[i - 1]) {
                int tmp = array1[i];
                array1[i] = array1[i - 1];
                array1[i - 1] = tmp;
            }
        }

        for (int i = array1.length - 1; i > -1; i--) {
            z += array1[i] * y;
            y -= array1[i];
            z += array1[i] * y;
        }

        System.out.println(z);
    }
}






