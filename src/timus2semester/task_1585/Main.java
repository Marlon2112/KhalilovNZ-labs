package timus2semester.task_1585;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String inputFileName = "src/timus2semester/task_1585/input.txt";


        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try (BufferedReader reader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inputFileName))) {

            int n = Integer.parseInt(reader.readLine());


            Map<String, Integer> penguinCounts = new HashMap<>();
            penguinCounts.put("Emperor Penguin", 0);
            penguinCounts.put("Macaroni Penguin", 0);
            penguinCounts.put("Little Penguin", 0);


            for (int i = 0; i < n; i++) {
                String penguin = reader.readLine();
                penguinCounts.put(penguin, penguinCounts.get(penguin) + 1);
            }


            String mostPopularPenguin = "";
            int maxCount = 0;

            for (Map.Entry<String, Integer> entry : penguinCounts.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    mostPopularPenguin = entry.getKey();
                }
            }


            System.out.println(mostPopularPenguin);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
