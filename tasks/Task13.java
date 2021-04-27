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
        String[] output = new String[input1.length + input2.length];
        System.arraycopy(input1, 0, output, 0, input1.length);
        System.arraycopy(input2, 0, output, input1.length, input2.length);

        return output;
    }

    public boolean test() {
        String[] outputs = {"first", "array", "second", "array"};

        return Arrays.equals(outputs, task());
    }
}
