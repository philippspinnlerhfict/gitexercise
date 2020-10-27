package tasks;

public class Task5 extends Task {
    static String taskName = "Task 5";
    static String input = "HelloWorld";

    public String getTaskName() {
        return taskName;
    }

    public String task() {
        return input;
    }

    public boolean test() {
        String output = "dlroWolleH";
        return output.equals(task());
    }
}
