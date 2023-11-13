package Lesson4;

import java.util.*;

public class Lesson4Excercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Q1. What is the capital of Spain? ");
        String q1 = input.next();
        if (!q1.toLowerCase().contains("madrid")) {
            System.out.println("Sorry, the correct answer is Madrid.");
        }
        System.out.print("Q2. What is the capital of the UK? ");
        String q2 = input.next();
        if (!q2.toLowerCase().contains("london")) {
            System.out.println("Sorry, the correct answer is London.");
        }
        System.out.print("Q3. What is the capital of Italy? ");
        String q3 = input.next();
        if (!q3.toLowerCase().contains("rome")) {
            System.out.println("Sorry, the correct answer is Rome.");
        }
    }
}
