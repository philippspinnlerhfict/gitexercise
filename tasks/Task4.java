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
        String output[] = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            char j = input[i].charAt(i);
            output[i] = String.valueOf(j);
        }
        return output;
    }

    public boolean test() {
        String[] output = {"H", "e", "l", "l", "o"};
        return (Arrays.equals(output, task()));
    }
}
