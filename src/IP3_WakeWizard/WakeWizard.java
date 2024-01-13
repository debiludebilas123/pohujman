package IP3_WakeWizard;


import java.util.Scanner;

public class WakeWizard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlarmManager alarmManager = new AlarmManager();
        UserInterface ui = new UserInterface(alarmManager, scanner);
        ui.start();
    }

}
