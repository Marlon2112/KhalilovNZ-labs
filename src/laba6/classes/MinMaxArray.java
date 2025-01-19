package laba6.classes;

public class MinMaxArray {

    // Статический метод для нахождения минимального и максимального значения среди аргументов
    public static int[] findMinMax(int... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("At least one number must be provided");
        }

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return new int[]{min, max};
    }
}
