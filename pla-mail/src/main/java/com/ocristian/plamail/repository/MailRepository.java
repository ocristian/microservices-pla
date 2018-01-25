package com.ocristian.plamail.repository;

import com.ocristian.plamail.entity.Mail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Cristian Silva on 25/01/18.
 */
public interface MailRepository extends CrudRepository<Mail, Long> {
}
