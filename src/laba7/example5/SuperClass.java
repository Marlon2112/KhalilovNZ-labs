package laba7.example5;

public class SuperClass {
    private String text;

    public SuperClass(String text) {
        this.text = text;
    }

    protected String getText() {
        return text; // Геттер для доступа к приватному полю text
    }

    public void display() {
        System.out.println("Класс: " + this.getClass().getSimpleName() + ", Значение text: " + text);
    }
}
