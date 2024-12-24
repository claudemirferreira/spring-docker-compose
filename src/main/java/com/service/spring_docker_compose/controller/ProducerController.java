package com.service.spring_docker_compose.controller;

import com.service.spring_docker_compose.kafka.config.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Autowired
    private ProducerService producerService;

    @GetMapping("/send-message")
    public String sendMessage(@RequestParam String message) {
        producerService.sendMessage(message);
        return "Mensagem enviada: " + message;
    }
}

