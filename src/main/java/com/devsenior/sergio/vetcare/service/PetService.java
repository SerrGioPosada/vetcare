package com.devsenior.sergio.vetcare.service;

import com.devsenior.sergio.vetcare.model.dto.request.PetRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.PetResponseDTO;
import com.devsenior.sergio.vetcare.model.entity.Pet;

import java.util.List;

public interface PetService {

    List<PetResponseDTO> findByOwnerId(Long ownerId);
    PetResponseDTO create(PetRequestDTO pet);
    List<PetResponseDTO> findAll();
    void delete(Long id);
    PetResponseDTO update(Long id, PetRequestDTO pet);
    PetResponseDTO findById(Long id);
    List<PetResponseDTO> findByBreed(String breed);
    List<PetResponseDTO> findByOwnerIdNumber(String ownerIdNumber);
    PetResponseDTO findByAppointmentId(Long appointmentId);
    PetResponseDTO toResponseDTO(Pet pet);


}
