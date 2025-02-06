package laba7.example4;

public class ThirdClass extends SecondClass {
    public int intField;

    // Конструктор с параметрами
    public ThirdClass(char charField, String stringField, int intField) {
        super(charField, stringField);
        this.intField = intField;
    }

    // Конструктор копирования
    public ThirdClass(ThirdClass other) {
        super(other);
        this.intField = other.intField;
    }

    // Метод для вывода значений полей
    public void printFields() {
        System.out.println("Символьное поле: " + charField);
        System.out.println("Текстовое поле: " + stringField);
        System.out.println("Целочисленное поле: " + intField);
    }
}
