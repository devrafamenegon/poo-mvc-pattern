import controllers.TaskController;
import models.Task;
import views.TaskView;

public class Main {
    public static void main(String[] args) {
        // Criando o modelo, visão e controlador
        Task model = new Task("Estudar padrão MVC");
        TaskView view = new TaskView();
        TaskController controller = new TaskController(model, view);

        // Inicialmente, exibindo os detalhes da tarefa
        controller.updateView();

        // Atualizando a descrição da tarefa e marcando como concluída
        controller.setTaskDescription("Escrever código de exemplo MVC");
        controller.setTaskCompleted(true);

        // Exibindo os detalhes atualizados da tarefa
        controller.updateView();
    }
}
