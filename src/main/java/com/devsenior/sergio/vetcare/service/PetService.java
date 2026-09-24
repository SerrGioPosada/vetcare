package com.devsenior.sergio.vetcare.service;

import com.devsenior.sergio.vetcare.model.dto.request.PetRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.PetResponseDTO;

import java.util.List;

public interface PetService {

    List<PetResponseDTO> findByIdOwner(Long idOwner);
    PetResponseDTO save(PetRequestDTO pet);
    List<PetResponseDTO> findAll();
    void delete(Long id);
    PetResponseDTO update(PetRequestDTO pet);
    PetResponseDTO findById(Long id);
    List<PetResponseDTO> FindByBreed(String breed);
    List<PetResponseDTO> findByOwnerIdNumber(String idNumber);


}
