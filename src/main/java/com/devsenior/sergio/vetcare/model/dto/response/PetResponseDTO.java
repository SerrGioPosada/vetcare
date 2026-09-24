package com.devsenior.sergio.vetcare.model.dto.response;

import com.devsenior.sergio.vetcare.model.entity.Appointment;
import com.devsenior.sergio.vetcare.model.entity.Owner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class PetResponseDTO {

    private Long id;
    private String name;
    private String breed;
    private Integer age;
    private Owner owner;

    private List<AppointmentResponseDTO> appointments;

}


