package tasks;

import java.util.Arrays;


public class Task15 extends Task {
    static String taskName = "Task 15";
    static String[] input = {"Hallo", "World", "This", "Is", "Java"};

    public String getTaskName() {
        return taskName;
    }

    public int[] task() {
        return new int[0];
    }

    public boolean test() {
        int[] output = {5, 5, 4, 2, 4};

        return Arrays.equals(output, task());
    }
}
