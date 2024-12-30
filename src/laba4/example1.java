package laba4;

public class example1 {
    public static void main(String[] args) {
        int width = 23; // ширина в колонках
        int height = 11; // высота в строках

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    // Печатаем границы прямоугольника
                    System.out.print("*");
                } else {
                    // Печатаем пробелы внутри прямоугольника
                    System.out.print(" ");
                }
            }
            System.out.println(); // Переход на следующую строку
        }
    }
}
