package tasks;

import java.util.Arrays;

/**
 * Check if int is odd or even
 */

public class Task12 extends Task {
    static String taskName = "Task 12";
    static int[] input = {1, 3, 20, 5, 32, 24};

    public String getTaskName() {
        return taskName;
    }

    public String[] task() {
        String[] output = new String[input.length];
        for (int i = 0; i < output.length; i++) {
            if (input[i] % 2 == 0) {
                output[i] = "even";
            } else {
                output[i] = "odd";
            }
        }
        return output;
    }

    public boolean test() {
        String[] outputs = {"odd", "odd", "even", "odd", "even", "even"};

        return Arrays.equals(outputs, task());
    }
}
