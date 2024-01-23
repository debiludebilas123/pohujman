package IP3_TaskWizard;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private static ArrayList<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public static void manipulateTask(ArrayList<Task> tasks, int index, boolean status) {
        Task newTask = new Task(index, tasks.get(index).getName(), tasks.get(index).getTime(), status);
        tasks.set(index, newTask);
    }

    public static void editTask(ArrayList<Task> tasks, int index, int choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Enter the new name: ");
            String newName = scanner.next();
            LocalDate time = tasks.get(index).getTime();
            boolean status = tasks.get(index).getStatus();
            Task newTask = new Task(index, newName, time, status);
            tasks.set(index, newTask);
        } else if (choice == 2) {
            System.out.println("Enter the new time: ");
            LocalDate newTime = LocalDate.parse(scanner.next());
            String name = tasks.get(index).getName();
            boolean status = tasks.get(index).getStatus();
            Task newTask = new Task(index, name, newTime, status);
            tasks.set(index, newTask);
        }
    }

    public static void removeTask(ArrayList<Task> tasks, int index) {
        tasks.remove(index);
    }

    public static void addTask(String name, LocalDate time, boolean status) {
        Task newTask = new Task(tasks.size(), name, time, status);
        tasks.add(newTask);
    }

    public static void addTask(int index, String name, LocalDate time, boolean status) {
        Task newTask = new Task(index, name, time, status);
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

    public static void printTasks() {
        for (Task task : tasks) {
            System.out.println(task.getIndex() + " | Name: " + task.getName() + " - " + task.getTime() + " " + (task.getStatus() ? "Completed" : "Due"));
        }
    }


}
