package tasks;
import java.util.Arrays;

/**
 * Lowercase
 */

public class Task2 extends Task {
    static String taskName = "Task 2";
    static String[] input = {"small", "Small", "SMALL", "SmaLL", "BIG", "big", "Big"};

    public String getTaskName() {
        return taskName;
    }

    public String[] task() {
        return input;
    }

    public boolean test() {
        String[] output = {"small", "small", "small", "small", "big", "big", "big"};
        return (Arrays.equals(output, task()));
    }
}
