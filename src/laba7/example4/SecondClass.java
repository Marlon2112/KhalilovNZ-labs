package laba7.example4;

public class SecondClass extends FirstClass {
    public String stringField;

    // Конструктор с параметрами
    public SecondClass(char charField, String stringField) {
        super(charField);
        this.stringField = stringField;
    }

    // Конструктор копирования
    public SecondClass(SecondClass other) {
        super(other);
        this.stringField = other.stringField;
    }
}
