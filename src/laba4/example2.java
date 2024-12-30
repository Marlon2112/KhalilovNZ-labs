package laba4;

public class example2 {
    public static void main(String[] args) {
        int height = 10; // Высота треугольника (количество строк)

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                // Печатаем звездочку
                System.out.print("*");
            }
            // Переход на следующую строку
            System.out.println();
        }
    }
}
