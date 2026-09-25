package com.devsenior.sergio.vetcare.service.Impl;

import com.devsenior.sergio.vetcare.model.dto.request.VetRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.VetResponseDTO;
import com.devsenior.sergio.vetcare.repository.VetRepository;
import com.devsenior.sergio.vetcare.service.VetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VetServiceImpl  implements VetService {

    private final VetRepository vetRepository;

    @Override
    public VetResponseDTO update(Long id, VetRequestDTO request) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<VetResponseDTO> findAll() {
        return List.of();
    }

    @Override
    public VetResponseDTO create(VetRequestDTO request) {
        return null;
    }

    @Override
    public VetResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public VetResponseDTO findByProfessionalLicense(String licenseNumber) {
        return null;
    }

    @Override
    public List<VetResponseDTO> findBySpecialty(String specialty) {
        return List.of();
    }

    @Override
    public VetResponseDTO findByAppointmentId(Long appointmentId) {
        return null;
    }
}
