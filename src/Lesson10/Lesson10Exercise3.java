package Lesson10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Lesson10Exercise3 {
    public static void main(String[] args) {
        int sum = 0;
        try (Scanner in = new Scanner(new FileReader("output.txt"))) {
            while (in.hasNextInt()) {
                sum += in.nextInt();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(sum);
    }
}
