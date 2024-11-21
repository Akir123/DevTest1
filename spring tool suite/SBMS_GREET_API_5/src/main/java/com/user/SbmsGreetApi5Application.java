package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SbmsGreetApi5Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsGreetApi5Application.class, args);
	}

}
