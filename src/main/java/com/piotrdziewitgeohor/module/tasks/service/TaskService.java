package com.piotrdziewitgeohor.module.tasks.service;

import com.piotrdziewitgeohor.module.tasks.entity.TasksEntity;
import com.piotrdziewitgeohor.module.tasks.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public TasksEntity getOne(Long taskID){
        return taskRepository.getOne(taskID);
    }


}
