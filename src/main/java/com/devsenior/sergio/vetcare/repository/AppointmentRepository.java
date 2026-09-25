package com.devsenior.sergio.vetcare.repository;

import com.devsenior.sergio.vetcare.model.entity.Appointment;
import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;
import com.devsenior.sergio.vetcare.model.entity.Vet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findByPetId(Long petId);
    List<Appointment> findByVetId(Long vetId);
    List<Appointment> findByStatus(AppointmentStatus status);

    @Query("SELECT DISTINCT v FROM Vet v JOIN v.appointments a WHERE LOWER(v.specialty) = LOWER(:specialty) AND a.status = :status")
    List<Vet> findVetsBySpecialtyAndAppointmentStatus(
            @Param("specialty") String specialty,
            @Param("status") AppointmentStatus status
    );
}
