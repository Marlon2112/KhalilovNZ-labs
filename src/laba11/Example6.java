package laba11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Example6 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Список до: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(1000));
            System.out.println(integers.get(i));
        }

        int divisor = 3;

        List<Integer> integersAfter = filterDivisible(integers, divisor);

        System.out.println("\n" + "Список после фильтрации (делится на " + divisor + "): " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterDivisible(List<Integer> list, int divisor) {
        return list.stream()
                .filter(x -> x % divisor == 0)
                .collect(Collectors.toList());
    }
}
