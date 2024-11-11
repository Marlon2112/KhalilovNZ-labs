package laba1;

import java.util.Scanner;

public class Example14 {
    public static void main(String... args) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Ваш возраст:");
        int age = InCMD.nextInt();
        int currentyear;
        currentyear = 2024;
        System.out.println("num: " + currentyear);
        int brithyear = currentyear - age;

        System.out.println(" Ваш год рождения: " + brithyear );
        InCMD.close();
    }
}
