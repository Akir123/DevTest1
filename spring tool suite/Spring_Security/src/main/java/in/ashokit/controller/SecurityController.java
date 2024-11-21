package in.ashokit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/hiii")
	public String getHello() {
	return " not fine";
}
	@GetMapping("/byeee")
	public String getBay() {
		return "i am fine ok!";
	}
	
	@GetMapping("/hello")
	public String getMody() {
		return "bad";
	}
	
	@GetMapping("/wow")
	public String getMoney() {
		return "tired";
	}
}
