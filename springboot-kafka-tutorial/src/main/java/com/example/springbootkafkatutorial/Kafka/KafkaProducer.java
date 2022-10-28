package com.example.springbootkafkatutorial.Kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String , String>KafkaTemplate;   //this is generic

    public KafkaProducer(org.springframework.kafka.core.KafkaTemplate<String, String> kafkaTemplate) {
        this.KafkaTemplate = kafkaTemplate;
    }

    public  void SendMessage(String message){
        LOGGER.info(String.format("Message sent %s",message));
        KafkaTemplate.send("Topic1",message);

    }
}
