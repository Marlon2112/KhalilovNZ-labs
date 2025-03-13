package timus2semester.task_1585;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus2semester/task_1585/input.txt";
        BufferedReader br = new BufferedReader(new FileReader(inputFileName));
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        int n = Integer.parseInt(br.readLine());
        int k1 = 0, k2 = 0, k3 = 0;

        for (int i = 0; i < n; ++i) {
            String[] input = br.readLine().split(" ");
            String s = input[0];

            if (s.equals("Emperor")) {
                ++k1;
            } else if (s.equals("Little")) {
                ++k2;
            } else {
                ++k3;
            }
        }

        if (k1 > k2 && k1 > k3) {
            System.out.println("Emperor Penguin");
        } else if (k2 > k1 && k2 > k3) {
            System.out.println("Little Penguin");
        } else if (k3 > k1 && k3 > k2) {
            System.out.println("Macaroni Penguin");
        }
    }
}