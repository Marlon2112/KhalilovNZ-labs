package laba7.example2;

public class SubClass extends SuperClass {
    public int number;

    // Конструктор подкласса
    public SubClass(int number, String text) {
        super(text); // Вызов конструктора суперкласса
        this.number = number;
    }

    // Переопределение метода setText без параметров
    public void setText() {
        super.setText("Стандартный текст");
    }

    // Переопределение метода setText с текстовым параметром
    @Override
    public void setText(String text) {
        super.setText(text);
    }

    // Метод для присваивания значения полю number
    public void setNumber(int number) {
        this.number = number;
    }

    // Перегрузка метода setText с целочисленным параметром
    public void setText(int number) {
        setNumber(number);
        super.setText("Число было установлено: " + number);
    }

    // Перегрузка метода setText с текстовым и целочисленным параметрами
    public void setText(String text, int number) {
        super.setText(text);
        this.number = number;
    }
}
