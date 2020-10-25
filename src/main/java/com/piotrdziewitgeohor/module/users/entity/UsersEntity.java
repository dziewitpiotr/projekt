package com.piotrdziewitgeohor.module.users.entity;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="users")

public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    private String name;
    @NotNull
    private String surmane;
    @NotNull
    private CompanyName companyName;
    @NotNull
    private String phoneNumber;
    @NotNull
    @Email
    private String email;
}

