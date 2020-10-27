package tasks;

import java.util.Arrays;

public class Task9 extends Task {
    static String taskName = "Task 9";
    int[] input = {9, 7, 3, 2, 1, 5, 8, 4, 6};

    public String getTaskName() {
        return taskName;
    }

    public int[] task() {
        return input;
    }

    public boolean test() {
        int[] output = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        return Arrays.equals(task(), output);
    }
}
