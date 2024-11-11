package laba1;


import java.util.Scanner;

public class Example16 {
    public static void main(String [] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите число:");
        int userNumber = InCMD.nextInt();
        int firstNumber = userNumber - 1;
        int secondNumber = userNumber;
        int thirdNumber = userNumber + 1;
        int sum = firstNumber + secondNumber + thirdNumber;
        int fourNumber = sum + sum;
        System.out.println("Результат: ");
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourNumber);
        InCMD.close();
    }
}
