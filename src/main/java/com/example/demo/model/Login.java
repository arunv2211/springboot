package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login")
public class Login {
	@Id
	@Column(name="user_id", length = 100)
	private Integer user_id;
	
	@Column(name="created_date", length = 200)
	private String created_date;
	
	@Column(name="updated_date", length = 200)
	private String updated_date;

	public Login() {
		
	}

	public Login(Integer user_id, String created_date, String updated_date) {
		super();
		this.user_id = user_id;
		this.created_date = created_date;
		this.updated_date = updated_date;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getUpdated_date() {
		return updated_date;
	}

	public void setUpdated_date(String updated_date) {
		this.updated_date = updated_date;
	}

	@Override
	public String toString() {
		return "Login [user_id=" + user_id + ", created_date=" + created_date + ", updated_date=" + updated_date + "]";
	}
	
	
	
	

}
