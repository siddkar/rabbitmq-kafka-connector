package com.rabbitmq.kafka.connector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.rabbitmq.kafka.connector")
public class ConnectorApp {
	
	public static void main(String[] args) {
		SpringApplication.run(ConnectorApp.class, args);
	}
}
