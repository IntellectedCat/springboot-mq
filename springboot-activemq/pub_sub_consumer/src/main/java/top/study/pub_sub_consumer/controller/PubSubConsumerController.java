package top.study.pub_sub_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Topic;

@RestController
public class PubSubConsumerController {

    @JmsListener(destination = "topic-activemq", containerFactory = "topicListener")
    public void getMessage(String msg) {
        System.out.println(msg);
    }
}
