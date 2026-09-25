package com.devsenior.sergio.vetcare.model.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.Builder;

@Builder
public record PetRequestDTO(

        @NotBlank(message = "The name of the pet is required")
        @Size(min = 2, max = 50, message = "The pet name must be between 2 and 50 characters")
        String name,

        @NotBlank(message = "Breed is required")
        @Size(min = 2, max = 50, message = "The breed must be between 2 and 50 characters")
        String breed,

        @NotNull(message = "Age is required")
        @Min(value = 0, message = "Age cannot be negative")
        @Max(value = 100, message = "Age must be a realistic number")
        Integer age,

        @NotNull(message = "Owner ID is required")
        @Positive(message = "Owner ID must be a positive number")
        Long ownerId
) { }