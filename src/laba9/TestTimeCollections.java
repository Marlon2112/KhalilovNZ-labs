package laba9;

import java.util.*;

public class TestTimeCollections {
    public static void main(String[] args) {
        int n = 100000; // Количество элементов

        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> treeSet = new TreeSet<>();
        Map<Integer, Integer> linkedHashMap = new LinkedHashMap<>();

        // Заполняем коллекции n элементами
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
            treeSet.add(i);
            linkedHashMap.put(i, i);
        }

        // Заголовок таблицы
        System.out.println("Таблица 2. Сравнение времени выполнения операции удаления");
        System.out.printf("%-15s %-20s %-20s %-20s%n", "Коллекция", "В начале (нс)", "В середине (нс)", "В конце (нс)");

        // Сравнение для ArrayList
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "ArrayList",
                getRemovalTime(arrayList, 0),
                getRemovalTime(arrayList, n / 2),
                getRemovalTime(arrayList, n - 1));

        // Сравнение для TreeSet
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "TreeSet",
                getRemovalTimeFromTreeSet(treeSet, 0),
                getRemovalTimeFromTreeSet(treeSet, n / 2),
                getRemovalTimeFromTreeSet(treeSet, n - 1));

        // Сравнение для LinkedHashMap
        System.out.printf("%-15s %-20d %-20d %-20d%n",
                "LinkedHashMap",
                getRemovalTimeFromLinkedHashMap(linkedHashMap, 0),
                getRemovalTimeFromLinkedHashMap(linkedHashMap, n / 2),
                getRemovalTimeFromLinkedHashMap(linkedHashMap, n - 1));
    }

    private static long getRemovalTime(List<Integer> list, int index) {
        long start = System.nanoTime();
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRemovalTimeFromTreeSet(Set<Integer> set, int value) {
        long start = System.nanoTime();
        set.remove(value); // Удаляем элемент
        long end = System.nanoTime();
        return end - start;
    }

    private static long getRemovalTimeFromLinkedHashMap(Map<Integer, Integer> map, int key) {
        long start = System.nanoTime();
        map.remove(key);
        long end = System.nanoTime();
        return end - start;
    }
}
