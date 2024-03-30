package com.example.demo.controller.service;

import java.util.List;

import com.example.demo.controller.Response.MainResponseData;
import com.example.demo.controller.Response.dataResponse;
import com.example.demo.controller.dto.AddressDto;
import com.example.demo.controller.dto.PatientMedicationDosageDto;
import com.example.demo.controller.dto.PatientMedicationDto;
import com.example.demo.controller.dto.TreatmentDto;
//import com.example.demo.controller.Response.MainResponseData;
//import com.example.demo.controller.Response.dataResponse;
import com.example.demo.controller.dto.UserDto;
import com.example.demo.controller.repository.AddressRepository;
import com.example.demo.controller.repository.PatientMedicationDosageRepo;
import com.example.demo.controller.repository.TreatmentRepo;
import com.example.demo.controller.repository.UserRepository;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.PatientMedicationDosage;
import com.example.demo.model.Treatment;
import com.example.demo.model.User;
import com.example.demo.model.patientMedication;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private TreatmentRepo treatmentRepo;
	
	@Autowired
	private PatientMedicationDosageRepo patientDosageRepo;

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
		userObject.setUserId(userDto.getUserId());
		userObject.setUserName(userDto.getUserName());
		userObject.setPassword(userDto.getPassword());
		userObject.setAge(userDto.getAge());
		userObject.setGender(userDto.getGender());
		userObject.setDateOfBirth(userDto.getDateOfBirth());
		userObject.setPhoneNo(userDto.getPhoneNo());
		userObject.setAlternateNo(userDto.getAternateNo());
//		userObject.setAddressList(userDto.getAddress());
		return "Success";
	}

//	
	@Transactional
	@Override
	public User getUserName(String userName, String password) {
		User userData = userRepository.findByUserName(userName, password);
		return userData;
	}

	@Override
	public User getUserById(Integer userid) {
		Optional<User> user = userRepository.findById(userid);
		User userObj = user.get();
		return userObj;
	}

	@Override
	public String postTreatment(TreatmentDto treatmentDto) {
		Treatment treatment = new Treatment();
		patientMedication medicationObject = new patientMedication();
//		PatientMedicationDosage dosageObject = new PatientMedicationDosage();
//		PatientMedicationDosageDto patientMedicationDosageDto = new PatientMedicationDosageDto();
//		treatment.setUserIdFk(treatmentDto.getUserIdFk());
		treatment.setSummary(treatmentDto.getSummary());
		treatment.setSuggestion(treatmentDto.getSuggestion());
		treatment.setDiagnosis(treatmentDto.getDiagnosis());
		treatment.setConclusion(treatmentDto.getConclusion());
		treatment.setAppointmentDate(treatmentDto.getAppointmentDate());
		treatment.setPatientMendicationList(treatmentDto.getPatientMendicationList());
		
		treatmentRepo.save(treatment);
//		dosageObject.setMedicationFkId(medicationObject.getMedicationId());
//		dosageObject.setMorning(patientMedicationDosageDto.isMorning());
//		dosageObject.setAfternoon(patientMedicationDosageDto.isAfternoon());
//		dosageObject.setNight(patientMedicationDosageDto.isNight());
//		dosageObject.setBefore(patientMedicationDosageDto.isBefore());
//		dosageObject.setAfter(patientMedicationDosageDto.isAfter());
	
//		patientDosageRepo.save(dosageObject);
		return "Success";
	}

	@Override
	public String deleteTreatment(Integer id) {
		Optional<Treatment> treatment = treatmentRepo.findById(id);
		treatmentRepo.deleteById(id);
		return "Deleted Successfully";
	}

	@Override
	public Treatment getTreatmentById(Integer treatment_id) {
		Optional<Treatment> treatmentObject = treatmentRepo.findById(treatment_id);
		Treatment treatmentgetObject = treatmentObject.get();
//		TreatmentDto treatmentDto = new TreatmentDto();
		return treatmentgetObject;
	}
	
	@Override
	public Treatment getTreatmentByUserId(Integer user_id_fk) {
		Optional<Treatment> treatmentObj = treatmentRepo.findTreatmentByUserId(user_id_fk);
		Treatment treatmentGetObj = treatmentObj.get();
		return treatmentGetObj; 
	}

}
