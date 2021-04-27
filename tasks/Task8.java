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
        int[] temp = new int[input.length-2];

        for (int i = 1; i < input.length-1; i++){
            temp[i-1] = input[i];
        }

        Arrays.sort(temp);

        for (int i = 1; i < input.length-1; i++){
            input[i] = temp[i-1];
        }

        return input;
    }

    public boolean test() {
        int[] output = {9, 1, 2, 3, 4, 5, 7, 8, 6};
        
        return Arrays.equals(task(), output);
    }
}
