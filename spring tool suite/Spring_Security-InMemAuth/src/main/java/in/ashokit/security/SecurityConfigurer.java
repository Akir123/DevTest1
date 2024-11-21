package in.ashokit.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import in.ashokit.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfigurer {

//    @Bean
//    public UserDetailsService configureUsers(PasswordEncoder passwordEncoder) {
//        UserDetails adminUser = User.withUsername("ashok")
//                                    .password(passwordEncoder.encode("ashok@123"))
//                                    .authorities("ADMIN")
//                                    .build();
//
//        
//        UserDetails normalUser = User.withUsername("raja")
//                .password(passwordEncoder.encode("raja@123"))
//                .authorities("USER")
//                .build();
//return new InMemoryUserDetailsManager(adminUser, normalUser);
//        
//    }
    @Autowired
	private MyUserDetailsService userDtlsService;
    
    @Autowired
    public void ConfigureUsers(AuthenticationManagerBuilder auth) throws Exception {
    	auth.userDetailsService(userDtlsService)
    	.passwordEncoder(NoOpPasswordEncoder.getInstance());
    	
    }

    @Bean
    public SecurityFilterChain securityConfig(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests((req) ->
            req.requestMatchers("/contact")
               .permitAll()
               .anyRequest()
               .authenticated()
        ).formLogin();
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
