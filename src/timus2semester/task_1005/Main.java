package timus2semester.task_1005;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();


        int[] weights = new int[n];
        int totalWeight = 0;
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
            totalWeight += weights[i];
        }


        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << n); i++) {
            int sumSubset = 0;

            for (int j = 0; j < n; j++) {

                if ((i & (1 << j)) != 0) {
                    sumSubset += weights[j];
                }
            }


            int weight1 = sumSubset;
            int weight2 = totalWeight - sumSubset;


            minDifference = Math.min(minDifference, Math.abs(weight1 - weight2));
        }


        System.out.println(minDifference);
        scanner.close();
    }
}

