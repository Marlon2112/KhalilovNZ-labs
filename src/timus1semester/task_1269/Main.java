package timus1semester.task_1269;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final int MAX_CHARS = 1 << 16; // 65536 символов

    public static void main(String[] args) throws IOException {
        String inputFileName = "src/timus1semester/task1880/input.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE") != null;

        try (BufferedReader reader = oj ? new BufferedReader(new InputStreamReader(System.in)) : new BufferedReader(new FileReader(inputFileName))) {
            String line;

            while ((line = reader.readLine()) != null && line.length() <= MAX_CHARS) {
                processInput(line);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void processInput(String line) {
        char[] chars = line.toCharArray();
        if (chars.length > MAX_CHARS) {
            throw new IllegalArgumentException("Line too long");
        }

        int count[] = new int[MAX_CHARS];
        for (char c : chars) {
            count[c]++;
        }

        StringBuilder result = new StringBuilder();
        result.append("Пример\n");
        for (int i = 0; i < count.length; ++i) {
            if (count[i] == 0) continue;
            result.append((char) i).append(' ').append(count[i]).append('\n');
        }
        System.out.println(result.toString());
    }
}