package com.example.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Patient;

@FeignClient(name = "patient-service")
public interface PatientClient {
    @GetMapping("/patients/{id}")
    Patient getPatientById(@PathVariable("id") Long id);
}

