package org.dorokhov.project_totolist.controller;

import org.dorokhov.project_totolist.model.*;
import org.dorokhov.project_totolist.service.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class TodoController {
    private final TodoServiceImpl todoService;

    @Autowired
    public TodoController(TodoServiceImpl todoService){
        this.todoService = todoService;
    }


    @PostMapping(value = "/addtodo")
    public ResponseEntity<Todo> addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/alltodo")
    public ResponseEntity<List<Todo>> getAll() {
        final List<Todo> todoList = todoService.getAll();
        return new ResponseEntity<>(todoList, HttpStatus.OK);
    }

    @DeleteMapping("/deleteTodo/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        todoService.delete(id);
    }

}
