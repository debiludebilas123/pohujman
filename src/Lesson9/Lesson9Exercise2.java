package Lesson9;

import java.io.File;
import java.util.Scanner;

public class Lesson9Exercise2 {
    public static void exception1() {
        // exception 1
        // java.lang.ArithmeticException: / by zero
        // Can't divide by 0.
        try {
            int exception1 = 10 / 0;
            System.out.println(exception1);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void exception2() {
        // exception 2
        // Numeric overflow in expression means that too big of a number has been inputted into the int type variable
        try {
            int exception2 = Integer.MAX_VALUE + 1;
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void exception3() {
        // exception 3
        // java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        // There doesn't exist a myArray3[5] it only goes up to [4] as it starts from [0].
        try {
            int[] myArray3 = new int[5];
            int exception3 = myArray3[5];
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void exception4() {
        // exception 4
        // java.lang.NullPointerException: Cannot load from int array because "myArray4" is null
        // myArray4 doesn't have any elements as its null that means there is absolutely nothing in the array
        try {
            int[] myArray4 = null;
            int exception4 = myArray4[0];
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void exception5() {
        // exception 5
        // java.io.FileNotFoundException: exception5.txt (The system cannot find the file specified)
        // Couldn't find the file as the pathname is either wrong or the file doesn't exist
        try {
            File exception5 = new File("exception5.txt");
            Scanner scanner = new Scanner(exception5);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void exception6() {
        // exception 6
        // java.lang.NumberFormatException: For input string: "Hello"
        // You're trying to enter a String with parseInt into an int that won't work unless with decimals
        try {
            String thisString = "Hello";
            int exception6 = Integer.parseInt(thisString);
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void exception7() {
        // exception 7
        // java.lang.NullPointerException: Cannot invoke "String.toUpperCase()" because "exception7" is null
        // Can't use .toUpperCase() on something that doesn't exist
        try {
            String exception7 = null;
            System.out.println(exception7.toUpperCase());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }

    public static void main(String[] args) {
        exception1();
        exception2();
        exception3();
        exception4();
        exception5();
        exception6();
        exception7();

    }
}
