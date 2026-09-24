package com.devsenior.sergio.vetcare.service;

import com.devsenior.sergio.vetcare.model.dto.request.OwnerRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.OwnerResponseDTO;
import com.devsenior.sergio.vetcare.model.entity.Owner;

import java.util.List;

public interface OwnerService {

    OwnerResponseDTO save(OwnerRequestDTO request);
    OwnerResponseDTO update(Long id, OwnerRequestDTO request);
    void delete(Long id);
    OwnerResponseDTO findByIdNumber(String idNumber);
    List<OwnerResponseDTO> findAll();
    OwnerResponseDTO findById(Long id);
    List<OwnerResponseDTO> findByNameContaining(String name);
}
