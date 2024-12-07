package laba2;

import java.util.Scanner;

public class example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод числа
        System.out.print("Введите число в диапазоне от 5 до 10: ");
        int number = in.nextInt();

        //Проверка условия
        if (number >= 5 && number <=10) {
            System.out.println("Число удовлетворяет критериям");
        }
        else {
            System.out.println("Число не удовлетворяет критериям");
        }
    }
}
