package com.rabbitmq.kafka.connector.kafka.publisher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.rabbitmq.kafka.connector.model.DeviceInfo;

@Component
public class KafkaPublisher {
	
	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;

	@Value("${kafka.producer.topic}")
	private String kafkaTopic;

	public void send(DeviceInfo deviceInfo) {
		kafkaTemplate.send(kafkaTopic, (deviceInfo.getDeviceId() + ""), deviceInfo);
		System.out.println("sent to kafka => " + deviceInfo.toString());
	}

}
