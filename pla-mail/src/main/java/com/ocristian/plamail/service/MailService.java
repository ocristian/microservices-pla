package com.ocristian.plamail.service;

import com.ocristian.plamail.dto.UserDto;

/**
 * Created by Cristian Silva on 25/01/18.
 */
public interface MailService {

    void send(UserDto userDto);
}
