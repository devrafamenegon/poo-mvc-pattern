package controllers;

import models.Task;
import views.TaskView;

// Controlador (Controller)
public class TaskController {
    private Task model;
    private TaskView view;

    public TaskController(Task model, TaskView view) {
        this.model = model;
        this.view = view;
    }

    public void setTaskDescription(String description) {
        model = new Task(description);
    }

    public String getTaskDescription() {
        return model.getDescription();
    }

    public void setTaskCompleted(boolean completed) {
        model.setCompleted(completed);
    }

    public void updateView() {
        view.printTaskDetails(model.getDescription(), model.isCompleted());
    }
}

