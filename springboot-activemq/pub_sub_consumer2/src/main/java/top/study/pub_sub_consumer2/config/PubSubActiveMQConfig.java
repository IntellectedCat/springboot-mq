package top.study.pub_sub_consumer2.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Topic;

@Configuration
public class PubSubActiveMQConfig {

    @Bean
    public Topic topic() {
        return new ActiveMQTopic("topic-activemq");
    }

    @Value("${spring.activemq.broker-url}")
    private String brokerUrl;

    @Value("${spring.activemq.user}")
    private String userName;

    @Value("${spring.activemq.password}")
    private String password;

    @Bean
    public ConnectionFactory connectionFactory() {
        return new ActiveMQConnectionFactory(userName, password, brokerUrl);
    }

    @Bean(name = "topicListener2")
    public JmsListenerContainerFactory<?> topicJmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        SimpleJmsListenerContainerFactory factory = new SimpleJmsListenerContainerFactory();
        factory.setClientId("B");
        factory.setConnectionFactory(connectionFactory);
        factory.setSubscriptionDurable(true);
        factory.setPubSubDomain(true);
        return factory;
    }
}
