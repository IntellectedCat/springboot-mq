package top.study.p2p_provider.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.Queue;


@Configuration
public class ActiveMQConfig {

    @Bean
    public Queue getQueue() {
        return new ActiveMQQueue("queue-activemq");
    }
}
