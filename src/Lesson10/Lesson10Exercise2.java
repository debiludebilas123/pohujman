package Lesson10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Lesson10Exercise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("output.txt"));

        while (true) {
            String line = in.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }

    }
}
