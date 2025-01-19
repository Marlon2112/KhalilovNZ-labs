package laba6.classes;
import java.util.Arrays;
public class NumberUtils {
    // Метод для нахождения максимального значения
    public static int findMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }
        return Arrays.stream(numbers).max().orElseThrow();
    }

    // Метод для нахождения минимального значения
    public static int findMin(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }
        return Arrays.stream(numbers).min().orElseThrow();
    }

    // Метод для вычисления среднего значения
    public static double findAverage(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("No numbers provided");
        }
        return Arrays.stream(numbers).average().orElseThrow();
    }
}
