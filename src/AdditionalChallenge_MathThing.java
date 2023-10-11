import java.util.Random;
import java.util.Scanner;

public class AdditionalChallenge_MathThing {
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int option = getOption();
            if (option == 4) {
                System.exit(0);
            }
            if (option == 1) {
                double num = getNum();
                calcFactorial(num);
            } else if (option == 2) {
                int[] randomNumbers = randomArr();
                printArray(randomNumbers);
            } else if (option == 3) {
                int[] numbers = randomArr();
                printArray(numbers);
                minMaxArr(numbers);
            } else {
                System.out.println("Invalid number. Try entering a number ranging from 1 to 3.");
            }
        }
    }

    public static int[] randomArr() {
        int[] specs = getSpecs();
        return randomNums(specs[0], specs[1], specs[2]);
    }

    public static void minMaxArr(int[] arr) {
        int min = 9999999, max = 0;
        for (int num : arr) {
            if (min > num) {
                min = num;
            } else if (max < num) {
                max = num;
            }
        }
        System.out.println("The maximum of this array is " + max + ". The minimum is " + min + ".");
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]+"\n");
    }

    public static void showMenu() {
        System.out.println("""
                \n1. Calculate a factorial
                2. Generate a specified amount of random numbers in an array
                3. Find min/max of an array
                4. To exit the program""");
    }

    public static double getNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter what number you would like to work with: ");
        return scanner.nextDouble();
    }

    public static int[] getSpecs() {
        Scanner scanner = new Scanner(System.in);
        int[] specs = new int[3];
        System.out.print("Enter the amount of numbers you wanna generate: ");
        specs[0] = scanner.nextInt();
        System.out.print("Enter the minimum range of numbers: ");
        specs[1] = scanner.nextInt();
        System.out.print("Enter the maximum range of numbers: ");
        specs[2] = scanner.nextInt();
        return specs;
    }

    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] randomNums(int size, int min, int max) {
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(min, max);
        }
        return numbers;
    }

    public static void calcFactorial(double num) {
        double ans = num * (num - 1);
        for (int i = 0; i < (num - 2); num--) {
            ans *= num - 2;
        }
        System.out.format("%.0f\n", ans);
    }
}