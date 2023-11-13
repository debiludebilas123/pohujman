package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Lesson7ExtraChallenge2 {
    public static void main(String[] args) {

        while (true) {
            showMenu();
            int option = getOption(), score = 0, lives = 5, count = 1;
            if (option == 1) {
                easyQuestions(count, lives, score);
            } else if (option == 2) {
                hardQuestions(count, lives, score);
            } else if (option == 3) {
                option3();
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 3.");
            }
        }
    }

    public static void easyQuestions(int count, int lives, int score) {
        while (count <= 10 && lives > 0) {
            int num1 = generateRandomInt(), num2 = generateRandomInt();
            int answer = num1 + num2;
            int userAnswer = option1(num1, num2);
            if (userAnswer == answer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver(score, lives);
    }

    public static void hardQuestions(int count, int lives, int score) {
        while (count <= 10 && lives > 0) {
            int num1 = generateRandomInt(), num2 = generateRandomInt();
            int answer = num1 * num2;
            int userAnswer = option2(num1, num2);
            if (userAnswer == answer) {
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
        return random.nextInt(1, 10);
    }

    public static void showMenu() {
        System.out.print("""
                Enter what option you would like to choose.
                1. Easy math problems
                2. Hard math problems
                3. Quit
                """);
    }

    public static int getOption() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int option1(int num1, int num2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Easy math problems)\nWhat is " + num1 + " + " + num2 + "?");
        return scanner.nextInt();
    }

    public static int option2(int num1, int num2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(Hard math problems)\nWhat is " + num1 + " * " + num2 + "?");
        return scanner.nextInt();
    }

    public static void option3() {
        System.exit(0);
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