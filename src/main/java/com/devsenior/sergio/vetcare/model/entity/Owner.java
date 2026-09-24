package com.devsenior.sergio.vetcare.model.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@Entity
@Table (name = "owners")
@NoArgsConstructor 
@AllArgsConstructor
@Builder 
public class Owner {

    @Id
    @Column (name = "id", nullable = false, unique = true)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "The idNumber of the owner is required")
    @Column(name = "idNumber", nullable= false, unique = true )
    private String idNumber;

    @NotBlank (message = "The name of the owner is required")
    @Column (name = "name", nullable = false)
    private String name;

    @NotBlank (message = "The phone number of the owner is required")
    @Column (name = "phone_number", nullable = false)
    private String phoneNumber;

    @Email(message = "The email must be valid")
    @NotBlank (message = "The email of the owner is required")
    @Column (name = "email", nullable = false, unique = true )
    private String email;

    @OneToMany(
        mappedBy = "owner",
        cascade = jakarta.persistence.CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Pet> pets = new ArrayList<>();

}
