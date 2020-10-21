package org.dorokhov.project_totolist.repository;

import org.dorokhov.project_totolist.model.Task;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepository extends JpaRepository<Task, Long> {

    //Task getByTitle(String task_title);

}
