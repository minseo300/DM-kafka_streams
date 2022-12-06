//package com.cdc.impl;
//
//import org.apache.kafka.clients.consumer.ConsumerConfig;
//import org.apache.kafka.common.serialization.StringDeserializer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.env.Environment;
//import org.springframework.kafka.annotation.EnableKafka;
//import org.springframework.kafka.core.ConsumerFactory;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@EnableKafka
//@Configuration
//public class KafkaConsumerConfig {
//
//    private Environment env;
//
//    @Autowired
//    KafkaConsumerConfig(Environment env){
//        this.env=env;
//    }
//
//    public ConsumerFactory<String,String> consumerFactory(){
//        Map<String,Object> props=new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,env.getProperty("bootstrap.servers"));
//        props.put(ConsumerConfig.GROUP_ID_CONFIG,"foo");
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringDeserializer.class);
//        return new DefaultKafkaProducerFactory<>(props);
//    }
//}
