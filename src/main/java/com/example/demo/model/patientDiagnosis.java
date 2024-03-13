package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="patient_diagnosis")
public class patientDiagnosis {
	@Id
	@Column(name="user_id", length = 100)
	private Integer user_id;
	
	@Column(name="disease", length = 200)
	private String disease;
	
	public patientDiagnosis() {
		
	}

	public patientDiagnosis(Integer user_id, String disease) {
		super();
		this.user_id = user_id;
		this.disease = disease;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
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
		return "patientDiagnosis [user_id=" + user_id + ", disease=" + disease + "]";
	}
	
	
	
	

}
