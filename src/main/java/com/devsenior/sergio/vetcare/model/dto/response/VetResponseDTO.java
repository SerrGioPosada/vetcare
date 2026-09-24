package com.devsenior.sergio.vetcare.model.dto.response;

import com.devsenior.sergio.vetcare.model.entity.Appointment;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class VetResponseDTO {

    private String idNumber;
    private String name;
    private String professionalLicense;
    private String specialty;
    private String phoneNumber;
    private String email;

    private List<AppointmentResponseDTO> appointments;
}
