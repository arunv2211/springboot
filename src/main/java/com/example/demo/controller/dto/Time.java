package com.example.demo.controller.dto;

public class Time {
	private Integer time_id;
	private String morning;
	private String afternoon;
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
	@Override
	public String toString() {
		return "Time [time_id=" + time_id + ", morning=" + morning + ", afternoon=" + afternoon + ", night=" + night
				+ "]";
	}
	

}
