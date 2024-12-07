package laba2;

import java.util.Scanner;

public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Ввод числа
        System.out.print("Введите число: ");
        int number = in.nextInt();

        //Проверка условия
        if (number % 5 == 2) {
            if (number % 7 == 1) {
                System.out.println("Число удовлетворяет критериям.");
            } else {
                System.out.println("Число не удовлетворяет критериям по модулю 7");
            }
        } else {
            System.out.println("Число не удовлетворяет критериям по модулю 5");
        }
        in.close();
    }
}
