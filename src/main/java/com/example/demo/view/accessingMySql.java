package com.example.demo.view;
import com.example.demo.controller.Response.MainResponseData;
import com.example.demo.controller.dto.PatientMedicationDto;
import com.example.demo.controller.dto.UserDto;
import com.example.demo.controller.repository.UserRepository;
import com.example.demo.controller.service.UserService;
import com.example.demo.model.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")

public class accessingMySql {

	@Autowired
	private UserService userService;
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/userdetails")
	public @ResponseBody MainResponseData getAllUsers(){
		return userService.getUser();
	}
	@GetMapping("/getuser/{username}")
	public @ResponseBody User getUser(@PathVariable("username") String username){
		return userService.getUserName(username);
	}
	
	
	@PostMapping("/create")
	public @ResponseBody String addNewUser(@RequestBody UserDto userDto) {
//		return userRepository.save(userDto);

		return userService.postUser(userDto);
	}
	
	@PostMapping("/add")
	public @ResponseBody String addMedication(@RequestBody PatientMedicationDto patientMedicationDto) {
//		return userRepository.save(userDto);

		return userService.postmedication(patientMedicationDto);
	}
	
	
	@PutMapping("/update")
	public String updateUser(@RequestBody UserDto userDto) {
		return userService.putUser(userDto);
	}
  
	@DeleteMapping("/delete/{id}")
	public String deleteUser(@PathVariable("id") Integer user_id) {
		return userService.deleteUser(user_id);
	}

}






