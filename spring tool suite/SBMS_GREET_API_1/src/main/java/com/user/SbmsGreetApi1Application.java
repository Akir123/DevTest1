package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SbmsGreetApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(SbmsGreetApi1Application.class, args);
	}

}
