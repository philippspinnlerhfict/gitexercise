package tasks;

/**
 * Reverse string
 */

public class Task10 extends Task {
    static String taskName = "Task 10";
    String input = "abcdef";

    public String getTaskName() {
        return taskName;
    }

    public String task() {
        byte[] temp = input.getBytes();
        byte[] result = new byte[temp.length];

        for (int i = 0; i < temp.length; i++) {
            result[result.length - i - 1] = temp[i];
        }

        return new String(result);
    }

    public boolean test() {
        String output = "fedcba";
        
        return output.equals(task());
    }
}
