package com.tribrine.practice.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("msgSender")
public class MessageSender {

    private final MessageService messageService;

    private MessageService smsService;

    //@Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
        System.out.println("Initializing MessageSender 1");
    }

    @Autowired
    public MessageSender(@Qualifier("emailService") MessageService messageService, @Qualifier("sms") MessageService smsService) {
        this.messageService = messageService;
        this.smsService = smsService;
        System.out.println("Initializing MessageSender 2");
    }

    public void sendMessage(String message) {

        messageService.sendMessage(message);
        smsService.sendMessage(message);
    }
}
