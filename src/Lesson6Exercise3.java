import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson6Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, lives = 3;
        for (int i = 0; i < 10; i++) {
            if (lives == 0) {
                break;
            }
            int num1 = ThreadLocalRandom.current().nextInt(1, 25);
            int num2 = ThreadLocalRandom.current().nextInt(1, 13);
            System.out.print(num1 + " + " + num2 + " = ");
            int ans = scanner.nextInt();
            if (ans == (num1 + num2)) {
                count++;
            } else {
                lives--;
            }
        }
        if (lives == 3) {
            System.out.println("Well done.");
        }
        System.out.println("You got " + count + " out of 10.");
    }
}