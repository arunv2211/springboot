package com.example.demo.controller.service;

import com.example.demo.controller.Response.*;
import com.example.demo.controller.dto.*;
import com.example.demo.controller.dto.*;

public interface UserService {
	public MainResponseData getUser();
	
	public String postUser(UserDto userDto);
	public String putUser(UserDto userDto);
	public String deleteUser(Integer id);
	
	

}
