package laba1;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input weekday: ");
        String weekday = in.nextLine();
        System.out.print("Input month: ");
        String month = in.nextLine();
        System.out.print("Input height: ");
        int day = in.nextInt();
        String dateMessage = String.format("Today: %s, %d, %s", weekday, day, month);
        System.out.println(dateMessage);
        in.close();
    }
}
