package timus2semester.task_1545;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<String> s = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            s.add(scanner.next());
        }

        char t = scanner.next().charAt(0);

        for (String str : s) {
            if (str.charAt(0) == t) {
                System.out.println(str);
            }
        }
    }
}