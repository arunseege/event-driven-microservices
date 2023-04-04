package com.javaguides.orderservice.kafka;

import com.javaguides.basedomainsservice.dto.OrderEvent;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer{
    private NewTopic topic;
    private KafkaTemplate<String, OrderEvent> kafkaTemplate;
    private static final Logger LOGGER= LoggerFactory.getLogger(OrderProducer.class);


    public OrderProducer(NewTopic newTopic, KafkaTemplate<String, OrderEvent> kafkaTemplate) {
        this.topic = newTopic;
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(OrderEvent orderEvent){
        LOGGER.info(String.format("Order event ---> %s",orderEvent.toString()));
    //create Message
        Message<OrderEvent> message = MessageBuilder.withPayload(orderEvent).setHeader(KafkaHeaders.TOPIC, topic.name()).build();
        kafkaTemplate.send(message);
    }
}
