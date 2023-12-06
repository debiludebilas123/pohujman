package Lesson10;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson10Exercise1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try (PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) {
            for (int i = 0; i <= num; i++) {
                out.println(i * 5);
            }
        }
    }
}
