package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.entity.Patient;
import com.example.repository.PatientRepository;

@Controller
@RequestMapping("/patients")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping
    public String getAllPatients(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients", patients);
        return "patients";
    }

    @PostMapping
    public String addPatient(@RequestParam String name, @RequestParam int age) {
        Patient patient = new Patient();
        patient.setName(name);
        patient.setAge(age);
        patientRepository.save(patient);
        return "redirect:/patients";
    }
}


