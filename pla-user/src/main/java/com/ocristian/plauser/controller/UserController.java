package com.ocristian.plauser.controller;

import com.ocristian.plauser.entity.User;
import com.ocristian.plauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/members")
    public ResponseEntity<Iterable<User>> getAll() {

        Iterable<User> users = userService.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @RequestMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {

        User registeredUser = userService.register(user);
        return new ResponseEntity<>(registeredUser, HttpStatus.OK);
    }
}
