package top.study.pub_sub_provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableJms
@EnableScheduling
public class PubSubProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PubSubProviderApplication.class, args);
    }

}
