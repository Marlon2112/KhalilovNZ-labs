package laba5;

import laba5.classes.CharRange;

public class example2 {
    public static void main(String[] args) {
        // Создаем объект с символами 'A' и 'Z'
        CharRange charRange = new CharRange('A', 'Z');

        // Выводим символы между 'A' и 'D'
        charRange.printSymbolsInRange();  // Выведет: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    }
}
