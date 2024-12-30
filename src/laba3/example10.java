package laba3;

import java.util.Arrays;
import java.util.Random;

public class example10 {
    public static void main(String[] args) {
        // Создаем массив целых чисел
        int[] array = new int[10];

        // Создаем объект класса Random для генерации случайных чисел
        Random random = new Random();

        // Заполняем массив случайными числами от 0 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // Выводим массив до сортировки
        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        // Сортируем массив в порядке убывания
        Arrays.sort(array);

        // Инвертируем массив для получения обратного порядка (от большего к меньшему)
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        // Выводим массив после сортировки
        System.out.println("Массив после сортировки (по убыванию): " + Arrays.toString(array));
    }
}
