package laba1;

public class Example19 {
    static double a = 10.0, b = 4.0;
    public static double hyp(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }
    public static void main(String[] args) {
        System.out.println("katet а = " + a);
        System.out.println("katet b = " + b);
        double c = hyp(a, b);
        System.out.println("hypotenuse с = " + c);
    }
}
