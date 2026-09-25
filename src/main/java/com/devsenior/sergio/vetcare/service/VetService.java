package com.devsenior.sergio.vetcare.service;

import com.devsenior.sergio.vetcare.model.dto.request.VetRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.VetResponseDTO;

import java.util.List;

public interface VetService {

    VetResponseDTO create(VetRequestDTO request);
    VetResponseDTO update(Long id, VetRequestDTO request);
    void delete (Long id);
    List<VetResponseDTO> findAll();
    VetResponseDTO findById(Long id);
    VetResponseDTO findByProfessionalLicense(String professionalLicense);
    List<VetResponseDTO> findBySpecialty(String specialty);
    VetResponseDTO findByAppointmentId(Long appointmentId);

}
