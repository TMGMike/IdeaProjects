package Week13_Practical12;

/**
 * Created by u1764905 on 07/12/2017.
 */
public class Job implements Comparable<Job>{
    private String description;
    private int priority;
    private boolean completed;

    public Job(String description, int priority, boolean completed) {
        this.description = description;
        this.priority = priority;
        this.completed = completed;
    }
    public Job(String description, int priority) {
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }
    public Job(String description) {
        this.description = description;
        this.priority = 0;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public boolean getCompleted() {
        return this.completed;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public String toString() {
        return "\n Description: " + description + " | Priority: " + priority;
    }

    @Override
    public int compareTo (Job job){
        return this.priority - job.priority;
    }
}
