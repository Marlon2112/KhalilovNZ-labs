package laba7.example5;

public class Main {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass("Пример суперкласса");
        SubClass1 subObj1 = new SubClass1("Пример первого подкласса", 10);
        SubClass2 subObj2 = new SubClass2("Пример второго подкласса", 'A');

        // Вызов метода display для объектов
        superObj.display();
        subObj1.display();
        subObj2.display();

        // Вызов метода display через объектную переменную суперкласса

        subObj1.display(); // Вызов через ссылку суперкласса на подкласс
        subObj2.display(); // Вызов через ссылку суперкласса на подкласс
    }
}
