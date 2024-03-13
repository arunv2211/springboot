package com.example.demo.controller.dto;

public class PatientDiagnosisDto {
	private int user_id;
	private String disease;
	public PatientDiagnosisDto() {
	
	}
	public PatientDiagnosisDto(int user_id, String disease) {
	
		this.user_id = user_id;
		this.disease = disease;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	@Override
	public String toString() {
		return "patientDiagnosisDto [user_id=" + user_id + ", disease=" + disease + "]";
	}
	
	
	
	
	

}
