package laba5.classes;

public class CharIntExample {
    // Символьное и целочисленное поля
    private char symbol;
    private int number;

    // Конструктор с двумя аргументами (целое число и символ)
    public CharIntExample(int code, char symbol) {
        this.symbol = symbol;
        this.number = code;
    }

    // Конструктор с одним аргументом типа double
    public CharIntExample(double value) {
        // Получаем символ из целой части числа
        this.symbol = (char) ((int) value);

        // Получаем целочисленное значение из дробной части (десятые и сотые)
        this.number = (int) ((value - (int) value) * 100);
    }

    // Метод для вывода значений полей
    public void displayValues() {
        System.out.println("Символ: " + symbol + ", Целочисленное значение: " + number);
    }
}
