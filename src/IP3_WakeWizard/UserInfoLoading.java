package IP3_WakeWizard;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class UserInfoLoading {

    public void loadInfo(String username) throws IOException {
        Scanner fileScan = new Scanner(Paths.get("UserData.txt"));
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] indicator = line.split("\\$");
            if (indicator[0].equals(username)) {
                String[] things = indicator[1].split("\\|");
                for (String thing : things) {
                    String[] things1 = thing.split(",");
                    AlarmManager.addAlarm(Integer.parseInt(things1[0]),things1[1],things1[2], Boolean.parseBoolean(things1[3]));
                }
            }
        }
    }

}
