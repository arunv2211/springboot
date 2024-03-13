package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.patientDiagnosis;

public interface PatientDiagnosisRepo extends JpaRepository<patientDiagnosis, Integer> {

}
