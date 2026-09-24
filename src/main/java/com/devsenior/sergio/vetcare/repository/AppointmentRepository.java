package com.devsenior.sergio.vetcare.repository;

import com.devsenior.sergio.vetcare.model.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}
