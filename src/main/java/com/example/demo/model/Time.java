package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="time")
public class Time {
	@Id
	@Column(name="time_id", length = 100)
	private Integer time_id;
	@Column(name="morning", length = 100)
	private String morning;
	@Column(name="afternoon", length = 100)
	private String afternoon;
	@Column(name="night", length = 100)
	private String night;
	
	public Time() {
	
	}
	
	public Time(Integer time_id, String morning, String afternoon, String night) {
		super();
		this.time_id = time_id;
		this.morning = morning;
		this.afternoon = afternoon;
		this.night = night;
	}
	public Integer getTime_id() {
		return time_id;
	}
	public void setTime_id(Integer time_id) {
		this.time_id = time_id;
	}
	public String getMorning() {
		return morning;
	}
	public void setMorning(String morning) {
		this.morning = morning;
	}
	public String getAfternoon() {
		return afternoon;
	}
	public void setAfternoon(String afternoon) {
		this.afternoon = afternoon;
	}
	public String getNight() {
		return night;
	}
	public void setNight(String night) {
		this.night = night;
	}
	
	

}
