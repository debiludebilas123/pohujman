package IP3_WakeWizard;

import java.util.Scanner;

public class WakeWizard {
    public static void main(String[] args) {
        String[][] matrix1 = new String[10][3];
        choice();
    }

    public static void menu() {
        System.out.println("""
                1. Add an alarm
                2. Remove an alarm
                3. Edit an alarm
                4. Manipulate alarms""");
    }

    public static int choice() {
        Scanner scanner = new Scanner(System.in);
        menu();
        System.out.print("Enter the corresponding number to your choice: ");
        return scanner.nextInt();
    }

    public static String[][] addAlarm(String[][] matrix1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alarm name if wanted: ");
        matrix1[0][0] = scanner.next();
        System.out.println("Enter alarm time (military time): ");
        matrix1[0][1] = scanner.next();
        System.out.println("""
                Pick an alarm sound
                1. Gunshots
                2. Air raid sirens
                3. Cannon firing""");
        int audio = scanner.nextInt();

        switch (audio) {
            case 1 -> {
                matrix1[0][2] = "gunshots.wav";
            }
            case 2 -> {

            }
            case 3 -> {

            }
        }
        return matrix1;
    }
}
