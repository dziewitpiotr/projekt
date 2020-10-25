package com.piotrdziewitgeohor.module.tasks.repository;

import com.piotrdziewitgeohor.module.tasks.entity.TasksEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TaskRepository extends JpaRepository<TasksEntity, Long>, JpaSpecificationExecutor<TasksEntity> {
}
