package laba3;

import java.util.Scanner;

public class example2if {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String day = in.nextLine().toLowerCase();

        //вложенные условные операторы
        if (day.equals("понедельник")) {
            System.out.println("1 - Понедельник");
        } else if (day.equals("вторник")) {
            System.out.println("2 - Вторник");
        } else if (day.equals("среда")) {
            System.out.println("3 - Среда");
        } else if (day.equals("четверг")) {
            System.out.println("4 - Четверг");
        } else if (day.equals("пятница")) {
            System.out.println("5 - Пятница");
        } else if (day.equals("суббота")) {
            System.out.println("6 - Суббота");
        } else if (day.equals("воскресенье")) {
            System.out.println("7 - Воскресенье");
        } else {
            System.out.println("Неккоректное значение, введите день недели");
        }

        in.close();
    }
}
