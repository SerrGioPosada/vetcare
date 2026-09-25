package com.devsenior.sergio.vetcare.repository;

import com.devsenior.sergio.vetcare.model.entity.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VetRepository extends JpaRepository<Vet, Long> {

    Optional<Vet> findByProfessionalLicense(String professionalLicense);
    List<Vet> findBySpecialty(String specialty);
    Optional<Vet> findByAppointmentsId(Long appointmentId);
}
