package Lesson5;

import java.util.Scanner;

public class Lesson5ExtraChallenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        double ans = num * (num - 1);
        for (int i = 0; i < (num - 2); num--) {
            System.out.println(ans);
            ans *= num - 2;
        }
    }
}
