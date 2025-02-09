package timus1semester.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] dp = new int[N + 1];

        dp[1] = 2; // WR и RW
        if (N > 1) {
            dp[2] = 2; // WRW и RWR
        }

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[N]);
        System.out.flush();
    }
}
