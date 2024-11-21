package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.constant.AppConstants;

@SpringBootApplication
public class Kafka2Application {

	public static void main(String[] args) {
		SpringApplication.run(Kafka2Application.class, args);
	}


}
