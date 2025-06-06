package laba11;

import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {

        String string = "Напишите функцию, которая принимает на вход список" +
                " строк и возвращает новый список, содержащий только те строки," +
                " которые содержат заданную подстроку.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования : " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        String substring = "тр";
        List<String> stringsAfter = filterStringsBySubstring(strings, substring);

        System.out.println("\n" + "Строка после преобразования : " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsBySubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}