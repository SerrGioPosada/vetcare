package com.devsenior.sergio.vetcare.model.dto.response;

import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record AppointmentResponseDTO(

        LocalDateTime appointmentDate,
        String reason,
        AppointmentStatus status,
        String diagnosis,
        String treatment,
        Double price,
        String vetName,
        String petName
) { }