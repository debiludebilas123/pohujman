
import java.util.*;

class Lesson3Excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next();
        System.out.print("Enter your surname: ");
        String surname = input.next();
        System.out.print("Enter your year of birth YYYY: ");
        int year = input.nextInt();
        String username = firstName.charAt(0) + surname.toLowerCase();
        String password = surname.toLowerCase().charAt(0) + firstName.toUpperCase().substring(0, 3) + year;
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
