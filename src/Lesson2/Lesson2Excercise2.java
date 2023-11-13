package Lesson2;

import java.util.*;

public class Lesson2Excercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int first = input.nextInt();
        System.out.print("What is the second number? ");
        int second = input.nextInt();
        System.out.println(first + "+" + second + "=" + (first + second));
        System.out.println(first + "-" + second + "=" + (first - second));
        System.out.println(first + "*" + second + "=" + (first * second));
        System.out.println(first + "/" + second + "=" + ((first * 1.0) / (1.0 * second)));
        System.out.println(first + "%" + second + "=" + (first % second));
        System.out.println(first + "^" + second + "=" + (Math.pow(first, second)));
    }
}
