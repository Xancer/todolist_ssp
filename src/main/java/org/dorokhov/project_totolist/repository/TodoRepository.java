package org.dorokhov.project_totolist.repository;

import org.dorokhov.project_totolist.model.Todo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Component;

@Component
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
