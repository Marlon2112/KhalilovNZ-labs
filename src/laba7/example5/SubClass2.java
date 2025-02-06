package laba7.example5;

public class SubClass2 extends SuperClass {
    protected char character;

    public SubClass2(String text, char character) {
        super(text);
        this.character = character;
    }

    @Override
    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Значение text: " + getText() + ", Значение character: " + character);
    }
}
