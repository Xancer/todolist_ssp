package org.dorokhov.project_totolist.repository;

import org.dorokhov.project_totolist.model.Task;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Component;

@Component
public interface TaskRepository extends JpaRepository<Task, Long> {
   /* @Query("select t from task t where t = :task_title")
    Task findByName(@Param("task_title") String task_title);
    */

}
