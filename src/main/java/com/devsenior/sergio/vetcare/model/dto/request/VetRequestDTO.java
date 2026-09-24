package com.devsenior.sergio.vetcare.model.dto.request;

import com.devsenior.sergio.vetcare.model.entity.Appointment;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class VetRequestDTO {

    @NotBlank(message = "The idNumber of the vet is required")
    private String idNumber;

    @NotBlank(message = "The name of the vet is required")
    private String name;

    @NotBlank(message = "The professional license is required")
    private String professionalLicense;

    @NotBlank(message = "The specialty is required")
    private String specialty;

    @NotBlank(message = "The phone number is required")
    private String phoneNumber;

    @Email(message = "The email must be valid")
    @NotBlank(message = "The email is required")
    private String email;

}
