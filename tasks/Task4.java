package tasks;
import java.util.Arrays;

/**
 * One character per iteration
 */

public class Task4 extends Task {
    static String taskName = "Task 4";
    static String[] input = {"Hello", "Hello", "Hello", "Hello", "Hello"};

    public String getTaskName() {
        return taskName;
    }

    public String[] task() {
        return input;
    }

    public boolean test() {
        String[] output = {"H", "e", "l", "l", "o"};
        return (Arrays.equals(output, task()));
    }
}
