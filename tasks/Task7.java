package tasks;

import java.util.Arrays;

public class Task7 extends Task {
    static String taskName = "Task 7";
    static int[] input = {9, 7, 3, 2, 1, 5, 8, 4, 6};

    public String getTaskName() {
        return taskName;
    }

    public int[] task() {
        return input;
    }

    public boolean test() {
        int[] output = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        return Arrays.equals(task(), output);
    }
}
