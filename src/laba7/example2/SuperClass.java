package laba7.example2;

public class SuperClass {
    private String text;

    // Конструктор суперкласса
    public SuperClass(String text) {
        this.text = text;
    }

    // Метод для присваивания значения полю text
    public void setText(String text) {
        this.text = text;
    }

    // Метод, возвращающий длину текстовой строки
    public int getTextLength() {
        return text.length();
    }
}
