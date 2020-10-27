import tasks.Task;

class GitAssessment {
    public static void main(String args[]) {
        Task[] tasks = { };
        for (Task task: tasks) {
            if (task.test()) {
                System.out.println(task.getTaskName() + ": " + "passed");
            } else {
                System.out.println(task.getTaskName() + ": " + "failed");
            }
        }
    }
}
