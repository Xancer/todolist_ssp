package org.dorokhov.project_totolist.service.impl;

import org.dorokhov.project_totolist.model.Todo;
import org.dorokhov.project_totolist.repository.TodoRepository;
import org.dorokhov.project_totolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;

import java.util.List;

@Component
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void addTodo(Todo todo) {
        todoRepository.save(todo);
    }

    @Override
    public void delete(long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }
}
