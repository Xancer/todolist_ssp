package org.dorokhov.project_totolist.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "todo")
public class Todo {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "todo_title")
    private String todo_title;
    private List<Task> tasks;

    public Todo() {
    }

    public Todo(Long id, String todo_title, List<Task> tasks) {
        this.id = id;
        this.todo_title = todo_title;
        this.tasks = tasks;
    }

    public Todo(String todo_title, List<Task> taskList) {
        this.todo_title = todo_title;
        this.tasks = taskList;
    }

    public String getTodo_title() {
        return todo_title;
    }

    public void setTodo_title(String todo_title) {
        this.todo_title = todo_title;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
