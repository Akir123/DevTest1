package in.ashokit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {
	@Bean
	public SecurityFilterChain securityFilter(HttpSecurity http) throws Exception {
		System.out.println("security filter called....");
		http.authorizeHttpRequests((req)-> 
		req.requestMatchers("/hiii","/byeee")
		.permitAll()
		.anyRequest()
		.authenticated()
		).formLogin();
	return http.build();
}
}
