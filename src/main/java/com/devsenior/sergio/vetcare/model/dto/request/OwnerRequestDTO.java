package com.devsenior.sergio.vetcare.model.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record OwnerRequestDTO(

        @NotBlank(message = "The name is required")
        @Size(min = 2, max = 100, message = "The name must be between 2 and 100 characters")
        String name,

        @NotBlank(message = "The idNumber is required")
        @Pattern(regexp = "^[0-9A-Za-z-]+$", message = "The idNumber must contain only alphanumeric characters")
        String idNumber,

        @NotBlank(message = "The phone number is required")
        @Pattern(regexp = "^\\+?[0-9]{7,15}$", message = "The phone number must be valid (7 to 15 digits, optional + prefix)")
        String phoneNumber,

        @NotBlank(message = "The email is required")
        @Email(message = "The email must be valid")
        String email
) { }