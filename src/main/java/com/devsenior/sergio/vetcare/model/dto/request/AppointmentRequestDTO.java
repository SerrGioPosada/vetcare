package com.devsenior.sergio.vetcare.model.dto.request;

import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record AppointmentRequestDTO(

        @NotNull(message = "The appointment date and time is required")
        @FutureOrPresent(message = "The appointment date cannot be in the past")
        LocalDateTime appointmentDate,

        @NotBlank(message = "The reason for the appointment is required")
        String reason,

        @NotNull(message = "The price for the appointment is required")
        @PositiveOrZero(message = "The price cannot be negative")
        Double price,

        AppointmentStatus status,

        String diagnosis,

        String treatment,

        @NotNull(message = "The vet id is required")
        Long vetId,

        @NotNull(message = "The pet id is required")
        Long petId
) { }