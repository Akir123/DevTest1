package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

