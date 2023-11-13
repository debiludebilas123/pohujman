package Lesson5;

import java.util.*;

public class Lesson5Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a base number: ");
        int num = scanner.nextInt();
        for (int i = 1; i <= 12; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
