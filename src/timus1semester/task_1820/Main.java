package timus1semester.task_1820;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        if (k >= n){
            System.out.println(2);
        }else{
            if ((n * 2) % k == 0){
                System.out.println((n * 2) / k);
            }else {
                System.out.println((n * 2) / k + 1);
            }
        }
    }
}
