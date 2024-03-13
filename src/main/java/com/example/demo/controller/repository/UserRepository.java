package com.example.demo.controller.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.controller.dto.UserDto;
import com.example.demo.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	
}
