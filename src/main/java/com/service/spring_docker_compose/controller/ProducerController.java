package com.service.spring_docker_compose.controller;

import com.service.spring_docker_compose.kafka.consumer.ConsumerService;
import com.service.spring_docker_compose.kafka.producer.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    private final ProducerService consumerService;

    public ProducerController(ProducerService consumerService) {
        this.consumerService = consumerService;
    }

    @GetMapping("/send-message")
    public String sendMessage(@RequestParam final String message) {
        consumerService.sendMessage(message);
        return "Mensagem enviada: " + message;
    }
}

