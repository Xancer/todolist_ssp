package org.dorokhov.project_totolist.service;

import org.dorokhov.project_totolist.model.Todo;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public interface TodoService {

    void addTodo(Todo todo);
    void delete(long id);
    List<Todo> getAll();

}
