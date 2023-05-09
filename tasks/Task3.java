package tasks;
import java.util.Arrays;

/**
 * Trim
 */

public class Task3 extends Task {
    static String taskName = "Task 3";
    static String[] input = {" text ", "  text", "text  ", " te xt  "};

    public String getTaskName() {
        return taskName;
    }

    public String[] task() {
        for (int i = 0; i < input.length; i++) {
            String temp = input[i];
            input[i] = temp.trim();
        }
        return input;
    }
    

    public boolean test() {
        String[] output = {"text", "text", "text", "te xt"};
        return (Arrays.equals(output, task()));
    }
}
