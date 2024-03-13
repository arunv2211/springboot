package com.example.demo.controller.dto;

public class AddressDto {
	private int address_id;
	private String permanent_address;
	private String current_address;
	
	public AddressDto() {
		
	}
	
	public AddressDto(int address_id, String permanent_address, String current_address) {
		super();
		this.address_id = address_id;
		this.permanent_address = permanent_address;
		this.current_address = current_address;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
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
		return "AddressDto [address_id=" + address_id + ", permanent_address=" + permanent_address
				+ ", current_address=" + current_address + "]";
	}
	
	
	
	

}
