package com.devsenior.sergio.vetcare.service.Impl;

import com.devsenior.sergio.vetcare.model.dto.request.AppointmentRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.AppointmentResponseDTO;
import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;
import com.devsenior.sergio.vetcare.repository.AppointmentRepository;
import com.devsenior.sergio.vetcare.service.AppointmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;

    @Override
    public AppointmentResponseDTO create(AppointmentRequestDTO request) {
        return null;
    }

    @Override
    public AppointmentResponseDTO update(Long id, AppointmentRequestDTO request) {
        return null;
    }

    @Override
    public AppointmentResponseDTO findById(Long id) {
        return null;
    }

    @Override
    public List<AppointmentResponseDTO> findAll() {
        return List.of();
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AppointmentResponseDTO> findByPetId(Long petId) {
        return List.of();
    }

    @Override
    public List<AppointmentResponseDTO> findByVetId(Long vetId) {
        return List.of();
    }

    @Override
    public List<AppointmentResponseDTO> findByStatus(AppointmentStatus status) {
        return List.of();
    }

    @Override
    public AppointmentResponseDTO setStatus(Long id, AppointmentStatus status) {
        return null;
    }

    @Override
    public AppointmentResponseDTO cancelAppointment(Long id) {
        return null;
    }
}
