package com.example.demo.controller.dto;

import java.sql.Date;
import java.util.List;

import com.example.demo.model.PatientMedicationDosage;

public class PatientMedicationDto {
	
	private Integer medicationId;
	private Integer treatmentId;
	private String medicine;
	private String dosage;
	private Date createdAt;
	private Date updatedAt;
	private List<PatientMedicationDosageDto> timeList;
	
	public PatientMedicationDto() {
	
	}

	public PatientMedicationDto(Integer medicationId, Integer treatmentId, String medicine, String dosage,
			Date createdAt, Date updatedAt, List<PatientMedicationDosageDto> timeList) {
		super();
		this.medicationId = medicationId;
		this.treatmentId = treatmentId;
		this.medicine = medicine;
		this.dosage = dosage;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.timeList = timeList;
	}

	public Integer getMedicationId() {
		return medicationId;
	}

	public void setMedicationId(Integer medicationId) {
		this.medicationId = medicationId;
	}

	public Integer getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(Integer treatmentId) {
		this.treatmentId = treatmentId;
	}

	public String getMedicine() {
		return medicine;
	}

	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}

	public String getDosage() {
		return dosage;
	}

	public void setDosage(String dosage) {
		this.dosage = dosage;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<PatientMedicationDosageDto> getTimeList() {
		return timeList;
	}

	public void setTimeList(List<PatientMedicationDosageDto> timeList) {
		this.timeList = timeList;
	}

	@Override
	public String toString() {
		return "PatientMedicationDto [medicationId=" + medicationId + ", treatmentId=" + treatmentId + ", medicine="
				+ medicine + ", dosage=" + dosage + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", timeList=" + timeList + "]";
	}

	
	
}
