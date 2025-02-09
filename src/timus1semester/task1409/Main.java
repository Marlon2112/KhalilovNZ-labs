package timus1semester.task1409;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int a = in.nextInt();
        int b = in.nextInt();
        int numberOffCans = a + b -1;
        int harry = numberOffCans - a;
        int larry = numberOffCans - b;



        out.println(harry + " " + larry);
        out.flush();
    }
}
