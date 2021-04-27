import tasks.Task;
import tasks.Task1;
import tasks.Task11;
import tasks.Task12;
import tasks.Task13;
import tasks.Task14;
import tasks.Task15;

class GitAssessment {
    public static void main(String[] args) {
        Task[] tasks = { new Task1(), new Task11(), new Task12(), new Task13(), new Task14(), new Task15() };
        for (Task task: tasks) {
            if (task.test()) {
                System.out.println(task.getTaskName() + ": " + "passed");
            } else {
                System.out.println(task.getTaskName() + ": " + "failed");
            }
        }
    }
}
