package tasks;
import java.util.Arrays;

/**
 * Uppercase
 */

public class Task1 extends Task {
    static String taskName = "Task 1";
    static String[] input = {"small", "Small", "SMALL", "SmaLL", "BIG", "big", "Big"};

    public String getTaskName() {
        return taskName;
    }

    public String[] task() {
        String[] output = new String[input.length];

        for (int x = 0; x < input.length; x++) {
            output[x] = input[x].toUpperCase();
        }

        return output;
    }

    public boolean test() {
        String[] output = {"SMALL", "SMALL", "SMALL", "SMALL", "BIG", "BIG", "BIG"};
        return (Arrays.equals(output, task()));
    }
}
