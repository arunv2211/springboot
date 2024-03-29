package com.example.demo.controller.dto;

import java.sql.Date;
import java.util.List;

import com.example.demo.model.Address;
import com.example.demo.model.Treatment;
import com.example.demo.model.patientMedication;

public class UserDto {
	private Integer userId;
	private String userName;
	private String password;
	private Integer age;
	private String gender;
	private Date dateOfBirth;
	private Long phoneNo;
	private Long aternateNo;
	private List<Address> address;
	private List<Treatment> treatmentList;

	public UserDto() {

	}

	public UserDto(Integer userId, String userName, String password, Integer age, String gender, Date dateOfBirth,
			Long phoneNo, Long aternateNo, List<Address> address, List<Treatment> treatmentList) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.aternateNo = aternateNo;
		this.address = address;
		this.treatmentList = treatmentList;
	}

	public List<Treatment> getTreatmentList() {
		return treatmentList;
	}

	public void setTreatmentList(List<Treatment> treatmentList) {
		this.treatmentList = treatmentList;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Long getAternateNo() {
		return aternateNo;
	}

	public void setAternateNo(Long aternateNo) {
		this.aternateNo = aternateNo;
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", password=" + password + ", age=" + age
				+ ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", aternateNo="
				+ aternateNo + ", address=" + address + ", treatmentList=" + treatmentList + "]";
	}

}
