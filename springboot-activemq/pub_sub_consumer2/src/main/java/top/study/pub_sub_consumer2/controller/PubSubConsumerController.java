package top.study.pub_sub_consumer2.controller;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PubSubConsumerController {

    @JmsListener(destination = "topic-activemq", containerFactory = "topicListener2")
    public void getMessage(String msg) {
        System.out.println(msg);
    }
}
