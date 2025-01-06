package laba5;

import laba5.classes.IntegerFieldExample;

public class example5 {
    public static void main(String[] args) {
        // Создаем объект без передачи аргументов
        IntegerFieldExample obj1 = new IntegerFieldExample();
        System.out.println("Значение поля obj1: " + obj1.getValue()); // Выведет: 0

        // Присваиваем значение с аргументом
        obj1.setValue(50);
        System.out.println("Значение поля obj1 после присваивания 50: " + obj1.getValue()); // Выведет: 50

        // Присваиваем значение больше 100
        obj1.setValue(150);
        System.out.println("Значение поля obj1 после присваивания 150: " + obj1.getValue()); // Выведет: 100

        // Создаем объект с передачей аргумента в конструктор
        IntegerFieldExample obj2 = new IntegerFieldExample(200);
        System.out.println("Значение поля obj2 после передачи аргумента 200: " + obj2.getValue()); // Выведет: 100

        // Присваиваем значение по умолчанию (0) с помощью метода без аргументов
        obj2.setValue();
        System.out.println("Значение поля obj2 после вызова setValue без аргументов: " + obj2.getValue()); // Выведет:
    }
}
