package com.example.consumerservice.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {
    @JmsListener(destination = "queue")
    public void listen(String message){
        System.out.println("received message : "+ message);
    }
}
