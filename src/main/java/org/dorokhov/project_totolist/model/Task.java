package org.dorokhov.project_totolist.model;

import javax.persistence.*;
import java.sql.Date;

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
    @Column(name = "task_date_create")
    private Date task_date_create;
    @Column(name = "task_date_change")
    private Date task_date_change;
    @Column(name = "case_urgency")
    private int case_urgency;

    public Task(){};
    public Task(Long id, String task_title, boolean task_done,
            Date task_data_create,Date task_date_change,int case_urgency){
        this.id = id;
        this.task_title = task_title;
        this.task_done = task_done;
        this.task_date_create = task_data_create;
        this.task_date_change = task_date_change;
        this.case_urgency = case_urgency;
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

    public Date getTask_date_create() {
        return task_date_create;
    }

    public void setTask_date_create(Date task_date_create) {
        this.task_date_create = task_date_create;
    }

    public Date getTask_date_change() {
        return task_date_change;
    }

    public void setTask_date_change(Date task_date_change) {
        this.task_date_change = task_date_change;
    }

    public int getCase_urgency() {
        return case_urgency;
    }

    public void setCase_urgency(int case_urgency) {
        this.case_urgency = case_urgency;
    }
}
