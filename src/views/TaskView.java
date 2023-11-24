package views;

// Visão (View)
public class TaskView {
    public void printTaskDetails(String description, boolean completed) {
        System.out.println("models.Task: " + description);
        System.out.println("Completed: " + completed);
        System.out.println("------------");
    }
}

