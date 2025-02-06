package laba7.example4;

public class FirstClass {
    public char charField;

    // Конструктор с параметрами
    public FirstClass(char charField) {
        this.charField = charField;
    }

    // Конструктор копирования
    public FirstClass(FirstClass other) {
        this.charField = other.charField;
    }
}
