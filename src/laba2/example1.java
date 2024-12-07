package laba2;

import java.util.Scanner;

public class example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод числа
        System.out.print("Введите число: ");
        int number = in.nextInt();

        //Проверка, делится ли число на 3
        if(number % 3 == 0) {
            System.out.println("Число " + number + "делится на 3");
        }
        else {
            System.out.println("Число " + number + "не делится на 3");
        }
        in.close();
    }
}
