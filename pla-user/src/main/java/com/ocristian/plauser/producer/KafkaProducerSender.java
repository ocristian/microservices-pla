package com.ocristian.plauser.producer;

import com.ocristian.plauser.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Slf4j
@Service
public class KafkaProducerSender {

    @Autowired
    private KafkaTemplate<String, User> kafkaTemplate;

    public void send(String topic, User payload) {
        log.info("sending payload='{}' to topic='{}'", payload, topic);
        kafkaTemplate.send(topic, payload);
    }
}
