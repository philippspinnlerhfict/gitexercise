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
        int i= 0;
        for(String inp: input){

            input[i] = inp.toUpperCase();
            i++;
        }


        return input; 
    }

    public boolean test() {
        String[] output = {"SMALL", "SMALL", "SMALL", "SMALL", "BIG", "BIG", "BIG"};
        return (Arrays.equals(output, task()));
    }
}
