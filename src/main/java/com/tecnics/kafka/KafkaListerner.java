package com.tecnics.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListerner {

    Logger logger = LoggerFactory.getLogger(KafkaListener.class);
    
    @KafkaListener(topics = "alerts", groupId = "groupid")
    void listener(String data) {
        logger.info("Listener received data " + data);
    }
}
