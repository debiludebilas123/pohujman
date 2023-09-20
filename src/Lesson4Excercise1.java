import java.util.*;

public class Lesson4Excercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String name = input.next();
        System.out.print("Enter your last name: ");
        String surname = input.next();
        System.out.print("Enter the total value of your order: £");
        double value = input.nextDouble();
        System.out.print("Enter the amount you wish to pay as deposit: £");
        double deposit = input.nextDouble();
        System.out.println("== RECEIPT ==\nCustomer: " + name.charAt(0) + " " + surname + "\nOrder total: " +
                "£" + value + "\nDeposit paid: £" + deposit + "\nRemainder: £" + (value - deposit) + "\n" +
                "You get a free toaster!\n" + "Have a nice day.");

    }
}
