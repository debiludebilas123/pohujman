package Lesson2;

import java.util.*;

public class Lesson2Excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.print("Enter your hobby: ");
        String hobby = input.next();
        System.out.println(name + " loves " + hobby + " in their free time.\nThey find it relaxing and satisfying to see their "
                + hobby + " come to life.\n" + hobby + " allows " + name + " to express their creative side.");
    }
}
