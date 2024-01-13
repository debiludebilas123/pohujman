package IP3_WakeWizard;

public class Alarm {
    private String name;
    private String time;

    public Alarm(String name, String time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return this.name;
    }

    public String getTime() {
        return this.time;
    }

}
