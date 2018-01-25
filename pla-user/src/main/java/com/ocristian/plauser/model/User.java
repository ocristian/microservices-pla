package com.ocristian.plauser.model;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

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

    @NonNull
    private String login;

    @NonNull
    private String password;

}
