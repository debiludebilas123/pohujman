package Lesson5;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Lesson5Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < 10; i++) {
            int num1 = ThreadLocalRandom.current().nextInt(1, 25);
            int num2 = ThreadLocalRandom.current().nextInt(1, 13);
            System.out.print(num1 + " + " + num2 + " = ");
            int ans = scanner.nextInt();
            if (ans == (num1 + num2)) {
                count++;
            }
        }
        System.out.println("You got " + count + " out of 10.");
    }
}
