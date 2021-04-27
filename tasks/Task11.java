package tasks;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Filter everything between # and @
 */

public class Task11 extends Task {
    static String taskName = "Task 11";
    static String[] inputs = {"#this@notthis", "notme#butme@@#", "#here@@nothere#"};

    public String getTaskName() {
        return taskName;
    }

    public String task(String input) {
        String output = input.split("#")[1];
        return output.split("@")[0];
    }

    public boolean test() {
        String[] outputs = {"this", "butme", "here"};

        for (int i=0; i<inputs.length; i++) {
            if (!outputs[i].equals(task(inputs[i]))) {
                return false;
            }
        }
        return true;
    }
}
