package laba1;

import java.lang.Math;

public class Example18 {
    public static double calcLog(double a, double b){
        return Math.exp(Math.log(a) + Math.log(b));
    }
    public static double calcProiz(double a, double b) {
        return Math.exp(Math.log(a) + Math.log(b));
    }

    public static void main(String[] args) {
        double a = 3.0;
        double b = 4.0;

        double hypotenuse = calcLog(a, b);
        double derivative = calcProiz(a, b);

        System.out.printf("Гипотенуза: %.2f\n", hypotenuse);
        System.out.printf("Произведение a и b: %.2f\n", derivative);
    }
}
