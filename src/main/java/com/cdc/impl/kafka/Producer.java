//package com.cdc.impl.kafka;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class Producer {
//    private static final String TOPIC = "accounts";
//    private final KafkaTemplate<String, String> kafkaTemplate;
//
//    public void sendMessage(String request) {
//        System.out.println(String.format("Produce message : %s", request));
//        this.kafkaTemplate.send(TOPIC, request);
//    }
//}
//
