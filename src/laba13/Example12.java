package laba13;

public class Example12 {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo <= 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
        System.out.println("ок");
    }

    public static void main(String[] args) {

        //m("Тестовая строка", 0.000001); // Это вызовет исключение "Неверное число"


         m("Тестовая строка", 0.002); // Это пройдет без исключений
    }
}