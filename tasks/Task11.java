package tasks;

public class Task11 extends Task {
    static String taskName = "Task 11";
    static String[] inputs = {"#this@notthis", "notme#butme@@#", "#here@@nothere#"};

    public String getTaskName() {
        return taskName;
    }

    public String task(String input) {
        return "";
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
