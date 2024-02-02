package IP3_TaskWizard;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public static void manipulateTask(ArrayList<Task> tasks, int index, boolean status) {
        Task newTask = new Task(index, tasks.get(index).getName(), tasks.get(index).getTime(), status, tasks.get(index).getImportance(), tasks.get(index).getOverdue());
        tasks.set(index, newTask);
    }

    public static void editTask(ArrayList<Task> tasks, int index, int choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Enter the new name: ");
            String newName = scanner.next();
            Task newTask = new Task(index, newName, tasks.get(index).getTime(), tasks.get(index).getStatus(), tasks.get(index).getImportance(), tasks.get(index).getOverdue());
            tasks.set(index, newTask);
        } else if (choice == 2) {
            boolean validDate = false;
            LocalDate newTime = null;
            System.out.println("Enter the new time YYYY-MM-DD: ");
            while (!validDate) {
                try {
                    String dateString = scanner.next();
                    newTime = LocalDate.parse(dateString);
                    validDate = true;
                } catch (DateTimeParseException e) {
                    System.out.println("Invalid input, enter according to the format.");
                }
            }
            Task newTask = new Task(index, tasks.get(index).getName(), newTime, tasks.get(index).getStatus(), tasks.get(index).getImportance(), tasks.get(index).getOverdue());
            tasks.set(index, newTask);
        } else if (choice == 3) {
            int newImportance = importanceValidation();
            Task newTask = new Task(index, tasks.get(index).getName(), tasks.get(index).getTime(), tasks.get(index).getStatus(), newImportance, tasks.get(index).getOverdue());
            tasks.set(index, newTask);
        }
    }

    public static void removeTask(ArrayList<Task> tasks, int index) {
        tasks.remove(index);
    }

    public static void addTask(String name, LocalDate time, boolean status, int importance, boolean overdue) {
        Task newTask = new Task(tasks.size(), name, time, status, importance, overdue);
        tasks.add(newTask);
    }

    public static void addTask(int index, String name, LocalDate time, boolean status, int importance, boolean overdue) {
        Task newTask = new Task(index, name, time, status, importance, overdue);
        tasks.add(newTask);
    }

    public static ArrayList<Task> getTasks() {
        return tasks;
    }

    public static void indexUpdater() {
        for (int i = 0; i < tasks.size(); i++) {
            tasks.get(i).setIndex(i);
        }
    }

    public static boolean isListEmpty() {
        return tasks.isEmpty();
    }

    public static int importanceValidation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new importance level 1-10: ");
        int newImportance;
        while (true) {
            try {
                newImportance = scanner.nextInt();
                if (newImportance < 0 || newImportance >10) {
                    System.out.println("Invalid input, try again.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input, enter a number.");
                scanner.next();
            }
        }
        return newImportance;
    }

    public static void printTasks() {
        System.out.println("Index | Name | Date | Completion Status | Importance | Overdue Status |");

        for (Task task : tasks) {
            String status = task.getStatus() ? "Completed" : "Due";
            String overdueStatus = task.getOverdue() ? "Overdue" : "Not Overdue";
            System.out.printf("%-5s | %-2s | %s | %-1s | %-5s | %s%n", task.getIndex(), task.getName(), task.getTime(), status, task.getImportance(), overdueStatus);
        }
    }
}
