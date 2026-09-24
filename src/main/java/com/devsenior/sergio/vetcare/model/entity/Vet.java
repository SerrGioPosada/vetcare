package com.devsenior.sergio.vetcare.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "vets")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The idNumber of the vet is required")
    @Column(name = "idNumber", nullable = false, length = 20)
    private String idNumber;

    @NotBlank(message = "The name of the vet is required")
    @Column(name = "name", nullable = false)
    private String name;

    @NotBlank(message = "The professional license is required")
    @Column(name = "professional_license", nullable = false, unique = true)
    private String professionalLicense;

    @NotBlank(message = "The specialty is required")
    @Column(name = "specialty", nullable = false)
    private String specialty; 

    @NotBlank(message = "The phone number is required")
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Email(message = "The email must be valid")
    @NotBlank(message = "The email is required")
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @OneToMany(
        mappedBy = "vet", 
        cascade = jakarta.persistence.CascadeType.ALL
        )
    private List<Appointment> appointments = new ArrayList<>();
}