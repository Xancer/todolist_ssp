package org.dorokhov.project_totolist.controller;

import org.dorokhov.project_totolist.model.Task;
import org.dorokhov.project_totolist.service.impl.TaskServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    private final TaskServiceImpl taskService;

    @Autowired
    public TaskController(TaskServiceImpl taskService){
        this.taskService = taskService;
    }


    @PostMapping(value = "/add")
    public ResponseEntity<Task> create(@RequestBody Task task) {
        taskService.addTask(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/findall")
    public ResponseEntity<List<Task>> read() {
        final List<Task> taskList = taskService.getAll();
        return new ResponseEntity<>(taskList, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable(value = "id") Long id) {
        taskService.delete(id);
    }
    /*
    @GetMapping("/task/{task_title}")
    public ResponseEntity<Task> getTaskByTitle(@PathVariable(value = "task_title") String task_title){
        Task task = taskService.getByTitle(task_title);
        return new ResponseEntity<>(task,HttpStatus.OK);

        if ()
               ResourceNotFoundException("Employee not found for this id :: " + task_title));

     */











}
