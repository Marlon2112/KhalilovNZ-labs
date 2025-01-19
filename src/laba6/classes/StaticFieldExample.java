package laba6.classes;

public class StaticFieldExample {
    // Закрытое статическое целочисленное поле с начальным значением 0
    private static int staticField = 0;

    // Статический метод для отображения текущего значения и увеличения на 1
    public static void displayAndIncrement() {
        System.out.println("Текущее значение staticField: " + staticField);
        staticField++;
    }
}