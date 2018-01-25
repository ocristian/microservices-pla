package com.ocristian.plauser.service.impl;

import com.ocristian.plauser.entity.User;
import com.ocristian.plauser.producer.KafkaProducerSender;
import com.ocristian.plauser.repository.UserRepository;
import com.ocristian.plauser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Value("${spring.kafka.topic.userCreated}")
    private String USER_CREATED_TOPIC;

    private UserRepository userRepository;

    private KafkaProducerSender sender;

    @Autowired
    UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.sender = sender;
    }

    @Override
    public User register(User user) {
        User createdUser = userRepository.save(user);
        sender.send(USER_CREATED_TOPIC, createdUser);
        return createdUser;
    }

    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }
}
