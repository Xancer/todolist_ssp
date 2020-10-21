package org.dorokhov.project_totolist.service;

import org.dorokhov.project_totolist.model.Task;

import java.util.List;

public interface TaskService {

    //logic bisnes
    void addTask(Task task);

    void delete(long id);

    Task getByTitle(String task_title);

    Task editTask(Task task);

    List<Task> getAll();
}
