package laba1;

import java.util.Scanner;

public class Example15 {
    public static void main(String [] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите превое число:");
        int firstNumber = InCMD.nextInt();
        System.out.print("Введите второе число:");
        int secondNumber = InCMD.nextInt();
        int result;
        result = firstNumber + secondNumber;
        System.out.println("Результат: " + result);
        InCMD.close();
    }
}
