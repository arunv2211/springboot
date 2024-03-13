package com.example.demo.model;


import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id", length = 30)
	private Integer address_id;
	
	@Column(name="permanent_address", length = 200)
	private String permanent_address;
	@Column(name="current_address", length = 200)
	private String current_address;
	
	public Address() {
		
	}

	public Address(Integer address_id, String permanent_address, String current_address) {
		super();
		this.address_id = address_id;
		this.permanent_address = permanent_address;
		this.current_address = current_address;
	}

	public Integer getAddress_id() {
		return address_id;
	}

	public void setAddress_id(Integer address_id) {
		this.address_id = address_id;
	}

	public String getPermanent_address() {
		return permanent_address;
	}

	public void setPermanent_address(String permanent_address) {
		this.permanent_address = permanent_address;
	}

	public String getCurrent_address() {
		return current_address;
	}

	public void setCurrent_address(String current_address) {
		this.current_address = current_address;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", permanent_address=" + permanent_address + ", current_address="
				+ current_address + "]";
	}

	
	
	

}
