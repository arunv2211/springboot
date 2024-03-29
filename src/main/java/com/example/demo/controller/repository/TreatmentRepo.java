package com.example.demo.controller.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Treatment;
import com.example.demo.model.User;

public interface TreatmentRepo extends JpaRepository<Treatment, Integer>{
	@Query(value = "SELECT * FROM TREATMENT WHERE USER_ID_FK = ?1", nativeQuery = true)
	 Optional<Treatment> findTreatmentByUserId(Integer user_id_fk);

}
