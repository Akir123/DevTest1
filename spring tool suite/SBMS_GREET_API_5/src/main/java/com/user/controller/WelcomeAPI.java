package com.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.feign.GreetFeignClient;
import com.user.feign.GreetFeignClient1;

@RestController
@RequestMapping("/pen")
public class WelcomeAPI {
	
	@Autowired
	private GreetFeignClient greetClient;
	
	@Autowired
	private GreetFeignClient1 greetClient1;
	
@GetMapping("/admin")
public String getWelcomeMsg() {
//	RestTemplate rt = new RestTemplate();
//	ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/greet/home", String.class);
//	String home = forEntity.getBody();
	String home = greetClient.invokeHome();
	String m1 = greetClient1.invoke1Home();
	return home +" "+ m1+" " +"admin";
}
}
