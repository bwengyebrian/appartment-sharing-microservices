package edu.mum.ea.projects.kafkaservice.engine;

import  edu.mum.ea.projects.kafkaservice.dto.Message;
import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Service
public class Consumer {

    @Value(value = "${kafka.bootstrapAddress}")
    private String bootstrapAddress;

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users",
    containerFactory = "greetingKafkaListenerContainerFactory")
    public void consume(Message message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }

    @KafkaListener(topics = "test", groupId = "group_id")
    public void consume2(String message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }

    public ConsumerFactory<String, Message> greetingConsumerFactory() {
        Map<String, Object> props = new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapAddress);
        props.put(ConsumerConfig.GROUP_ID_CONFIG, "group_id");
        return new DefaultKafkaConsumerFactory<>(props, new StringDeserializer(), new JsonDeserializer<>(Message.class));
    }

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, Message> greetingKafkaListenerContainerFactory() {
        ConcurrentKafkaListenerContainerFactory<String, Message> factory = new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(greetingConsumerFactory());
        return factory;
    }


}
