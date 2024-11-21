package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greet")
public class GreetRestController {
	
	@Autowired
	private Environment env;

    @GetMapping("/home")
    public String home() {
    	String port = env.getProperty("server.port");
        return "home (" + port + ")"; // Refers to src/main/resources/templates/home.html
    }
}

