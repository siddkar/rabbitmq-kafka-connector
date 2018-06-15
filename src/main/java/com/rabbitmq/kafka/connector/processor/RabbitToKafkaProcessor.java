package com.rabbitmq.kafka.connector.processor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rabbitmq.kafka.connector.kafka.publisher.KafkaPublisher;
import com.rabbitmq.kafka.connector.model.DeviceInfo;

@Component
public class RabbitToKafkaProcessor {

	@Autowired
	private KafkaPublisher kafkaPublisher;

	public void processToKafka(DeviceInfo deviceInfo) {
		kafkaPublisher.send(deviceInfo);
	}

}
