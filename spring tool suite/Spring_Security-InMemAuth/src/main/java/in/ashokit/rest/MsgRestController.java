package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/contact")
public String contact() {
	return "Contact Us : 7030043130";
}

	@GetMapping("/greet")
public String greetMsg() {
	return "Good Evening";
}
	
	@GetMapping("/welcome")
public String welcomeMsg() {
	return "Welcome to our app";
}
	
}
