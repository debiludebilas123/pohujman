package IP3_WakeWizard;

public class Alarm {
    private int index;
    private String name;
    private String time;
    private boolean status;

    public Alarm(int index, String name, String time, boolean status) {
        this.index = index;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    public String getTime() {
        return this.time;
    }

}
