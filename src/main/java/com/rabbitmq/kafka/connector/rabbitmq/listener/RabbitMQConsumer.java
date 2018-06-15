package com.rabbitmq.kafka.connector.rabbitmq.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.kafka.connector.config.RabbitMQListenerConfig;
import com.rabbitmq.kafka.connector.model.DeviceInfo;
import com.rabbitmq.kafka.connector.processor.RabbitToKafkaProcessor;

@Component
public class RabbitMQConsumer {
	
	@Autowired
	private RabbitToKafkaProcessor rabbitToKafkaProcessor;
	
	@RabbitListener(queues = RabbitMQListenerConfig.QUEUE)
	public void processMessage (DeviceInfo deviceInfo) {
		System.out.println("consumed at connector app => " + deviceInfo.toString());
		rabbitToKafkaProcessor.processToKafka(deviceInfo);
	}
}
