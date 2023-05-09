package tasks;

/**
 * Reverse
 */

public class Task5 extends Task {
    static String taskName = "Task 5";
    static String input = "HelloWorld";

    public String getTaskName() {
        return taskName;
    }

    public String task() {
        String reversed = "";
        for (int i = 0; i < input.length(); i++) {
            reversed = input.charAt(i) + reversed;
        }
        input = reversed;
        return input;
    }

    public boolean test() {
        String output = "dlroWolleH";
        return output.equals(task());
    }
}
