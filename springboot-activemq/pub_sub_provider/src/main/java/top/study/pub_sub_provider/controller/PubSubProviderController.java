package top.study.pub_sub_provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Topic;

@RestController
public class PubSubProviderController {

    @Autowired
    private Topic topic;

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Scheduled(fixedDelay = 3000)
    public void send() {
        jmsMessagingTemplate.convertAndSend(topic, "持久化");
        System.out.println("已发送");
    }
}
