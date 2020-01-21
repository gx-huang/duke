public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        System.out.println("Got it, I've added this task");
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2713" : "\u2718"); //return tick or X symbols
    }

    public void markAsDone() {
        this.isDone = true;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "[" + this.getStatusIcon() + "] "
                + description;
    }
}
