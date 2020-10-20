package top.study.p2p_provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class PersistentController {

    @Autowired
    private Queue queue;

    @Autowired
    JmsMessagingTemplate jmsMessagingTemplate;

    @Scheduled(fixedDelay = 3000)
    public void send() {
        jmsMessagingTemplate.convertAndSend(queue, "持久化");
        System.out.println("已发送");
    }
}
