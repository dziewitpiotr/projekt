package com.piotrdziewitgeohor.module.users.entity;

import javax.persistence.*;

@Entity
@Table(name="users")

public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String name;
    private String surmane;
    private CompanyName companyName;
    private String phoneNumber;
    private String email;
}

