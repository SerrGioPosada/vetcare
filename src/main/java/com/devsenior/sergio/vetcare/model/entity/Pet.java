package com.devsenior.sergio.vetcare.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data 
@Entity 
@Table (name = "pets")
@AllArgsConstructor 
@NoArgsConstructor 
@Builder 
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank (message = "The name of the pet is required")
    @Column (name = "name")
    private String name;

    @Column(name = "breed", nullable = false)
    private String breed;

    @Column (name = "age")
    @NotNull(message = "Age is required")
    @Min(value = 0, message = "Age cannot be negative")
    private Integer age;

    @ManyToOne
    @JoinColumn (name = "owner_id", nullable = false)
    @JsonIgnore
    private Owner owner;

    @OneToMany(
            mappedBy = "pet",
            cascade = jakarta.persistence.CascadeType.ALL,
            orphanRemoval = true)
    private List<Appointment> appointments = new ArrayList<>();
}
