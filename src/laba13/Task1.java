package laba13;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        try {
            System.out.println("Введите элементы массива (через пробел):");
            String[] input = scanner.nextLine().split(" ");
            for (String s : input) {
                int val = Integer.parseInt(s);
                list.add(val);
            }

            int sum = 0, count = 0;
            for (int x : list) {
                if (x > 0) {
                    sum += x;
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Нет положительных элементов!");
            }

            System.out.println("Среднее = " + (sum / (double) count));
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введено не число.");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Завершение работы.");
        }
    }
}
