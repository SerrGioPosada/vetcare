package com.devsenior.sergio.vetcare.model.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record PetResponseDTO(

        Long id,
        String name,
        String breed,
        Integer age,
        String ownerName,
        List<AppointmentResponseDTO> appointments
) { }
