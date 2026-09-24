package com.devsenior.sergio.vetcare.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


@Data
public class OwnerRequestDTO {

    @NotBlank(message = "the name is required")
    private String name;

    @NotBlank(message = "the idNumber is required")
    private String idNumber;

    @NotBlank(message = "the phone number is required")
    private String phoneNumber;

    @Email(message = "The email must be valid")
    @NotBlank(message = "the email is required")
    private String email;
}
