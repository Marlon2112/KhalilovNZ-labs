package laba5.classes;

public class CharRange {
    // Два символьных поля
    private char startSymbol;
    private char endSymbol;

    // Конструктор для инициализации полей
    public CharRange(char startSymbol, char endSymbol) {
        this.startSymbol = startSymbol;
        this.endSymbol = endSymbol;
    }

    public void printSymbolsInRange() {
        // Определяем минимальный и максимальный символ
        char start = (startSymbol < endSymbol) ? startSymbol : endSymbol;
        char end = (startSymbol > endSymbol) ? startSymbol : endSymbol;

        // Выводим все символы в заданном диапазоне
        for (char c = start; c <= end; c++) {
            System.out.print(c + " ");
        }
        System.out.println(); // Переход на новую строку после вывода
    }
}
