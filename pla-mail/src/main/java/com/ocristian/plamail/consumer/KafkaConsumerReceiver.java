package com.ocristian.plamail.consumer;

import com.ocristian.plamail.dto.UserDto;
import com.ocristian.plamail.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Slf4j
public class KafkaConsumerReceiver {

    private CountDownLatch latch;

    @Autowired
    private MailService mailService;

    public KafkaConsumerReceiver() {
        latch = new CountDownLatch(1);
    }

    @KafkaListener(topics = "${spring.kafka.topic.userCreated}")
    public void receive(UserDto payload) {
        log.info("received payload='{}'", payload);
        mailService.send(payload);
        latch.countDown();
    }
}
