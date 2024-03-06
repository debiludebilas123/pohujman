package ScientificCalculatorFunctions;

import java.util.Arrays;
import java.util.Scanner;

public class MainPageFunctions {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(calculateCombinations(20,3));
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

    public static double sin(double num) {
        return Math.sin(num);
    }

    public static double cos(double num) {
        return Math.cos(num);
    }

    public static double tan(double num) {
        return Math.tan(num);
    }

    public static double asin(double num) {
        return Math.asin(num);
    }

    public static double acos(double num) {
        return Math.acos(num);
    }

    public static double atan(double num) {
        return Math.atan(num);
    }

    public static double mean(double[] array) {
        double mean = 0;
        for (double num : array) {
            mean += num;
        }
        return mean / array.length;
    }

    public static double standardDeviationPopulation(double[] array) {
        double mean = Arrays.stream(array).average().orElse(Double.NaN);
        double sumOfSquaredDifferences = Arrays.stream(array).map(x -> Math.pow(x - mean, 2)).sum();
        return Math.sqrt(sumOfSquaredDifferences / array.length);
    }

    private static long factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static long calculatePermutations(int n, int r) {
        if (r < 0 || r > n) {
            throw new IllegalArgumentException("Invalid input. n and r must be non-negative, and r must be less than or equal to n.");
        }

        return factorial(n) / factorial(n - r);
    }

    public static long calculateCombinations(int n, int r) {
        if (r < 0 || r > n) {
            throw new IllegalArgumentException("Invalid input. n and r must be non-negative, and r must be less than or equal to n.");
        }

        return factorial(n) / (factorial(r) * factorial(n - r));
    }

}
