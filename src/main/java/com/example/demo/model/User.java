package com.example.demo.model;


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
@Table(name="user")
public class User {
	
	@Id
	@Column(name="user_id", length = 30)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userId;
	@Column(name="user_name", length = 100)
	private String userName;
	@Column(name="password", length = 100)
	private String password;
	@Column(name="age", length = 100)
	private Integer age;
	@Column(name="gender", length = 100)
	private String gender;
	@Column(name="date_of_birth", length = 100)
	private Integer dateOfBirth;
	@Column(name="phone_no", length = 100)
	private Integer phoneNo;
	@Column(name="aternate_no", length = 100)
	private Integer alternateNo;
//	@Column(name="address_id", length = 100)
//	private Integer addressId;
//	
//	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//	@JoinColumn(name="address_id",referencedColumnName = "address_id")
//	private Address address;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")
	private List<Address> addressList;
	

	public User() {
	
	}

	public User(Integer userId, String userName, String password, Integer age, String gender, Integer dateOfBirth,
			Integer phoneNo, Integer alternateNo, List<Address> addressList) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.phoneNo = phoneNo;
		this.alternateNo = alternateNo;
		this.addressList = addressList;
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





	public Integer getAlternateNo() {
		return alternateNo;
	}





	public void setAlternateNo(Integer alternateNo) {
		this.alternateNo = alternateNo;
	}





	public List<Address> getAddressList() {
		return addressList;
	}





	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}





	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", age=" + age
				+ ", gender=" + gender + ", dateOfNirth=" + dateOfBirth + ", phoneNo=" + phoneNo + ", alternateNo="
				+ alternateNo + ", addressList=" + addressList + "]";
	}

	
//
//	public String getAddress_id() {
//		return addressid;
//	}
//
//
//	public void setAddress_id(String address_id) {
//		this.address_id = address_id;
//	}
	
	
	
}
