package Lesson7;

import java.util.Scanner;

public class Lesson7Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (calculateSum(num1, num2)));
    }

    public static int calculateSum(int num1, int num2) {
        return num1 + num2;
    }
}
