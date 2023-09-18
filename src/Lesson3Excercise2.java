import java.util.*;

public class Lesson3Excercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Q1. What is the capital of Spain? ");
        String q1 = input.next();
        System.out.println(q1.toLowerCase().contains("madrid"));
        System.out.print("Q1. What is the capital of the UK? ");
        String q2 = input.next();
        System.out.println(q2.toLowerCase().contains("london"));
        System.out.print("Q1. What is the capital of Italy? ");
        String q3 = input.next();
        System.out.println(q3.toLowerCase().contains("rome"));

    }

}
