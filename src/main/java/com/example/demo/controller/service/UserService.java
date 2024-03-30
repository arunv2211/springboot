package com.example.demo.controller.service;

import java.util.List;

import com.example.demo.controller.Response.*;
import com.example.demo.controller.dto.*;
import com.example.demo.model.Treatment;
import com.example.demo.model.User;
import com.example.demo.controller.dto.*;

public interface UserService {
	//User Table services
	public MainResponseData getUser();
	public String postUser(UserDto userDto);
	public String putUser(UserDto userDto);
	public String deleteUser(Integer id);
	public User getUserName(String userName,String password);
	public User getUserById(Integer id);
	
	//Treatment table services
	public Treatment getTreatmentById(Integer user_id_fk);
	public String postTreatment(TreatmentDto treatmentDto);
	public String deleteTreatment(Integer id);
	public Treatment getTreatmentByUserId(Integer user_id_fk);

	

}
