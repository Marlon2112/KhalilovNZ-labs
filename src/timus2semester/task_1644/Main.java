package timus2semester.task_1644;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int minSatisfied = 10;
        int maxHungry = 2;

        for (int i = 0; i < n; i++) {
            int amount = in.nextInt();
            String status = in.next();

            if (status.equals("hungry")) {
                if (amount > maxHungry) {
                    maxHungry = amount;
                }
            } else if (status.equals("satisfied")) {
                if (amount < minSatisfied) {
                    minSatisfied = amount;
                }
            }
        }

        if (maxHungry >= minSatisfied) {
            System.out.println("Inconsistent");
        } else {
            System.out.println(minSatisfied);
        }
    }
}

