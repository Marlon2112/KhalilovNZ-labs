package laba7.example3;

public class SubClass1 extends SuperClass {
    // Открытое символьное поле
    public char letter;

    // Конструктор с двумя параметрами
    public SubClass1(int number, char letter) {
        super(number);
        this.letter = letter;
    }

    // Перегруженный метод для присваивания значений
    public void setValues(int number, char letter) {
        super.setNumber(number);
        this.letter = letter;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "SubClass1: number = " + number + ", letter = " + letter;
    }
}
