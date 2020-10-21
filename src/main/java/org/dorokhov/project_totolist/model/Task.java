package org.dorokhov.project_totolist.model;

import javax.persistence.*;
@Entity
@Table(name = "task")
public class Task {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "task_title")
    private String task_title;
    @Column(name = "task_done")
    private boolean task_done;

    public Task(){};
    public Task(Long id, String task_title, boolean task_done){
        this.id = id;
        this.task_title = task_title;
        this.task_done = task_done;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public boolean isTask_done() {
        return task_done;
    }

    public void setTask_done(boolean task_done) {
        this.task_done = task_done;
    }
}
