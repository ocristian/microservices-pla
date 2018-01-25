package com.ocristian.plauser.service;

import com.ocristian.plauser.entity.User;

/**
 * Created by Cristian Silva on 25/01/18.
 */
public interface UserService {

    User register(User user);

    Iterable<User> findAll();
}
