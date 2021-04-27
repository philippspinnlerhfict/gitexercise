package tasks;

import java.util.Arrays;

/**
 * Distinct
 */

public class Task14 extends Task {
    static String taskName = "Task 14";
    static int[] input = {1, 2, 2, 3, 4, 4, 4, 5, 5};

    public String getTaskName() {
        return taskName;
    }

    public int[] task() {
        return input;
    }

    public boolean test() {
        int[] output = {1, 2, 3, 4, 5};

        return Arrays.equals(output, task());
    }
}
