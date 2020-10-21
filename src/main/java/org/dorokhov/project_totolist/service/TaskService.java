package org.dorokhov.project_totolist.service;

import org.dorokhov.project_totolist.model.Task;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface TaskService {

    //logic bisnes
    void addTask(Task task);

    void delete(long id);

    Task getByTitle(String task_title);

    Task editTask(Task task);

    List<Task> getAll();
}
