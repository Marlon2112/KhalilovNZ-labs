package timus1semester.task_1293;

import java.io.PrintWriter;
import java.util.Scanner;

public class timus1293 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out, true);

        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();

        int result = (N * (A * B)) * 2;



        out.println(result);
        out.flush();
    }

}
