package com.devsenior.sergio.vetcare.service;

import com.devsenior.sergio.vetcare.model.dto.request.AppointmentRequestDTO;
import com.devsenior.sergio.vetcare.model.dto.response.AppointmentResponseDTO;
import com.devsenior.sergio.vetcare.model.entity.AppointmentStatus;

import java.util.List;

public interface AppointmentService {

    AppointmentResponseDTO create(AppointmentRequestDTO request);
    AppointmentResponseDTO update(Long id, AppointmentRequestDTO request);
    AppointmentResponseDTO findById(Long id);
    List<AppointmentResponseDTO> findAll();
    void delete(Long id);
    List<AppointmentResponseDTO> findByPetId(Long petId);
    List<AppointmentResponseDTO> findByVetId(Long vetId);
    List<AppointmentResponseDTO> findByStatus(AppointmentStatus status);
    AppointmentResponseDTO setStatus(Long id, AppointmentStatus status);
    AppointmentResponseDTO cancelAppointment(Long id);
}