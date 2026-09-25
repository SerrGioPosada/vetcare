package com.devsenior.sergio.vetcare.model.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record VetResponseDTO(

        Long id,
        String idNumber,
        String name,
        String professionalLicense,
        String specialty,
        String phoneNumber,
        String email,
        List<AppointmentResponseDTO> appointments
) { }