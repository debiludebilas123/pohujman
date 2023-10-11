import java.util.Scanner;

public class Lesson6Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Say \"hello\" \n2. Tell me a joke\n3. Tell me a joke\n4. Quit\n");
            int choice = scanner.nextInt();
            if (choice == 4) {
                break;
            }
        }
    }
}
