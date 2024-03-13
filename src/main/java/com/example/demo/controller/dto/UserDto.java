package com.example.demo.controller.dto;

import java.util.List;

import com.example.demo.model.Address;

public class UserDto {
	private Integer userId;
	private String userName;
	private String password;
	private Integer age;
	private String gender;
	private Integer dateOfBirth;
	private Integer phoneNo;
	private Integer aternateNo;
	private List<Address> address;
	
	
	public UserDto() {
	
	}
	
	
	
	


	public UserDto(Integer userId, String userName, String password, Integer age, String gender, Integer dateOfBirth,
			Integer phoneNo, Integer aternateNo, List<Address> address) {
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






	public Integer getDateOfBirth() {
		return dateOfBirth;
	}






	public void setDateOfBirth(Integer dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}






	public Integer getPhoneNo() {
		return phoneNo;
	}






	public void setPhoneNo(Integer phoneNo) {
		this.phoneNo = phoneNo;
	}






	public Integer getAternateNo() {
		return aternateNo;
	}






	public void setAternateNo(Integer aternateNo) {
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
				+ aternateNo + ", address=" + address + "]";
	}

	
}
