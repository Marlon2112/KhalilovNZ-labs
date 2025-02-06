package laba7.example2;

public class Main {
    public static void main(String[] args) {
        // объект подкласса
        SubClass obj = new SubClass(5, "вторая лаба");

        // проверка методов
        System.out.println("Начальная длина текста: " + obj.getTextLength());

        obj.setText("Новый текст");
        System.out.println("Обновленная длина текста: " + obj.getTextLength());

        obj.setNumber(10);
        obj.setText(20);
        System.out.println("Текст после вызова setText(int): " + obj.getTextLength());

        obj.setText("Обновлено с числом", 15);
        System.out.println("Итоговая длина текста: " + obj.getTextLength());
        System.out.println("Значение числа: " + obj.number);
    }
}
