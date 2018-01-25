package com.ocristian.plamail.service.impl;

import com.ocristian.plamail.dto.UserDto;
import com.ocristian.plamail.entity.Mail;
import com.ocristian.plamail.repository.MailRepository;
import com.ocristian.plamail.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

/**
 * Created by Cristian Silva on 25/01/18.
 */
public class MailServiceImpl implements MailService {

    public JavaMailSender emailSender;

    public MailRepository mailRepository;

    @Autowired
    MailServiceImpl(JavaMailSender emailSender, MailRepository mailRepository) {
        this.emailSender = emailSender;
        this.mailRepository = mailRepository;
    }

    @Override
    public void send(UserDto userDto) {

        Mail newEmail = Mail.builder().to(userDto.getMail()).subject("Email subject").text("Email text.").build();

        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo(newEmail.getTo());
        mailMessage.setSubject(newEmail.getSubject());
        mailMessage.setText(newEmail.getText());

        mailRepository.save(newEmail);

        emailSender.send(mailMessage);

    }
}
