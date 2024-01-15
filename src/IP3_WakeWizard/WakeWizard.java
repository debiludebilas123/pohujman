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
        UserAuthentication authentication = new UserAuthentication(scanner);
        String username = authentication.login();
        out.append(username).append("$");
        out.close();

        AlarmManager alarmManager = new AlarmManager();
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }

}
