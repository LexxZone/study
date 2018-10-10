package exception;

/**
 * Created by Alexey Dvoryaninov on 01.07.2018 - (lexxzone@gmail.com)
 */
public class ExceptionExample {
    /**
     *  Программа демонстрирует использование Exception и перехват ошибок
     */
    public static void main(String[] args) {

        ExceptionExample ex = new ExceptionExample();


        System.out.println(ex.division(16, 2));
        System.out.println(ex.division(16.4, 2.0));
        System.out.println(ex.division(24, 0));
        System.out.println(ex.division(32.8, 4.2));
        System.out.println(ex.division(100, 40));
        System.out.println(ex.division(16.4, 0.0));
        System.out.println();
    }

    public int division (int a, int b) {

       int result;

        try {

            result = a / b;

        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль!");
            result = 0;
        }
        return result;
    }

    public double division (double a, double b) {

        double result;
        try {
            result = a / b;


        } catch (ArithmeticException e) {
            System.out.println("Ошибка деления на ноль!");
            result = 0;
        }
        return result;
    }



}
