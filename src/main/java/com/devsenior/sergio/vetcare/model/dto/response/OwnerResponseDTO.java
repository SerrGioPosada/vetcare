package com.devsenior.sergio.vetcare.model.dto.response;

import lombok.Builder;

import java.util.List;

@Builder
public record OwnerResponseDTO(

        Long id,
        String name,
        String idNumber,
        String phoneNumber,
        String email,
        List<PetResponseDTO> pets
) { }