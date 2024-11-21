package com.example.patientservice.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


import javax.sql.DataSource;
import org.springframework.boot.jdbc.DataSourceBuilder;

@Configuration
public class PatientDataSourceConfig {

    @Value("${spring.datasource.patient.url}")
    private String url;

    @Value("${spring.datasource.patient.username}")
    private String username;

    @Value("${spring.datasource.patient.password}")
    private String password;

    @Value("${spring.datasource.patient.driver-class-name}")
    private String driverClassName;

    @Bean
    @Primary
    DataSource patientDataSource() {
        return DataSourceBuilder.create()
            .url(url)
            .username(username)
            .password(password)
            .driverClassName(driverClassName)
            .build();
    }
}
