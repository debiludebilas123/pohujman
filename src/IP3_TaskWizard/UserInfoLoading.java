package IP3_TaskWizard;

import java.io.IOException;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Scanner;

public class UserInfoLoading {

    public void loadInfo(String username) throws IOException {
        Scanner fileScan = new Scanner(Paths.get("UserData.txt"));
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            String[] usernameIndicator = line.split("\\$");
            if (usernameIndicator[0].equals(username)) {
                if (usernameIndicator.length > 1 && !usernameIndicator[1].isEmpty()) {
                    String[] things = usernameIndicator[1].split("\\|");
                    for (String thing : things) {
                        String[] things1 = thing.split(",");
                        TaskManager.addTask(Integer.parseInt(things1[0]), things1[1], LocalDate.parse(things1[2]), Boolean.parseBoolean(things1[3]));
                    }
                }
                break;
            }
        }
    }

}
