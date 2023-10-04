import java.util.Random;
import java.util.Scanner;

public class Lesson5ExtraChallenge2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(1, 6);
        System.out.print("You have 5 guesses.\nEnter a number you want to guess 1-6 here: ");
        for (int i = 0; i < 5; i++) {
            int guess = scanner.nextInt();
            if (guess != num) {
                System.out.println("That's the wrong guess try again.");
                continue;
            }
            System.out.println("Good job you guessed right!");
            break;
        }
    }
}
