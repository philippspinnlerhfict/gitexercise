package tasks;

public class Task6 extends Task {
    static String taskName = "Task 6";
    static String[] inputs = {"HelloWorld", "Java"};

    public String getTaskName() {
        return taskName;
    }

    public String task(String input) {
        return input;
    }

    public boolean test() {
        String[] outputs = {"H_e_l_l_o_W_o_r_l_d", "J_a_v_a"};

        for (int i=0; i<inputs.length; i++) {
            if (!outputs[i].equals(task(inputs[i]))) {
                return false;
            }
        }
        return true;
    }
}
