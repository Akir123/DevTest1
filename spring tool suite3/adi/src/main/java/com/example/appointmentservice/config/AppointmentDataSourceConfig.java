package com.example.appointmentservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
public class AppointmentDataSourceConfig {

    @Value("${spring.datasource.appointment.url}")
    private String url;

    @Value("${spring.datasource.appointment.username}")
    private String username;

    @Value("${spring.datasource.appointment.password}")
    private String password;

    @Value("${spring.datasource.appointment.driver-class-name}")
    private String driverClassName;

    @Bean
    DataSource appointmentDataSource() {
        return DataSourceBuilder.create()
            .url(url)
            .username(username)
            .password(password)
            .driverClassName(driverClassName)
            .build();
    }
}
