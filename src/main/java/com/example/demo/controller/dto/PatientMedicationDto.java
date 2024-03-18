package com.example.demo.controller.dto;


public class PatientMedicationDto {
	private Integer userId;
	private String medicineName;
	private Integer dosage;
	private Integer startDate;
	private Integer endDate;
	private Integer timeId;
	public PatientMedicationDto() {
	
	}
	
	
	public PatientMedicationDto(Integer userId, String medicineName, Integer dosage, Integer startDate, Integer endDate,
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


	public Integer getStartDate() {
		return startDate;
	}


	public void setStartDate(Integer startDate) {
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
		return "PatientMedicationDto [userId=" + userId + ", medicineName=" + medicineName + ", dosage=" + dosage
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", timeId=" + timeId + "]";
	}

}
