//package com.cdc.impl.kafka;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.kafka.annotation.KafkaListener;
//import org.springframework.stereotype.Component;
//
//import java.io.IOException;
//
//@Component
//@RequiredArgsConstructor
//public class Consumer {
//
//    @KafkaListener(topics = "accounts", groupId = "foo")
//    public void consume(String message) throws IOException {
//        System.out.println(String.format("Consumed message : %s", message));
//    }
//}
//
