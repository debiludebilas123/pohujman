import java.util.Scanner;

public class Lesson7Exercise1 {
    public static void main(String[] args) {
        while (true) {
            showMenu();
            int option = getOption();
            if (option == 1) {
                option1();
            } else if (option == 2) {
                option2();
            } else if (option == 3) {
                option3();
            } else if (option == 4) {
                option4();
                break;
            } else {
                System.out.println("This isn't a valid option. Try a number between 1 and 4.");
            }
        }
    }

    public static void showMenu() {
        System.out.print("Enter what option you would like to choose: ");
    }

    public static int getOption() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static void option1() {
        System.out.println("Hello.");
    }

    public static void option2() {
        System.out.println("Insert 'joke'.");
    }

    public static void option3() {
        System.out.println("Another 'joke'.");
    }

    public static void option4() {
        System.out.println("Bye!");
    }

}
