package Lesson7;

import java.util.Scanner;
import java.util.Random;

public class Lesson7ExtraChallenge1 {
    public static void main(String[] args) {

        int score = 0, lives = 3, count = 1;
        while (count <= 10 && lives > 0) {
            int num1 = generateRandomInt(), num2 = generateRandomInt();
            int userAnswer = askQuestion(num1, num1 * num2);
            int answer = num1 + (num1 * num2);
            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver(score, lives);
    }

    public static int generateRandomInt() {
        Random random = new Random();
        return random.nextInt(1, 100);
    }

    public static int askQuestion(int num1, int num2) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is " + num1 + " + " + num2 + "? ");
        return input.nextInt();
    }

    public static int correctAnswer(int score) {
        System.out.println("Correct!");
        return score + 1;
    }

    public static int wrongAnswer(int answer, int lives) {
        System.out.println("Wrong! The answer is " + answer);
        lives--;
        System.out.println("You have " + lives + " lives left.");
        return lives;
    }

    public static void gameOver(int score, int lives) {
        System.out.println("Game over. Your score is " + score);
        if (lives > 0) {
            System.out.println("Well done!");
        }
    }
}
