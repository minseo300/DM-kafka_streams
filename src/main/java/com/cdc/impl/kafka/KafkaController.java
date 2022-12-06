package com.cdc.impl.kafka;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//@RestController
//@RequiredArgsConstructor
//@RequestMapping(value = "/dbserver1/testdb/accounts")
//public class KafkaController {
//
//    private final Producer producer;
//
//
//    @PostMapping
//    public String sendMessage(@RequestBody KafkaRequest request) {
//        producer.sendMessage(request);
//
//        return "success";
//    }
//}

