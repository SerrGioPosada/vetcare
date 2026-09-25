package com.devsenior.sergio.vetcare.service.Impl;

import com.devsenior.sergio.vetcare.model.dto.request.OwnerRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.OwnerResponseDTO;
import com.devsenior.sergio.vetcare.repository.OwnerRepository;
import com.devsenior.sergio.vetcare.service.OwnerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;


    @Override
    public OwnerResponseDTO create(OwnerRequestDTO request) {
        return null;
    }

    @Override
    public OwnerResponseDTO update(Long id, OwnerRequestDTO request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public OwnerResponseDTO findByIdNumber(String idNumber) {
        return null;
    }

    @Override
    public List<OwnerResponseDTO> findAll() {
        return List.of();
    }

    @Override
    public OwnerResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<OwnerResponseDTO> findByNameContaining(String name) {
        return List.of();
    }
}
