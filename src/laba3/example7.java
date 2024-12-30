package laba3;

public class example7 {
    public static void main(String[] args) {
        int size = 10; // Размер массива
        char[] charArray = new char[size];

        // Заполняем массив буквами через одну, начиная с 'a'
        for (int i = 0; i < size; i++) {
            charArray[i] = (char) ('a' + i * 2);
        }

        // Отобразить массив в прямом порядке
        System.out.println("Массив в прямом порядке:");
        for (int i = 0; i < size; i++) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();

        // Отобразить массив в обратном порядке
        System.out.println("Массив в обратном порядке:");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(charArray[i] + " ");
        }
        System.out.println();
    }
}
