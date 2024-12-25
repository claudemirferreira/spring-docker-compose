package com.service.spring_docker_compose.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    private static final String TOPIC = "my-topic";

    @KafkaListener(topics = TOPIC, groupId = "my-consumer-group")
    public void listen(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
}

