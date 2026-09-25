package com.devsenior.sergio.vetcare.repository;

import com.devsenior.sergio.vetcare.model.entity.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PetRepository extends JpaRepository<Pet, Long> {

    List<Pet> findByOwnerId(Long ownerId);
    List<Pet> findByBreed(String breed);
    List<Pet> findByOwnerIdNumber(String idNumber);
    Optional<Pet> findByAppointmentsId(Long appointmentId);
}
