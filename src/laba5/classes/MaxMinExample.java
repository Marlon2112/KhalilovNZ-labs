package laba5.classes;

public class MaxMinExample {
    // Закрытые целочисленные поля
    private int max;
    private int min;

    // Конструктор, который работает по принципу метода для присваивания значений полям
    public MaxMinExample() {
        // Изначально максимальное значение будет минимальным (чтобы присваивание работало корректно)
        this.max = Integer.MIN_VALUE; // наименьшее возможное значение для int
        this.min = Integer.MAX_VALUE; // наибольшее возможное значение для int
    }

    // Конструктор, который принимает два целых числа и присваивает значения полям
    public MaxMinExample(int value1, int value2) {
        setValues(value1, value2);
    }

    // Открытый метод для присваивания значений полям
    public void setValues(int value1, int value2) {
        // Сравниваем переданные значения с текущими и присваиваем самое большое max и самое маленькое min
        this.max = Math.max(Math.max(value1, value2), this.max);
        this.min = Math.min(Math.min(value1, value2), this.min);
    }

    // Открытый метод для присваивания значения только одному полю (в этом случае min будет максимальным значением)
    public void setValues(int value) {
        setValues(value, value);
    }
    public void displayValues() {
        System.out.println("max: " + max + ", min: " + min);
    }
}
