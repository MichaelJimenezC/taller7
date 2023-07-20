
package PatronFacade;

import FactoryMethod.Tarea;
import FactoryMethod.TareaFactory;
import Observer.Notificador;
import PatronStrategy.TaskDisplayStrategy;
import java.util.List;

public class TaskManagerFacade {
    private TareaFactory taskFactory;
    private TaskDisplayStrategy taskDisplayStrategy;
    private Notificador notificationService;
    
    public TaskManagerFacade(TareaFactory taskFactory, TaskDisplayStrategy taskDisplayStrategy, NotificationService notificationService) {
        this.taskFactory = taskFactory;
        this.taskDisplayStrategy = taskDisplayStrategy;
        this.notificationService = notificationService;
    }

    public Tarea createTask(String type, String description) {
        return taskFactory.crearTarea(type, description);
    }

    public void displayTasks(List<Tarea> tasks) {
        taskDisplayStrategy.display(tasks);
    }

    public void notifyUser() {
        notificationService.enviarNotificacion();
    }
}
