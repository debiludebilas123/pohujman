package IP3_TaskWizard;

import java.time.LocalDate;

public class Task {
    private int index;
    private String name;
    private LocalDate time;
    private boolean status;

    public Task(int index, String name, LocalDate time, boolean status) {
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

    public LocalDate getTime() {
        return this.time;
    }

    public void setIndex(int index) {
        this.index = index;
    }

}
