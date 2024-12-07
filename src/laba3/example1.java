package laba3;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод числа
        System.out.print("Введите число от 1 до 7: ");
        int weekday = in.nextInt();
        switch (weekday){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вотрник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Неккоректное число, введите от 1 до 7");
        }
        in.close();
    }
}
