import tasks.Task;
import tasks.Task1;
import tasks.Task14;

class GitAssessment {
    public static void main(String[] args) {
        Task[] tasks = { new Task1(), new Task14() };
        for (Task task: tasks) {
            if (task.test()) {
                System.out.println(task.getTaskName() + ": " + "passed");
            } else {
                System.out.println(task.getTaskName() + ": " + "failed");
            }
        }
    }
}
