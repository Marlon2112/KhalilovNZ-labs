package laba7.example3;

public class Main {
    public static void main(String[] args) {
        // Создаем объект третьего класса
        SubClass2 obj = new SubClass2(10, 'A', "третья лаба!");
        // Выводим информацию об объекте
        System.out.println(obj);

        // Изменим значения через перегруженный метод
        obj.setValues(20, 'B', "Обновленный текст");
        // Снова выводим информацию об объекте
        System.out.println(obj);
    }
}
