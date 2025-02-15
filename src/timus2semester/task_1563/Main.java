package timus2semester.task_1563;

import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "src/timus2semester/task_1563/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        BufferedReader reader;

        try {
            if (oj) {
                reader = new BufferedReader(new InputStreamReader(System.in));
            } else {
                reader = new BufferedReader(new FileReader(inputFileName));
            }

            int n = Integer.parseInt(reader.readLine());

            HashSet<String> strSet = new HashSet<>();

            for (int i = 0; i < n; i++) {
                String tempStr = reader.readLine();
                strSet.add(tempStr);
            }

            System.out.println(n - strSet.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

