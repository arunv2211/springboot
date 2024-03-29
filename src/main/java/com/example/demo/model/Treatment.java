package com.example.demo.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="treatment")
public class Treatment {
	@Id
	@Column(name="treatment_id", length = 100)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer treatmentId;
	
	
	@Column(name="user_id_fk", length = 100)
	private Integer userIdFk;
	
	@Column(name="summary", length = 500)
	private String summary;
	
	@Column(name="suggestion", length = 500)
	private String suggestion;
	
	@Column(name="diagnosis", length = 100)
	private String diagnosis;
	
	@Column(name="conclusion", length = 500)
	private String conclusion;
	
	@Column(name="appointmen_date", length = 500)
	private Date appointmentDate;
	
	@Column(name="created_at", length = 100)
	private Date createdAt;
	
	@Column(name="updated_at", length = 100)
	private Date updatedAt;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="treatment_id_fk")
	private List<patientMedication> patientMendicationList;
	
	public Treatment() {
	
	}

	
	public Treatment(Integer treatmentId, Integer userIdFk, String summary, String suggestion, String diagnosis,
			String conclusion, Date appointmentDate, Date createdAt, Date updatedAt,
			List<patientMedication> patientMendicationList) {
		super();
		this.treatmentId = treatmentId;
		this.userIdFk = userIdFk;
		this.summary = summary;
		this.suggestion = suggestion;
		this.diagnosis = diagnosis;
		this.conclusion = conclusion;
		this.appointmentDate = appointmentDate;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.patientMendicationList = patientMendicationList;
	}


	public Integer getTreatmentId() {
		return treatmentId;
	}

	public void setTreatmentId(Integer treatmentId) {
		this.treatmentId = treatmentId;
	}

	public Integer getUserIdFk() {
		return userIdFk;
	}

	public void setUserIdFk(Integer userIdFk) {
		this.userIdFk = userIdFk;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdateddAt() {
		return updatedAt;
	}
	public void setUpdateddAt(Date updateddAt) {
		this.updatedAt = updateddAt;
	}
	
	public List<patientMedication> getPatientMendicationList() {
		return patientMendicationList;
	}

	public void setPatientMendicationList(List<patientMedication> patientMendicationList) {
		this.patientMendicationList = patientMendicationList;
	}

	@Override
	public String toString() {
		return "Treatment [treatmentId=" + treatmentId + ", userIdFk=" + userIdFk + ", summary=" + summary
				+ ", suggestion=" + suggestion + ", diagnosis=" + diagnosis + ", conclusion=" + conclusion
				+ ", appointmentDate=" + appointmentDate + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", patientMendicationList=" + patientMendicationList + "]";
	}
	
}
