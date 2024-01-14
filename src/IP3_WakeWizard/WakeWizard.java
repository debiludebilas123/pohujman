package IP3_WakeWizard;


import java.io.IOException;
import java.util.Scanner;

public class WakeWizard {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        UserAuthentication authentication = new UserAuthentication(scanner);
        authentication.login();

        AlarmManager alarmManager = new AlarmManager();
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }

}
