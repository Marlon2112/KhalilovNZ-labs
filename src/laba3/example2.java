package laba3;

import java.util.Scanner;

public class example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод числа
        System.out.print("Введите день недели: ");
        String weekday = in.nextLine().toLowerCase();
        switch (weekday){
            case "понедельник":
                System.out.println("1 -Понедельник");
                break;
            case "вторник":
                System.out.println("2 - Вотрник");
                break;
            case "среда":
                System.out.println("3 - Среда");
                break;
            case "четврег":
                System.out.println("4 - Четверг");
                break;
            case "пятница":
                System.out.println("5 - Пятница");
                break;
            case "суббота":
                System.out.println("6 - Суббота");
                break;
            case "воскресенье":
                System.out.println("7 - Воскресенье");
                break;
            default:
                System.out.println("Неккоректное значение, введите день недели");
        }
        in.close();
    }
}
