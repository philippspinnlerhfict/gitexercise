package tasks;

import java.util.Arrays;
import java.util.Collections;

/**
 * Reverse sorting
 */

public class Task9 extends Task {
    static String taskName = "Task 9";
    int[] input = {9, 7, 3, 2, 1, 5, 8, 4, 6};

    public String getTaskName() {
        return taskName;
    }

    public int[] task() {
        Arrays.sort(input);
        int[] out = new int[input.length];

        for (int i = 0; i < input.length; i++){
            out[i] = input[input.length - i - 1];
        }

        return out;
    }

    public boolean test() {
        int[] output = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        return Arrays.equals(task(), output);
    }
}
