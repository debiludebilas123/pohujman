package IP3_WakeWizard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WakeWizard {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File log = new File("UserData.txt");
        PrintWriter out = new PrintWriter(new FileWriter(log, true));

        AlarmManager alarmManager = new AlarmManager();
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
