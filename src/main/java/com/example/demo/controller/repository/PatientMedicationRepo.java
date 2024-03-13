package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.patientMedication;

public interface PatientMedicationRepo extends JpaRepository<patientMedication, Integer>{

}
