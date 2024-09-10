package com.tribrine.practice.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msgSender")
public class MessageSender {

    private final MessageService messageService;

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }
}
