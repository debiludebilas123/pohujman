package IP3_TaskWizard;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UserInterface {
    private final Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start(String username) throws IOException {
        while (true) {
            TaskManager.indexUpdater();
            System.out.println("""
                    1. Add a task     2. Remove a task
                    3. Edit a task    4. Manipulate tasks
                    Enter anything else to exit the program.""");
            System.out.print("Enter the corresponding number to your choice: ");
            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> alarmAddGet();
                    case 2 -> alarmRemoveGet();
                    case 3 -> alarmEditGet();
                    case 4 -> alarmManipulate();
                    default -> {
                        appendInfo(username);
                        System.exit(0);
                    }
                }
            } catch (InputMismatchException e) {
                appendInfo(username);
                System.exit(0);
            }
        }
    }

    public static void appendInfo(String username) throws IOException {
        File log = new File("UserData.txt");
        Scanner fileScan = new Scanner(log);
        StringBuilder updatedData = new StringBuilder();
        List<Task> alarms = TaskManager.getTasks();

        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] parts = line.split("\\$");
            if (username.equals(parts[0])) {
                StringBuilder string = new StringBuilder(username + "$");
                for (Task alarm : alarms) {
                    string.append(alarm.getIndex()).append(",").append(alarm.getName()).append(",").append(alarm.getTime()).append(",").append(alarm.getStatus()).append("|");
                }
                updatedData.append(string).append("\n");
            } else {
                updatedData.append(line).append("\n");
            }
        }

        fileScan.close();

        try (PrintWriter writer = new PrintWriter(log)) {
            writer.write(updatedData.toString());
        }
    }

    public void alarmManipulate() {
        TaskManager.printTasks();
        System.out.println("Which task would you like to change the status of: ");
        int index = scanner.nextInt();
        System.out.println("""
                1. Completed
                2. Due""");
        int choice = scanner.nextInt();
        boolean status;
        status = choice == 1;
        TaskManager.manipulateTask(TaskManager.getTasks(), index, status);
    }

    public void alarmAddGet() {
        TaskManager.printTasks();
        boolean status = true;
        System.out.println("Enter task name: ");
        String name = scanner.next();
        System.out.println("Enter the deadline YYYY-MM-DD: ");
        LocalDate time = LocalDate.parse(scanner.next());
        TaskManager.addTask(name, time, status);
    }

    public void alarmEditGet() {
        TaskManager.printTasks();
        System.out.println("\nEnter which task you would like to edit: ");
        int index = scanner.nextInt();
        System.out.println("""
                Enter what you would like to edit.
                1 - Name
                2 - Date""");
        int choice = scanner.nextInt();
        TaskManager.editTask(TaskManager.getTasks(), index, choice);
    }

    public void alarmRemoveGet() {
        TaskManager.printTasks();
        System.out.println("Enter the index of the task u want to remove: ");
        int index = scanner.nextInt();
        TaskManager.removeTask(TaskManager.getTasks(), index);
    }

}
