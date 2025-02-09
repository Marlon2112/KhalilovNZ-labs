package timus1semester.task1068;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int c = 0;
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        if (f > 0)
        {
            for (int i = 1; i <= f; i++)
                c += i;
            System.out.println(c);
        }
        else if (f <= 0)
        {
            for (int i = f; i <= 1; i++)
                c += i;
            System.out.println(c);
        }

    }
}