package laba5;

import laba5.classes.CharIntExample;

public class example4 {
    public static void main(String[] args) {
        // Создание объекта с двумя аргументами
        CharIntExample obj1 = new CharIntExample(65, 'A');
        obj1.displayValues();  // Выведет: Символ: A, Целочисленное значение: 65

        // Создание объекта с одним аргументом типа double
        CharIntExample obj2 = new CharIntExample(65.1267);
        obj2.displayValues();  // Выведет: Символ: A, Целочисленное значение: 12
    }
}
