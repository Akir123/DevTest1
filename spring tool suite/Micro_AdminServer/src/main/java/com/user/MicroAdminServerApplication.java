package com.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class MicroAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroAdminServerApplication.class, args);
	}

}
