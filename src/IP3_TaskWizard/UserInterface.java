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
        List<Task> tasks = TaskManager.getTasks();

        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] parts = line.split("\\$");
            if (username.equals(parts[0])) {
                StringBuilder string = new StringBuilder(username + "$");
                for (Task task : tasks) {
                    string.append(task.getIndex()).append(",").append(task.getName()).append(",").append(task.getTime()).append(",").append(task.getStatus()).append(",").append(task.getImportance()).append(",").append(task.getOverdue()).append("|");
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
        boolean overdue = false;

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

        if (time.isAfter(LocalDate.now())) {
            overdue = true;
        }
        int importance = TaskManager.importanceValidation();

        TaskManager.addTask(name, time, status, importance, overdue);
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
                2 - Date
                3 - Importance""");
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
