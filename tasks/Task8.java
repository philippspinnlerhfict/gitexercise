package tasks;

import java.util.Arrays;

/**
 * Sort between first and last entry
 */

public class Task8 extends Task {
    static String taskName = "Task 8";
    static int[] input = {9, 7, 3, 2, 1, 5, 8, 4, 6};

    public String getTaskName() {
        return taskName;
    }

    public int[] task() {
        Arrays.sort(input, 1, input.length - 1);
        return input;
    }

    public boolean test() {
        int[] output = {9, 1, 2, 3, 4, 5, 7, 8, 6};
        
        return Arrays.equals(task(), output);
    }
}
