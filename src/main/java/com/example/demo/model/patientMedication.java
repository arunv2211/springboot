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
	private Integer user_id;
	
	@Column(name="medicine_name", length = 200)
	private String medicine_name;
	
	@Column(name="dosage", length = 200)
	private Integer dosage;
	

	@Column(name="start_date", length = 200)
	private String start_date;
	
	@Column(name="end_date", length = 200)
	private Integer end_date;
	
	@Column(name="time_id", length = 100)
	private Integer time_id;

	public patientMedication() {

	}

	public patientMedication(Integer user_id, String medicine_name, Integer dosage, String start_date, Integer end_date,
			Integer time_id) {
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

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
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
		return "patientMedication [user_id=" + user_id + ", medicine_name=" + medicine_name + ", dosage=" + dosage
				+ ", start_date=" + start_date + ", end_date=" + end_date + ", time_id=" + time_id + "]";
	}
	
	
	
	


}
