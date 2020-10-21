package org.dorokhov.project_totolist.controller;

import org.dorokhov.project_totolist.model.*;
import org.dorokhov.project_totolist.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class TodoController {
    private final TodoServiceImpl todoService;

    @Autowired
    public TodoController(TodoServiceImpl todoService){
        this.todoService = todoService;
    }


    @PostMapping(value = "/addTodo")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/findTodo")
    public ResponseEntity<List<Todo>> read() {
        final List<Todo> taskList = todoService.getAll();
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }

    @DeleteMapping("/deleteTodo/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        todoService.delete(id);
    }

}
