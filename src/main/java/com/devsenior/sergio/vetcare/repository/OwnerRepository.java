package com.devsenior.sergio.vetcare.repository;
import com.devsenior.sergio.vetcare.model.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    Optional<Owner> findByIdNumber(String idNumber);
    List<Owner> findByNameContainingIgnoreCase(String name);

}
