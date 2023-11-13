package Lesson4;

import java.util.*;

public class Lesson4Excercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your total purchase amount: £");
        double total = input.nextDouble();
        if (total < 50) {
            System.out.println("Shipping cost is = £10.00");
            total += 10;
        } else {
            System.out.println("Shipping cost is free.");
        }
        System.out.println("Your final total is = £" + total);
    }
}
