package laba1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input First name: ");
        String firstname = in.nextLine();
        System.out.print("Input name: ");
        String  name = in.nextLine();
        System.out.print("Input second name: ");
        String secondname = in.nextLine();
        System.out.printf("Привет!" + firstname + name + secondname);
        in.close();
    }
}
