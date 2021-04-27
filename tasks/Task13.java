package tasks;

import java.util.Arrays;

/**
 * Concat two arrays
 */

public class Task13 extends Task {
    static String taskName = "Task 13";
    static String[] input1 = {"first", "array"};
    static String[] input2 = {"second", "array"};

    public String getTaskName() {
        return taskName;
    }

    public String[] task() {
        return new String[0];
    }

    public boolean test() {
        String[] outputs = {"first", "array", "second", "array"};

        return Arrays.equals(outputs, task());
    }
}
