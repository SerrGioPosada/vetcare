package com.devsenior.sergio.vetcare.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "appointments")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "The appointment date and time is required")
    @Column(name = "appointment_date", nullable = false)
    private LocalDateTime appointmentDate; 

    @NotBlank(message = "The reason for the appointment is required")
    @Column(name = "reason", nullable = false, length = 500)
    private String reason;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private AppointmentStatus status; 

    @Column(name = "diagnosis", length = 1000)
    private String diagnosis;

    @Column(name = "treatment", length = 1000)
    private String treatment;

    @NotBlank(message = "the price for the appointment is required")
    @Column(name = "price" , nullable = false)
    private double price;


    @ManyToOne(optional = false)
    @JoinColumn(name = "pet_id", nullable = false)
    @JsonIgnore
    private Pet pet;

    @ManyToOne(optional = false)
    @JsonIgnore
    @JoinColumn(name = "vet_idNumber", nullable = false)
    private Vet vet;
}