package laba5;

import laba5.classes.IntegerFields;

public class example3 {
    public static void main(String[] args) {
        // Создание объектов с разными конструкторами

        // Объект с использованием конструктора без аргументов
        IntegerFields obj1 = new IntegerFields();
        obj1.displayValues();  // Выведет: firstValue: 0, secondValue: 0

        // Объект с использованием конструктора с одним аргументом
        IntegerFields obj2 = new IntegerFields(5);
        obj2.displayValues();  // Выведет: firstValue: 5, secondValue: 0

        // Объект с использованием конструктора с двумя аргументами
        IntegerFields obj3 = new IntegerFields(10, 20);
        obj3.displayValues();  // Выведет: firstValue: 10, secondValue: 20
    }
}
