package laba13.Example1;

public class Example1Exc {
    public static void main(String[] args) {
        try{
            throw new RuntimeException("Непроверяемая ошибка");} catch (ArithmeticException ex){
            System.out.println(ex.getMessage());}
    }
}
