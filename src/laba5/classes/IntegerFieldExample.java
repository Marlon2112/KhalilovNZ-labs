package laba5.classes;

public class IntegerFieldExample {
    // Закрытое целочисленное поле
    private int value;

    // Конструктор, который работает по принципу метода для присваивания значения
    public IntegerFieldExample() {
        // Значение по умолчанию — 0
        this.value = 0;
    }

    // Конструктор, который принимает целое число и присваивает его полю
    public IntegerFieldExample(int value) {
        setValue(value);
    }

    // Открытый метод для присваивания значения полю
    public void setValue() {
        // Если метод вызывается без аргументов, устанавливаем значение 0
        this.value = 0;
    }

    // Открытый метод для присваивания значения полю с аргументом
    public void setValue(int value) {
        // Если значение больше 100, устанавливаем 100
        this.value = Math.min(value, 100);
    }

    // Метод для проверки значения поля
    public int getValue() {
        return value;
    }
}