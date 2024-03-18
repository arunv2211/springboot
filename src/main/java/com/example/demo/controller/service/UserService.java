package com.example.demo.controller.service;

import java.util.List;

import com.example.demo.controller.Response.*;
import com.example.demo.controller.dto.*;
import com.example.demo.model.User;
import com.example.demo.controller.dto.*;

public interface UserService {
	public MainResponseData getUser();
	public String postmedication(PatientMedicationDto patientMedicationto);
	public String postUser(UserDto userDto);
	public String putUser(UserDto userDto);
	public String deleteUser(Integer id);
	public User getUserName(String userName);
	
	

}
