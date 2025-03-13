package timus2semester.task_1001;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Double> stack = new Stack<>();

        while (scanner.hasNextDouble()) {
            double n = scanner.nextDouble();
            stack.push(Math.sqrt(n));
        }

        while (!stack.isEmpty()) {
            System.out.printf("%.6f%n", stack.pop());
        }
    }
}