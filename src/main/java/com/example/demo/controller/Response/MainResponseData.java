package com.example.demo.controller.Response;

public class MainResponseData {

	private String statusMessage;
	private Integer statusCode;
	private dataResponse data;
	
	public String getStatusMessage() {
		return statusMessage;
	}
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public dataResponse getData() {
		return data;
	}
	public void setData(dataResponse data) {
		this.data = data;
	}
	

}
