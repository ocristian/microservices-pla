package com.ocristian.plauser.repository;

import com.ocristian.plauser.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Cristian Silva on 25/01/18.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
