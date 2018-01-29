package com.ocristian.plamail.service.impl;

import com.ocristian.plamail.dto.UserDto;
import com.ocristian.plamail.entity.Mail;
import com.ocristian.plamail.repository.MailRepository;
import com.ocristian.plamail.service.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

/**
 * Created by Cristian Silva on 25/01/18.
 */
@Component
@Slf4j
public class MailServiceImpl implements MailService {

    @Autowired
    public JavaMailSender emailSender;

    @Autowired
    public MailRepository mailRepository;

    @Override
    public void send(UserDto userDto) {

        Mail newEmail = Mail.builder().to(userDto.getEmail()).subject("Email subject").text("Email text.").build();

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(newEmail.getTo());
        mailMessage.setSubject(newEmail.getSubject());
        mailMessage.setText(newEmail.getText());

        mailRepository.save(newEmail);

        log.info("sending message='{}'", mailMessage);
        //emailSender.send(mailMessage);

    }
}
