package laba5.classes;

public class IntegerFields {
    // Два целочисленных поля
    private int firstValue;
    private int secondValue;

    // Конструктор без аргументов (инициализирует поля значениями по умолчанию)
    public IntegerFields() {
        this.firstValue = 0;
        this.secondValue = 0;
    }

    // Конструктор с одним аргументом (инициализирует firstValue, а secondValue остается 0)
    public IntegerFields(int firstValue) {
        this.firstValue = firstValue;
        this.secondValue = 0;
    }

    // Конструктор с двумя аргументами (инициализирует оба поля)
    public IntegerFields(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    // Метод для вывода значений полей
    public void displayValues() {
        System.out.println("firstValue: " + firstValue + ", secondValue: " + secondValue);
    }
}