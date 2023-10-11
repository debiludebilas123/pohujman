import java.util.Scanner;

public class AdditionalChallenge_StringManipulator {
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int option = getOption();
            String string = getString();

            if (option == 1) {
                System.out.println(reverseString(string));
            } else if (option == 2) {
                palindromeCheck(string);
            } else if (option == 3) {
                vowelCounter(string);
            } else if (option == 4) {
                System.exit(0);
            } else {
                System.out.println("Invalid number. Try entering a number ranging from 1 to 3.");
            }
        }

    }

    public static void showMenu() {
        System.out.println("""
                1. Reverse a string
                2. Check if string is a palindrome
                3. Count vowels in a string
                4. To exit the program""");
    }

    public static int getOption() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static String getString() {
        System.out.println("Enter a string you want to use.");
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String reverseString(String string) {
        StringBuilder builder = new StringBuilder(string);
        return builder.reverse().toString();
    }

    public static void palindromeCheck(String string) {
        String string1 = reverseString(string);
        if (string.equals(string1)) {
            System.out.println("This is a palindrome.");
        } else {
            System.out.println("This isn't a palindrome.");
        }
    }

    public static void vowelCounter(String string) {
        int count = 0;
        Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < string.length(); i++) {
            char thing = string.toLowerCase().charAt(i);
            for (Character vowel : vowels) {
                if (thing == vowel) {
                    count++;
                }
            }
        }
        System.out.println("There were " + count + " vowels in this string.");
    }
}
