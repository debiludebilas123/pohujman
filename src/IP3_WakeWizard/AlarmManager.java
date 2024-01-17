package IP3_WakeWizard;

import java.util.ArrayList;
import java.util.Scanner;

public class AlarmManager {
    private static ArrayList<Alarm> alarms;


    public AlarmManager() {
        alarms = new ArrayList<>();
    }

    public static void manipulateAlarm(ArrayList<Alarm> alarms, int index, boolean status) {
        Alarm newAlarm = new Alarm(index, alarms.get(index).getName(), alarms.get(index).getTime(), status);
        alarms.set(index, newAlarm);
    }

    public static void editAlarm(ArrayList<Alarm> alarms, int index, int choice) {
        Scanner scanner = new Scanner(System.in);
        if (choice == 1) {
            System.out.println("Enter the new name: ");
            String newName = scanner.next();
            String time = alarms.get(index).getTime();
            boolean status = alarms.get(index).getStatus();
            Alarm newAlarm = new Alarm(index, newName, time, status);
            alarms.set(index, newAlarm);
        } else if (choice == 2) {
            System.out.println("Enter the new time: ");
            String newTime = scanner.next();
            String name = alarms.get(index).getName();
            boolean status = alarms.get(index).getStatus();
            Alarm newAlarm = new Alarm(index, name, newTime, status);
            alarms.set(index, newAlarm);
        }
    }

    public static void removeAlarm(ArrayList<Alarm> alarms, int index) {
        alarms.remove(index);
    }

    public static void addAlarm(String name, String time, boolean status) {
        Alarm newAlarm = new Alarm(alarms.size(), name, time, status);
        alarms.add(newAlarm);
    }

    public static void addAlarm(int index, String name, String time, boolean status) {
        Alarm newAlarm = new Alarm(index,name,time,status);
        alarms.add(newAlarm);
    }

    public static ArrayList<Alarm> getAlarms() {
        return alarms;
    }

    public static void printAlarms() {
        for (Alarm alarm : alarms) {
            System.out.println(alarm.getIndex() + " | Name: " + alarm.getName() + " - " + alarm.getTime() + " " + (alarm.getStatus() ? "On" : "Off"));
        }
    }


}
