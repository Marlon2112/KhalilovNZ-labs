package laba5.classes;

public class CharExample {
    // Закрытое символьное поле
    private char symbol;

    // Открытый метод для присвоения значения полю
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // Открытый метод для получения кода символа
    public int getSymbolCode() {
        return (int) symbol;
    }

    // Открытый метод для вывода символа и его кода
    public void displaySymbolAndCode() {
        System.out.println("Символ: " + symbol + ", Код символа: " + (int) symbol);
    }
}
