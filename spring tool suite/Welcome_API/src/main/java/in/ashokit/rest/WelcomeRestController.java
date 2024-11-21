package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import in.ashokit.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;
	
	@GetMapping("/welcome")
public String getWelcomeMsg() {
	
	//RestTemplate rt = new RestTemplate();
	//ResponseEntity<String> forEntity = rt.getForEntity("http://localhost:8081/greet", String.class);
	String greetResp = greetClient.greet();
	return greetResp + ", welcome to ashok IT";
}
}
