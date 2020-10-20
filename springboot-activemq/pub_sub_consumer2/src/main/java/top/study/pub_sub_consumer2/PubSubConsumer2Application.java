package top.study.pub_sub_consumer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
public class PubSubConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(PubSubConsumer2Application.class, args);
    }

}
