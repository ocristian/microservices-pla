package com.ocristian.plamail.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Data
@Builder
@Entity
@Table(name = "mail")
public class Mail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Email
    @NotNull
    @Size(message = "Please, tell us the recipient's e-mail ")
    private String to;

    @NotNull
    private String subject;

    @NotNull
    private String text;

}
