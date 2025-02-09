package timus1semester.task_1910;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus1semester/task_1910/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;
        BufferedReader bufferedReader =
                oj ? new BufferedReader(new InputStreamReader(System.in)) :
                        new BufferedReader(new FileReader(inputFileName));
        PrintWriter out = new PrintWriter(System.out);

        int size = Integer.parseInt(bufferedReader.readLine());

        String[] strings = bufferedReader.readLine().split(" ");

        int[] sums = new int[size - 2];

        for (int i = 0; i < sums.length; i++) {
            sums[i] = Integer.parseInt(strings[i])
                    + Integer.parseInt(strings[i + 1])
                    + Integer.parseInt(strings[i + 2]);
        }

        int maxSum = 0;
        int middleIndex = 0;

        for (int i = 0; i < sums.length; i++) {
            if (sums[i] > maxSum) {
                maxSum = sums[i];
                middleIndex = i + 1;
            }
        }

        out.println(maxSum + " " + (middleIndex + 1));
        out.flush();
    }
}