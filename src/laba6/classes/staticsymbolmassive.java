package laba6.classes;
import java.util.Arrays;

public class staticsymbolmassive {

    // Статический метод для преобразования символьного массива в массив кодов символов
    public static int[] convertstaticsymbolmassive(char[] charArray) {
        if (charArray == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        int[] codeArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            codeArray[i] = (int) charArray[i];
        }
        return codeArray;
    }
}
