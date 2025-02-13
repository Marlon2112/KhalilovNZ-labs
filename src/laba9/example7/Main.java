package laba9.example7;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int n = 300; // Количество человек

        long startTime = System.nanoTime();
        simulateWithArrayList(n);
        long endTime = System.nanoTime();
        System.out.println("ArrayList время: " + (endTime - startTime) + " нс");

        startTime = System.nanoTime();
        simulateWithLinkedList(n);
        endTime = System.nanoTime();
        System.out.println("LinkedList время: " + (endTime - startTime) + " нс");
    }

    public static void simulateWithArrayList(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size(); // Переходим к следующему элементу
            list.remove(index); // Удаляем человека
        }
        System.out.println("Остался (ArrayList): " + list.get(0));
    }

    public static void simulateWithLinkedList(int n) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int index = 0;
        while (list.size() > 1) {
            index = (index + 1) % list.size(); // Переходим к следующему элементу
            list.remove(index); // Удаляем человека
        }
        System.out.println("Остался (LinkedList): " + list.get(0));
    }
}
