package com.suhas.kafka.producerexamplespringboot.controller;

import com.suhas.kafka.producerexamplespringboot.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

//    @Autowired
//    KafkaTemplate<String,String> template;
//
//
//
//    @GetMapping("/publish/{type}")
//    public String publishMessage(@PathVariable String type){
//        template.send("Hello-Kafka","message of "+ type+" created");
//        return "Message published";
//    }


    @Autowired
    KafkaTemplate<String,UserData> template;

    @GetMapping("/publishJson")
    public String publishMessage(){
        template.send("Hello-Kafka",new UserData("Suhas",500000,100));
        return "Message of Object type user was Published";
    }

}
