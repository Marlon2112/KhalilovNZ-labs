package laba7.example3;

public class SuperClass {
    // Открытое целочисленное поле
    public int number;

    // Конструктор с одним параметром
    public SuperClass(int number) {
        this.number = number;
    }

    // Метод для присваивания значения полю
    public void setNumber(int number) {
        this.number = number;
    }

    // Метод toString()
    @Override
    public String toString() {
        return "SuperClass: number = " + number;
    }
}
