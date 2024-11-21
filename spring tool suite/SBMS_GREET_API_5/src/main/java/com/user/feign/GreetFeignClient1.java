package com.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SBMS-GREET-API1")
public interface GreetFeignClient1 {
	
@GetMapping("/game/index")
public String invoke1Home();
}