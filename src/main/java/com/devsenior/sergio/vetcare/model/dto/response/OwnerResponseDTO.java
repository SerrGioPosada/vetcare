package com.devsenior.sergio.vetcare.model.dto.response;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class OwnerResponseDTO {

    private String name;
    private String idNumber;
    private String phoneNumber;
    private String email;

    private List<PetResponseDTO> pets;
}
