package laba7.example4;

public class Main {
    public static void main(String[] args) {
        // Создаем объект третьего класса
        ThirdClass obj1 = new ThirdClass('A', "четвертая лаба", 123);

        // Выводим значения полей
        obj1.printFields();

        // Создаем объект копирования
        ThirdClass obj2 = new ThirdClass(obj1);

        // Выводим значения полей копированного объекта
        System.out.println("\nКопированный объект:");
        obj2.printFields();
    }
}
