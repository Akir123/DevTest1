package com.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("GREET-API")
public interface GreetFeignClient {
	
@GetMapping("/greet/home")
public String invokeHome();

}

