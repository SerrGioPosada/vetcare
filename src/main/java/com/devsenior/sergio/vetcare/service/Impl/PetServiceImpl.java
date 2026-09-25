package com.devsenior.sergio.vetcare.service.Impl;

import com.devsenior.sergio.vetcare.model.dto.request.PetRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.PetResponseDTO;
import com.devsenior.sergio.vetcare.model.entity.Pet;
import com.devsenior.sergio.vetcare.repository.OwnerRepository;
import com.devsenior.sergio.vetcare.repository.PetRepository;
import com.devsenior.sergio.vetcare.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;
    private final OwnerRepository ownerRepository;

    @Override
    public List<PetResponseDTO> findByOwnerId(Long ownerId) {
        return List.of();
    }

    @Override
    public PetResponseDTO create(PetRequestDTO pet) {
        return null;
    }

    @Override
    public List<PetResponseDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public PetResponseDTO update(Long id, PetRequestDTO pet) {
        return null;
    }

    @Override
    public PetResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<PetResponseDTO> findByBreed(String breed) {
        return List.of();
    }

    @Override
    public List<PetResponseDTO> findByOwnerIdNumber(String idNumber) {
        return List.of();
    }

    @Override
    public PetResponseDTO findByAppointmentId(Long appointmentId) {
        return null;
    }

    @Override
    public PetResponseDTO toResponseDTO(Pet pet) {
        return PetResponseDTO.builder()
                .id(pet.getId())
                .name(pet.getName())
                .age(pet.getAge())
                .breed(pet.getBreed())
                .ownerName(pet.getOwner().getName())
                .build();
    }
}
