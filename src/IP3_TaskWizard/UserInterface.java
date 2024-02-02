package IP3_TaskWizard;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
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
                    case 1 -> taskAddGet();
                    case 2 -> taskRemoveGet();
                    case 3 -> taskEditGet();
                    case 4 -> taskManipulate();
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

    public void taskManipulate() {
        if (TaskManager.isListEmpty()) {
            System.out.println("There are no tasks.");
            return;
        }
        TaskManager.printTasks();
        int index = indexValidation();
        System.out.println("""
                1. Completed
                2. Due""");
        int choice = scanner.nextInt();
        boolean status;
        status = choice == 1;
        TaskManager.manipulateTask(TaskManager.getTasks(), index, status);
    }

    public void taskAddGet() {
        boolean status = true;
        boolean validDate = false;
        LocalDate time = null;

        TaskManager.printTasks();
        System.out.println("Enter task name: ");
        String name = scanner.next();

        while (!validDate) {
            try {
                System.out.println("Enter the deadline YYYY-MM-DD: ");
                String dateString = scanner.next();
                time = LocalDate.parse(dateString);
                validDate = true;
            } catch (DateTimeParseException e) {
                System.out.println("Invalid input, enter according to the format.");
            }
        }
        TaskManager.addTask(name, time, status);
    }

    public void taskEditGet() {
        if (TaskManager.isListEmpty()) {
            System.out.println("There are no tasks.");
            return;
        }
        TaskManager.printTasks();
        int index = indexValidation();
        System.out.println("""
                Enter what you would like to edit.
                1 - Name
                2 - Date""");
        int choice = scanner.nextInt();
        TaskManager.editTask(TaskManager.getTasks(), index, choice);
    }

    public void taskRemoveGet() {
        if (TaskManager.isListEmpty()) {
            System.out.println("There are no tasks.");
            return;
        }
        TaskManager.printTasks();
        int index = indexValidation();
        TaskManager.removeTask(TaskManager.getTasks(), index);
    }

    public void fileCreate() {
        try {
            File userDataFile = new File("UserData.txt");
            userDataFile.createNewFile();

            File userLoginsFile = new File("UserLogins.txt");
            userLoginsFile.createNewFile();
        } catch (IOException e) {
            System.err.println("An error occurred while creating the files: " + e.getMessage());
        }
    }

    public int indexValidation() {
        System.out.println("\nEnter the index of the task: ");
        int index;
        while (true) {
            try {
                index = scanner.nextInt();
                if (index < 0 || index > TaskManager.getTasks().size()-1) {
                    System.out.println("Invalid input, enter a valid index.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter a number.");
                scanner.next();
            }
        }
        return index;
    }

}
