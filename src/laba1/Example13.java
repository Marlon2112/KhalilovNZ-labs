package laba1;

import java.util.Scanner;

public class Example13 {
    public static void main(String args[]) {
        Scanner InCMD = new Scanner(System.in);
        System.out.print("Ваше имя:");
        String name = InCMD.nextLine();
        System.out.print("Ваш год рождения:");
        int brithyear = InCMD.nextInt();
        int currentyear;
        currentyear = 2024;
        System.out.println("num: " + currentyear);
        int age = currentyear - brithyear;
        System.out.println(name + " Ваш возраст: " + age + " лет" );
        InCMD.close();
    }
}
