package laba6;

import static laba6.classes.MinMaxArray.*;

public class example10 {
    public static void main(String[] args) {
        int[] result = findMinMax(10, 20, 30, 5, 15, 25);
        System.out.println("Минимальное и Максимальное: " + result[0] + ", " + result[1]); // Вывод: Min and Max: 5, 30
    }
}
