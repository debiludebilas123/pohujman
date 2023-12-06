package Lesson11;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lesson11Exercise1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        try (PrintWriter out = new PrintWriter(new FileWriter("output.txt"))) {
            for (int i = 0; i <= 12; i++) {
                out.println(i * num);
            }
        }
    }
}
