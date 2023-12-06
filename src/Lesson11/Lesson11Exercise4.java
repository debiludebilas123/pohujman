package Lesson11;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lesson11Exercise4 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type 2 text file names one after another here: ");
        String textFile1 = scanner.nextLine();
        String textFile2 = scanner.nextLine();

        BufferedReader in = new BufferedReader(new FileReader(textFile1));
        BufferedReader in1 = new BufferedReader(new FileReader(textFile2));

        while (true) {
            String line = in.readLine();
            String line1 = in1.readLine();

            if (line == null || line1 == null) {
                break;
            }

            if (!line.equals(line1)) {
                System.out.println("The contents are different.");
                break;
            }
        }
        System.out.println("The contents are the same.");
    }
}
