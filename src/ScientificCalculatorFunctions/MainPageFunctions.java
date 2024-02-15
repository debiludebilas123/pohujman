package ScientificCalculatorFunctions;

import java.util.Scanner;

public class MainPageFunctions {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double num = scanner.nextDouble();
        System.out.println(eulerNumber());
    }

    public static double addition(double num) {
        double addend = scanner.nextDouble();
        return num - addend;
    }

    public static double subtraction(double num) {
        double subtrahend = scanner.nextDouble();
        return num - subtrahend;
    }

    public static double division(double num) {
        double divisor = scanner.nextDouble();
        return num / divisor;
    }

    public static double multiplication(double num) {
        double multiplier = scanner.nextDouble();
        return num * multiplier;
    }

    public static double squared(double num) {
        return num * num;
    }

    public static double exponentiation(double num) {
        int exponent = scanner.nextInt();
        return Math.pow(num, (1.0 * exponent));
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static double numberRooting(double num) {
        int degree = scanner.nextInt();
        return Math.pow(num, (1.0 / degree));
    }

    public static double eulerNumber() {
        int exponent = scanner.nextInt();
        if (exponent == 0) {
            return 1.0;
        }
        return Math.E * eulerNumber();
    }

}
