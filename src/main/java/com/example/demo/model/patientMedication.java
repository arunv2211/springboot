package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_medication")
public class patientMedication {
	@Id
	@Column(name="user_id", length = 100)
	private Integer userId;
	
	@Column(name="medicine_name", length = 200)
	private String medicineName;
	
	@Column(name="dosage", length = 200)
	private Integer dosage;
	

	@Column(name="start_date", length = 200)
	private String startDate;
	
	@Column(name="end_date", length = 200)
	private Integer endDate;
	
	@Column(name="time_id", length = 100)
	private Integer timeId;

	public patientMedication() {

	}

	public patientMedication(Integer userId, String medicineName, Integer dosage, String startDate, Integer endDate,
			Integer timeId) {
		super();
		this.userId = userId;
		this.medicineName = medicineName;
		this.dosage = dosage;
		this.startDate = startDate;
		this.endDate = endDate;
		this.timeId = timeId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Integer getDosage() {
		return dosage;
	}

	public void setDosage(Integer dosage) {
		this.dosage = dosage;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public Integer getEndDate() {
		return endDate;
	}

	public void setEndDate(Integer endDate) {
		this.endDate = endDate;
	}

	public Integer getTimeId() {
		return timeId;
	}

	public void setTimeId(Integer timeId) {
		this.timeId = timeId;
	}

	@Override
	public String toString() {
		return "patientMedication [userId=" + userId + ", medicineName=" + medicineName + ", dosage=" + dosage
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", timeId=" + timeId + "]";
	}
	


}
