package laba1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {

        Scanner InCMD = new Scanner(System.in);

        System.out.print("Month:");
        String month= InCMD.nextLine();
        System.out.print("Day:");
        int day = InCMD.nextInt();
        System.out.println("В " + month + " количество дней " + day);
    }
}
