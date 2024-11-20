package com.myc.producerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private static final String QUEUE_NAME = "queue";

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(String message) {

        jmsTemplate.convertAndSend(QUEUE_NAME, message);
    }
}