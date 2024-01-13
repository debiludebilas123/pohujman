package IP3_WakeWizard;

import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private AlarmManager alarmManager;

    public UserInterface(AlarmManager alarmManager, Scanner scanner) {
        this.scanner = scanner;
        this.alarmManager = alarmManager;
    }
    public void start() {
        System.out.println("""
                1. Add an alarm     2. Remove an alarm
                3. Edit an alarm    4. Manipulate alarms""");
        while (true) {
            System.out.print("Enter the corresponding number to your choice: ");
            switch (scanner.nextInt()) {
                case 1 -> {
                    System.out.println("Enter an alarm name: ");
                    String name = scanner.next();
                    System.out.println("Enter the time u desire (Military time): ");
                    String time = scanner.next();
                    AlarmManager.addAlarm(name, time);
                    AlarmManager.printAlarms();
                }
                case 2 -> {

                }
                case 3 -> {

                }
                case 4 -> {

                }
                default -> System.exit(0);
            }
        }
    }

}
