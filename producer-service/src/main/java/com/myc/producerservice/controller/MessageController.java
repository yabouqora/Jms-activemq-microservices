package com.myc.producerservice.controller;

import ch.qos.logback.classic.pattern.MessageConverter;
import com.myc.producerservice.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        messageService.sendMessage(message);
        return "Message sent "+message;
    }
}
