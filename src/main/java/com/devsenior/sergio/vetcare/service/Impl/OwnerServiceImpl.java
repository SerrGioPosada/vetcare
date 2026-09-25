package com.devsenior.sergio.vetcare.service.Impl;

import com.devsenior.sergio.vetcare.exception.DuplicateEmailException;
import com.devsenior.sergio.vetcare.exception.UserNotFoundException;
import com.devsenior.sergio.vetcare.model.dto.request.OwnerRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.OwnerResponseDTO;
import com.devsenior.sergio.vetcare.model.dto.response.PetResponseDTO;
import com.devsenior.sergio.vetcare.model.entity.Owner;
import com.devsenior.sergio.vetcare.repository.OwnerRepository;
import com.devsenior.sergio.vetcare.service.OwnerService;
import com.devsenior.sergio.vetcare.service.PetService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OwnerServiceImpl implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetService petService;

    @Override
    public OwnerResponseDTO create(OwnerRequestDTO request) {

        if (ownerRepository.existsByEmail(request.email())) {
            throw new DuplicateEmailException("The email " + request.email() + " is already registered.");
        }
        Owner owner = Owner.builder()
                .name(request.name())
                .idNumber(request.idNumber())
                .email(request.email())
                .phoneNumber(request.phoneNumber())
                .build();
        Owner savedOwner = ownerRepository.save(owner);

        return toResponseDTO(savedOwner);
    }

    @Override
    public OwnerResponseDTO update(Long id, OwnerRequestDTO request) {

        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("The owner with id " + id + " does not exist."));

        if (request.name() != null) owner.setName(request.name());
        if (request.idNumber() != null) owner.setIdNumber(request.idNumber());
        if (request.email() != null) owner.setEmail(request.email());
        if (request.phoneNumber() != null) owner.setPhoneNumber(request.phoneNumber());

        Owner savedOwner = ownerRepository.save(owner);
        return toResponseDTO(savedOwner);
    }

    @Override
    public void delete(Long id) {

        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("The owner with id " + id + " does not exist."));

        ownerRepository.delete(owner);
    }

    @Override
    public OwnerResponseDTO findByIdNumber(String idNumber) {

        Owner owner = ownerRepository.findByIdNumber(idNumber)
                .orElseThrow(() -> new UserNotFoundException("The owner with idNumber " + idNumber + " does not exist."));

        return toResponseDTO(owner);
    }

    @Override
    public List<OwnerResponseDTO> findAll() {

        return ownerRepository.findAll().stream()
                .map(this::toResponseDTO)
                .toList();
    }

    @Override
    public OwnerResponseDTO findById(Long id) {

        Owner owner = ownerRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("The owner with id " + id + " does not exist."));

        return toResponseDTO(owner);

    }

    @Override
    public List<OwnerResponseDTO> findByNameContaining(String name) {
        List<Owner> owners = ownerRepository.findByNameContainingIgnoreCase(name);

        return owners.stream()
                .map(this::toResponseDTO)
                .toList();
    }

    private OwnerResponseDTO toResponseDTO(Owner owner) {
        /*
        Si el dueño tiene una lista de mascotas registrada, transforma cada mascota
         en un DTO de respuesta y devuélvelas en una lista; si no tiene mascotas o la lista es nula,
         devuelve una lista vacía.
         */
        List<PetResponseDTO> petDTOs = owner.getPets() != null
                ? owner.getPets().stream()
                .map(petService::toResponseDTO)
                .toList()
                : List.of();

        return OwnerResponseDTO.builder()
                .id(owner.getId())
                .name(owner.getName())
                .email(owner.getEmail())
                .idNumber(owner.getIdNumber())
                .phoneNumber(owner.getPhoneNumber())
                .pets(petDTOs)
                .build();

    }
}
