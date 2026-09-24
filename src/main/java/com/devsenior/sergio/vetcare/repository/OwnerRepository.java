package com.devsenior.sergio.vetcare.repository;

import com.devsenior.sergio.vetcare.model.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
