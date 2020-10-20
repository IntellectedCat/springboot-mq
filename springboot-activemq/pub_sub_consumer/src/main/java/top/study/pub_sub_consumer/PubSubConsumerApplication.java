package top.study.pub_sub_consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class PubSubConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PubSubConsumerApplication.class, args);
    }

}