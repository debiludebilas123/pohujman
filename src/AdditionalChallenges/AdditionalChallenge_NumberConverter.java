package AdditionalChallenges;

import java.util.Scanner;

public class AdditionalChallenge_NumberConverter {
    public static void main(String[] args) {
        while (true) {
            showMenu();
            double[] vars = getVars();
            if (vars[0] == 4) {
                System.exit(0);
            } else if (vars[0] == 1) {
                convertBinary((int) vars[1]);
            } else if (vars[0] == 2) {

            } else if (vars[0] == 3) {

            } else {
                System.out.println("Invalid option. Try entering a number ranging from 1 to 4.");
            }
        }
    }

    public static void convertOctal(double num) {
        double ans = num / 8;

    }

    public static void convertBinary(int num) {
        int[] binary = new int[31];
        int count = 0;
        while (num > 0) {
            binary[count++] = num % 2;
            num /= 2;
        }
        for (int i = count - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }

    }

    public static double[] getVars() {
        /* vars is an array which contains the option and number that will be converted just wanted to make it into 1 function */
        double[] vars = new double[2];
        Scanner scanner = new Scanner(System.in);
        vars[0] = scanner.nextInt();
        if (vars[0] == 4) {
            System.exit(0);
        }
        System.out.print("Enter a number you wanna work with: ");
        vars[1] = scanner.nextInt();
        return vars;
    }

    public static void showMenu() {
        System.out.println("""
                \n1. Convert decimal to binary
                2. Convert decimal to octal
                3. Convert decimal to hexadecimal
                4. To exit the program""");
    }
}
