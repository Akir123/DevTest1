package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.jdbc.DataSourceBuilder;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean(name = "patientDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.patient")
    public DataSource patientDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "appointmentDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.appointment")
    public DataSource appointmentDataSource() {
        return DataSourceBuilder.create().build();
    }
}