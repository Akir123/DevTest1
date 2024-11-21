package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Microservices3Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservices3Application.class, args);
	}

}