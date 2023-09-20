import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

class Lesson4ExtraChallenge1 {
    public static void main(String[] args) {
        int number = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println(number);
        int counter = 0;
        Scanner input = new Scanner(System.in);
        while (true) {
            counter++;
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("Great, you guessed it after " + counter + " tries.");
                break;
            } else if (guess > number) {
                System.out.println("It's lower than that.");
            } else {
                System.out.println("It's higher than that.");
            }
        }

    }
}
