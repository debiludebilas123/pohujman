package IP3_WakeWizard;

import java.util.ArrayList;

public class AlarmManager {
    private static ArrayList<Alarm> alarms;

    public AlarmManager() {
        alarms = new ArrayList<>();
    }

    public static void addAlarm(String name, String time) {
        Alarm newAlarm = new Alarm(name, time);
        alarms.add(newAlarm);
    }

    public ArrayList<Alarm> getAlarms() {
        return alarms;
    }

    public static void printAlarms() {
        for (Alarm alarm : alarms) {
            System.out.println(alarm.getName() + alarm.getTime());
        }
    }


}
