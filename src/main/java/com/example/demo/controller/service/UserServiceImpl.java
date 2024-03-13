package com.example.demo.controller.service;
import java.util.List;

import com.example.demo.controller.Response.MainResponseData;
import com.example.demo.controller.Response.dataResponse;
//import com.example.demo.controller.Response.MainResponseData;
//import com.example.demo.controller.Response.dataResponse;
import com.example.demo.controller.dto.UserDto;
import com.example.demo.controller.repository.AddressRepository;
import com.example.demo.controller.repository.UserRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.User;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	
    
	@Transactional
	@Override
	public String deleteUser(Integer id) {
		Optional<User> userOptional = userRepository.findById(id);
		userRepository.deleteById(id);	
		return "Success";
	}

	@Transactional
	@Override
	public String postUser(UserDto userDto) {
		User user = new User();
		user.setUserId(userDto.getUserId());
		user.setUserName(userDto.getUserName());
		user.setPassword(userDto.getPassword());
		user.setAge(userDto.getAge());
		user.setGender(userDto.getGender());
		user.setDateOfBirth(userDto.getDateOfBirth());
		user.setPhoneNo(userDto.getPhoneNo());
		user.setAlternateNo(userDto.getAternateNo());
		user.setAddressList(userDto.getAddress());
		userRepository.save(user);
//		System.out.println(user.getUserName()+user.getPassword()+"hello");
		return "Success ";
	}

	@Transactional
	@Override
	public MainResponseData getUser() {
		MainResponseData res = new MainResponseData();
		dataResponse childRes = new dataResponse();
		childRes.setMessage("Data get succussfully");
		childRes.setData(userRepository.findAll());
		res.setStatusMessage("succuss");
		res.setStatusCode(200);
		res.setData(childRes);
		return res;
	}
     
	@Transactional
	@Override
	public String putUser(UserDto userDto) {
		Optional<User> optionalUser = userRepository.findById(userDto.getUserId());
		User userObject = optionalUser.get();
		userObject.setUserName(userDto.getUserName());
		userObject.setAge(userDto.getAge());
		userObject.setGender(userDto.getGender());
		return "Success";
	}
}

