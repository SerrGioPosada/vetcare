package com.devsenior.sergio.vetcare.repository;
import com.devsenior.sergio.vetcare.model.entity.Owner;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findByIdNumber(String idNumber);
    List<Owner> findByNameContainingIgnoreCase(String name);
    boolean existsByEmail(String email);
}
