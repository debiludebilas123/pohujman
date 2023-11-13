package Lesson5;

import java.util.Scanner;

public class Lesson5ExtraChallenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the pattern you would like to print: ");
        String pattern = scanner.next();
        System.out.print("Enter how many times you would like to print it: ");
        int times = scanner.nextInt();
        for (int i = 0; i < times; i++) {
            System.out.print(pattern);
        }
    }
}
