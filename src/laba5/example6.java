package laba5;

import laba5.classes.MaxMinExample;

public class example6 {
    public static void main(String[] args) {
        MaxMinExample obj1 = new MaxMinExample();
        obj1.displayValues();  // Выведет: max: -2147483648, min: 2147483647

        // Используем метод для присваивания значений
        obj1.setValues(10, 5);
        obj1.displayValues();  // Выведет: max: 10, min: 5

        // Используем метод с одним аргументом
        obj1.setValues(3);
        obj1.displayValues();  // Выведет: max: 10, min: 3

        // Создаем объект с использованием конструктора с двумя аргументами
        MaxMinExample obj2 = new MaxMinExample(50, 20);
        obj2.displayValues();  // Выведет: max: 50, min: 20
    }
}
