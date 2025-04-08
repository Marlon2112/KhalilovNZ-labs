package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки (для завершения введите пустую строку):");
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            strings.add(input);
        }

        System.out.println("\nСписок до фильтрации:\n");
        for (String s : strings) {
            System.out.println(s);
        }

        List<String> filteredStrings = filterOnlyLetters(strings);

        System.out.println("\nСписок после фильтрации (только строки, содержащие только буквы):\n");
        for (String s : filteredStrings) {
            System.out.println(s);
        }
    }

    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-ЯёЁ]+")) // Проверяем, что строка содержит только буквы (латиница + кириллица)
                .collect(Collectors.toList());
    }
}
