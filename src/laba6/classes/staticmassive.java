package laba6.classes;

import java.util.Arrays;

public class staticmassive {

    // Статический метод для получения нового массива с заданным количеством начальных элементов
    public static int[] takeInitialElements(int[] array, int count) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        // Если count больше длины массива, возвращаем копию исходного массива
        if (count >= array.length) {
            return Arrays.copyOf(array, array.length);
        }

        // Иначе возвращаем новый массив с первыми count элементами
        return Arrays.copyOf(array, count);
    }
}
