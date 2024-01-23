package IP3_TaskWizard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TaskWizard {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File log = new File("UserData.txt");
        PrintWriter out = new PrintWriter(new FileWriter(log, true));

        TaskManager alarmManager = new TaskManager();
        UserInterface ui = new UserInterface(scanner);
        UserAuthentication authentication = new UserAuthentication(scanner);

        String username = authentication.login();
        if (!authentication.ifUsernameTaken(username)) {
            out.append(username).append("$");
            out.close();
        }
        ui.start(username);
    }

}
