package org.dorokhov.project_totolist.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "todo")
public class Todo {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "todo_title")
    private String todo_title;
    @Column(name = "todo_date_create")
    private Date todo_date_create;
    @Column(name = "todo_date_change")
    private Date task_date_change;

    public Todo() {
    }

    public Todo(Long id, String todo_title,
            Date todo_date_create, Date task_date_change) {
        this.id = id;
        this.todo_title = todo_title;
        this.todo_date_create = todo_date_create;
        this.task_date_change = task_date_change;

    }

    public String getTodo_title() {
        return todo_title;
    }

    public void setTodo_title(String todo_title) {
        this.todo_title = todo_title;
    }



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTodo_date_create() {
        return todo_date_create;
    }

    public void setTodo_date_create(Date todo_date_create) {
        this.todo_date_create = todo_date_create;
    }

    public Date getTask_date_change() {
        return task_date_change;
    }

    public void setTask_date_change(Date task_date_change) {
        this.task_date_change = task_date_change;
    }
}
