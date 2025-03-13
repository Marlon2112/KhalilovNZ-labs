package timus2semester.task_1079;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> m = new ArrayList<>();

        a.add(0);
        a.add(1);
        m.add(0);
        m.add(1);

        int mx = 1;

        for (int i = 2; i < 100000; ++i) {
            if (i % 2 == 0) {
                a.add(a.get(i / 2));
                m.add(mx);
            } else {
                a.add(a.get(i / 2) + a.get(i / 2 + 1));
                mx = Math.max(mx, a.get(i));
                m.add(mx);
            }
        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            if (t == 0) {
                break;
            }
            System.out.println(m.get(t));
        }
    }
}