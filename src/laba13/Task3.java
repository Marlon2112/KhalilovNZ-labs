package laba13;

import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Byte> bytes = new ArrayList<>();

        try {
            System.out.println("Введите элементы массива типа byte (через пробел):");
            String[] input = scanner.nextLine().split(" ");

            for (String s : input) {
                byte b = Byte.parseByte(s);
                bytes.add(b);
            }

            int sum = 0;
            for (byte b : bytes) {
                sum += b;
            }
            System.out.println("Сумма: " + sum);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: некорректный ввод (не число или вне диапазона byte).\n" + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Завершение работы.");
        }
    }
}
