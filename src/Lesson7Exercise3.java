import java.util.Scanner;

public class Lesson7Exercise3 {
    public static void main(String[] args) {
        int score = 0, lives = 3, count = 1;
        while (count <= 10 && lives > 0) {
            int userAnswer = askQuestion(count, count * count);
            int answer = count + (count * count);
            if (answer == userAnswer) {
                score = correctAnswer(score);
            } else {
                lives = wrongAnswer(answer, lives);
            }
            count++;
        }
        gameOver(score, lives);
    }

    public static int askQuestion(int num1, int num2) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is " + num1 + " + " + num2 + "?");
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
