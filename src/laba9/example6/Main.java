package laba9.example6;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "Информатика");
        map.put(1, "и");
        map.put(2, "Вычислительная");
        map.put(3, "техника");
        map.put(4, "РИЗ");
        map.put(5, "сто");
        map.put(6, "сорок");
        map.put(7, "девятьсот");
        map.put(8, "шестнадцать");
        map.put(9, "У");
        map.put(10, "жопа");

        // Находим строки у которых ключ > 5
        System.out.println("Строки, где ключ > 5:");
        map.entrySet().stream()
                .filter(entry -> entry.getKey() > 5)
                .forEach(entry -> System.out.println(entry.getValue()));

        // Если ключ = 0 выводим строки через запятую
        if (map.containsKey(0)) {
            String result = map.get(0);
            System.out.println("Строки с ключом 0: " + result);
        }

        // Перемножаем все ключи
        int product = map.entrySet().stream()
                .filter(entry -> entry.getValue().length() > 5)
                .mapToInt(Map.Entry::getKey)
                .reduce(1, (a, b) -> a * b);

        System.out.println("Ключи где длина строки > 5: " + product);
    }
}
