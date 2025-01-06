package laba5;

import laba5.classes.CharExample;

public class example1 {
    public static void main(String[] args) {
        // Создание объекта класса CharExample
        CharExample charExample = new CharExample();

        // Присваиваем символ
        charExample.setSymbol('A');

        // Выводим символ и его код
        charExample.displaySymbolAndCode();

        // Получаем код символа
        int code = charExample.getSymbolCode();
        System.out.println("Код символа через метод getSymbolCode: " + code);
    }
}
