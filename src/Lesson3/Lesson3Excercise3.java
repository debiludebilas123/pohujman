package Lesson3;

import java.util.*;

public class Lesson3Excercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: £");
        int loan = input.nextInt();
        System.out.print("Interest Rate (APR %): ");
        int APR = input.nextInt();
        System.out.print("Number of years: ");
        int years = input.nextInt() * 12;
        double sudas = (double) APR / 100 / 12;
        double payment = (loan * (sudas / (1 - (Math.pow(1 + sudas, -years)))));
        System.out.format("Monthly payment for this loan = %.2f", payment);
    }
}
