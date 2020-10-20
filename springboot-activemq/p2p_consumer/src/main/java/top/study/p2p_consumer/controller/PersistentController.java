package top.study.p2p_consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class PersistentController {


    @JmsListener(destination = "queue-activemq", containerFactory = "topicListener")
    public void getMessage(String text) {
        System.out.println(text);
    }
}
