package IP3_WakeWizard;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() throws IOException {
        System.out.println("""
                1. Add an alarm     2. Remove an alarm
                3. Edit an alarm    4. Manipulate alarms
                5. Turn analytics on/off""");
        while (true) {
            System.out.print("Enter the corresponding number to your choice: ");
            switch (scanner.nextInt()) {
                case 1 -> alarmAddGet();
                case 2 -> alarmRemoveGet();
                case 3 -> alarmEditGet();
                case 4 -> alarmManipulate();
                default -> {
                    appendInfo();
                    System.exit(0);
                }
            }
        }
    }

    public static void appendInfo() throws IOException {
        File log = new File("UserData.txt");
        PrintWriter out = new PrintWriter(new FileWriter(log, true));
        StringBuilder string = new StringBuilder();
        List<Alarm> alarms = AlarmManager.getAlarms();

        for (Alarm alarm : alarms) {
            string.append(alarm.getIndex()).append(",").append(alarm.getName()).append(",").append(alarm.getTime()).append(",").append(alarm.getStatus()).append("|");
        }

        out.append(String.valueOf(string)).append("\n");
        out.close();
    }

    public void alarmManipulate() {
        System.out.println("Which alarm would you like to turn off/on: ");
        int index = scanner.nextInt();
        System.out.println("On/off: ");
        String choice = scanner.next();
        boolean status = choice.equalsIgnoreCase("on");
        AlarmManager.manipulateAlarm(AlarmManager.getAlarms(), index, status);
    }

    public void alarmAddGet() {
        boolean status = false;
        System.out.println("Enter an alarm name: ");
        String name = scanner.next();
        System.out.println("Enter the time u desire (Military time): ");
        String time = scanner.next();
        System.out.println("Do you want it turned on or off?: ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("on")) {
            status = true;
        }
        AlarmManager.addAlarm(name, time, status);
        AlarmManager.printAlarms();
    }

    public void alarmEditGet() {
        AlarmManager.printAlarms();
        System.out.println("\nEnter which alarm you would like to edit: ");
        int index = scanner.nextInt();
        System.out.println("""
                Enter what you would like to edit.
                1 - Name
                2 - Time""");
        int choice = scanner.nextInt();
        AlarmManager.editAlarm(AlarmManager.getAlarms(), index, choice);
    }

    public void alarmRemoveGet() {
        System.out.println("Enter the id of the alarm u want to remove: ");
        int index = scanner.nextInt();
        AlarmManager.removeAlarm(AlarmManager.getAlarms(), index);
    }

}
