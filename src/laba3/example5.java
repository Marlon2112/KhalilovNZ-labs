import java.util.ArrayList;
import java.util.Scanner;

public class example5 {

    public static void sumUsingFor(int n) {
        int totalSum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int num = 0; num < n; num++) {
            if (num % 5 == 2 || num % 3 == 1) {
                numbers.add(num);
                totalSum += num;
            }
        }

        System.out.println("Числа, которые суммируются (for): " + numbers);
        System.out.println("Сумма чисел (for): " + totalSum);
    }

    public static void sumUsingWhile(int n) {
        int totalSum = 0;
        ArrayList<Integer> numbers = new ArrayList<>();
        int num = 0;

        while (num < n) {
            if (num % 5 == 2 || num % 3 == 1) {
                numbers.add(num);
                totalSum += num;
            }
            num++;
        }

        System.out.println("Числа, которые суммируются (while): " + numbers);
        System.out.println("Сумма чисел (while): " + totalSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = scanner.nextInt();

        sumUsingFor(n);
        sumUsingWhile(n);
    }
}