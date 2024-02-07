package IP3_TaskWizard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserAuthentication {
    private final Scanner scanner;

    public UserAuthentication(Scanner scanner) {
        this.scanner = scanner;
    }

    public void register() throws IOException {
        File log = new File("UserLogins.txt");
        PrintWriter out = new PrintWriter(new FileWriter(log, true));
        System.out.println("REGISTER\nEnter a username: ");
        String newLogin = scanner.next();

        while (usernameCheck(newLogin)) {
            System.out.println("That username is taken.\nEnter a username: ");
            newLogin = scanner.next();
        }

        System.out.println("Enter a password: ");
        newLogin += ", " + scanner.next() + "\n";
        out.append(newLogin);
        out.close();
    }

    private boolean usernameCheck(String username) throws IOException {
        Scanner fileScan = new Scanner(Paths.get("UserLogins.txt"));
        while (fileScan.hasNextLine()) {
            String[] parts = fileScan.nextLine().split(",");
            if (parts[0].equals(username)) {
                return true;
            }
        }
        return false;
    }

    public boolean ifUsernameTaken(String username) throws IOException {
        UserInfoLoading loading = new UserInfoLoading();
        Scanner fileScan = new Scanner(Paths.get("UserData.txt"));
        while (fileScan.hasNextLine()) {
            String[] parts = fileScan.nextLine().split("\\$");
            if (username.equals(parts[0])) {
                loading.loadInfo(username);
                return true;
            }
        }
        return false;
    }

    private boolean loginCheck(String login) throws IOException {
        Scanner fileScan = new Scanner(Paths.get("UserLogins.txt"));
        while (fileScan.hasNextLine()) {
            if (login.equals(fileScan.nextLine())) {
                System.out.println("Correct login welcome.");
                return false;
            }
        }
        return true;
    }

    public String login() throws IOException {
        while (true) {
            System.out.println("""
                    Welcome to TaskWizard
                    1. Login
                    2. Register""");
            int choice = scanner.nextInt();

            if (choice > 2 || choice < 1) {
                System.out.println("Enter a valid number.");
                System.out.print("\033[H\033[2J");
                continue;
            }
            if (choice == 2) {
                register();
            }

            System.out.print("LOGIN\nEnter your username: ");
            String userLogin = scanner.next();
            System.out.print("Enter your password: ");
            userLogin += ", " + scanner.next();
            while (loginCheck(userLogin)) {
                System.out.print("Wrong login try again.\nEnter your username: ");
                userLogin = scanner.next();
                System.out.print("Enter your password: ");
                userLogin += ", " + scanner.next();
            }
            String[] username = userLogin.split(",");
            return username[0];
        }

    }

}
