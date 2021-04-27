package tasks;

/**
 * Reverse string
 */

public class Task10 extends Task {
    static String taskName = "Task 10";
    String input = "abcdef";

    public String getTaskName() {
        return taskName;
    }

    public String task() {
        return input;
    }

    public boolean test() {
        String output = "fedcba";
        
        return output.equals(task());
    }
}
