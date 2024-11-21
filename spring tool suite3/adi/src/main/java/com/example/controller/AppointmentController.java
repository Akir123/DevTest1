package com.example.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entity.Appointment;
import com.example.entity.Patient;
import com.example.repository.AppointmentRepository;
import com.example.repository.PatientClient;

@Controller
@RequestMapping("/appointments")
public class AppointmentController {
    @Autowired
    private AppointmentRepository appointmentRepository;
    @Autowired
    private PatientClient patientClient;

    @GetMapping
    public String getAllAppointments(Model model) {
        List<Appointment> appointments = appointmentRepository.findAll();
        model.addAttribute("appointments", appointments);
        return "appointments";
    }

    @PostMapping
    public String addAppointment(@RequestParam Long patientId, @RequestParam String doctorName, @RequestParam String appointmentTime) {
        Patient patient = patientClient.getPatientById(patientId);
        if (patient != null) {
            Appointment appointment = new Appointment();
            appointment.setPatientId(patientId);
            appointment.setDoctorName(doctorName);
            appointment.setAppointmentTime(LocalDateTime.parse(appointmentTime));
            appointmentRepository.save(appointment);
            return "redirect:/appointments";
        } else {
            throw new RuntimeException("Patient not found");
        }
    }
}
