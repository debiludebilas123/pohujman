package Lesson4;

import java.util.*;

public class Lesson4ExtraChallenge2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int score = input.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("That's an impossible score.");
            System.exit(0);
        }
        if (score >= 70) {
            System.out.println("You got an A.");
        } else if (score >= 60) {
            System.out.println("You got an B.");
        } else if (score >= 50) {
            System.out.println("You got an C.");
        } else if (score >= 40) {
            System.out.println("You got an D.");
        } else {
            System.out.println("You got a no award.");
        }
    }
}
