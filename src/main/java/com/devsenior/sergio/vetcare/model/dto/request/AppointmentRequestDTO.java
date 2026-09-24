package com.devsenior.sergio.vetcare.model.dto.request;

import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentRequestDTO {

    @NotNull(message = "The appointment date and time is required")
    @FutureOrPresent(message = "The appointment date cannot be in the past")
    private LocalDateTime appointmentDate;

    @NotBlank(message = "The reason for the appointment is required")
    private String reason;

    @NotNull(message = "The price for the appointment is required")
    @PositiveOrZero(message = "The price cannot be negative")
    private Double price;

    private AppointmentStatus status;

    private String diagnosis;

    private String treatment;

    @NotNull(message = "The vet id is required")
    private Long vetId;

    @NotNull(message = "The pet id is required")
    private Long petId;
}