package com.ocristian.plauser.producer;

import com.ocristian.plauser.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Slf4j
public class KafkaProducerSender {

    private KafkaTemplate<String, User> kafkaTemplate;

    @Autowired
    KafkaProducerSender(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(String topic, User payload) {
        log.info("sending payload='{}' to topic='{}'", payload, topic);
        kafkaTemplate.send(topic, payload);
    }
}
