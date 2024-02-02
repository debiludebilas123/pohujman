package IP3_TaskWizard;

import java.time.LocalDate;

public class Task {
    private int index;
    private String name;
    private LocalDate time;
    private boolean status;
    private int importance;
    private boolean overdue;


    public Task(int index, String name, LocalDate time, boolean status, int importance, boolean overdue) {
        this.index = index;
        this.name = name;
        this.time = time;
        this.status = status;
        this.importance = importance;
        this.overdue = overdue;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getImportance() {
        return this.importance;
    }

    public boolean getOverdue() {
        return this.overdue;
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
