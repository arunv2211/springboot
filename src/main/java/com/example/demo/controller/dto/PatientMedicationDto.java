package com.example.demo.controller.dto;


public class PatientMedicationDto {
	private Integer user_id;
	private String medicine_name;
	private Integer dosage;
	private Integer start_date;
	private Integer end_date;
	private Integer time_id;
	public PatientMedicationDto() {
	
	}
	public PatientMedicationDto(Integer user_id, String medicine_name, Integer dosage, Integer start_date,
			Integer end_date, Integer time_id) {
		super();
		this.user_id = user_id;
		this.medicine_name = medicine_name;
		this.dosage = dosage;
		this.start_date = start_date;
		this.end_date = end_date;
		this.time_id = time_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getMedicine_name() {
		return medicine_name;
	}
	public void setMedicine_name(String medicine_name) {
		this.medicine_name = medicine_name;
	}
	public Integer getDosage() {
		return dosage;
	}
	public void setDosage(Integer dosage) {
		this.dosage = dosage;
	}
	public Integer getStart_date() {
		return start_date;
	}
	public void setStart_date(Integer start_date) {
		this.start_date = start_date;
	}
	public Integer getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Integer end_date) {
		this.end_date = end_date;
	}
	public Integer getTime_id() {
		return time_id;
	}
	public void setTime_id(Integer time_id) {
		this.time_id = time_id;
	}
	@Override
	public String toString() {
		return "PatientMedicationDto [user_id=" + user_id + ", medicine_name=" + medicine_name + ", dosage=" + dosage
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", time_id=" + time_id + "]";
	}
	
	
	
	

}
