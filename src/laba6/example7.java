package laba6;

import java.util.Arrays;

import static laba6.classes.staticsymbolmassive.*;

public class example7 {
    public static void main(String[] args) {
        char[] charArray = {'A', 'b', 'C', '1', '@'};

        // Пример: Преобразование символьного массива в массив кодов символов
        int[] codeArray = convertstaticsymbolmassive(charArray);
        System.out.println("Массив кодов: " + Arrays.toString(codeArray)); // Вывод: [65, 98, 67, 49, 64]
    }
}
