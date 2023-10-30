import java.util.Scanner;

public class AdditionalChallenge_Calculator {
    public static void main(String[] args) {
        double sum = getSum();
        while (true) {
            showMenu();
            int option = getOption();
            if (option == 5) {
                System.exit(0);
            }
            if (option == 1) {
                System.out.println(sum = addition(sum));
            } else if (option == 2) {
                System.out.println(sum = subtraction(sum));
            } else if (option == 3) {
                System.out.println(sum = multiplication(sum));
            } else if (option == 4) {
                System.out.println(sum = division(sum));
            } else {
                System.out.println("Invalid number. Try entering a number ranging from 1 to 3.");
            }
        }
    }

    public static double addition(double sum) {
        System.out.print("What would you like to add to your sum: ");
        Scanner scanner = new Scanner(System.in);
        return sum + scanner.nextDouble();
    }

    public static double subtraction(double sum) {
        System.out.print("What would you like to subtract from your sum: ");
        Scanner scanner = new Scanner(System.in);
        return sum - scanner.nextDouble();
    }

    public static double division(double sum) {
        System.out.print("What would you like to divide your sum by: ");
        Scanner scanner = new Scanner(System.in);
        return sum / scanner.nextDouble();
    }

    public static double multiplication(double sum) {
        System.out.print("What would you like to multiply your sum by: ");
        Scanner scanner = new Scanner(System.in);
        return sum * scanner.nextDouble();
    }

    public static double getSum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter what sum you would like to start with: ");
        return scanner.nextDouble();
    }

    public static void showMenu() {
        System.out.println("""
                \n1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. To exit the program""");
    }

    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}