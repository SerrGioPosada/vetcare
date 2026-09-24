package com.devsenior.sergio.vetcare.model.dto.response;

import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AppointmentResponseDTO {

    private LocalDateTime appointmentDate;
    private String reason;
    private AppointmentStatus status;
    private String diagnosis;
    private String treatment;
    private double price;
    private String vetName;
    private String petName;
}

