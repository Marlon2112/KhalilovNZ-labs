package laba7.example3;

public class SubClass2 extends SubClass1 {
    // Открытое текстовое поле
    public String text;

    // Конструктор с тремя параметрами
    public SubClass2(int number, char letter, String text) {
        super(number, letter);
        this.text = text;
    }

    // Перегруженный метод для присваивания значений
    public void setValues(int number, char letter, String text) {
        super.setValues(number, letter);
        this.text = text;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "SubClass2: number = " + number + ", letter = " + letter + ", text = " + text;
    }
}
