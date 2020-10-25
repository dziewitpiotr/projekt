package com.piotrdziewitgeohor.module.tasks.entity;

import javax.persistence.*;

@Entity
@Table(name="tasks")
public class TasksEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    


}
