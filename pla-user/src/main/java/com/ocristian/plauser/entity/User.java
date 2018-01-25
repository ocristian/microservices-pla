package com.ocristian.plauser.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Data
@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotNull
    private String email;

    @NotNull
    private String password;

}
