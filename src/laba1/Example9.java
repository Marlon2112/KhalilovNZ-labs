package laba1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Введите имя:");
        String name = InCMD.nextLine();
        System.out.print("Введите возраст:");
        int age = InCMD.nextInt();
        System.out.printf("Your name: %s, Your age %d \n", name, age);
        InCMD.close();
    }
}
