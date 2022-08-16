package com.tecnics.kafka;

import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListerner {
    
    @KafkaListener(topics = "sometopic", groupId = "groupid")
    void listener(String data) {
        System.out.println("Listener received data " + data);
    }
}
