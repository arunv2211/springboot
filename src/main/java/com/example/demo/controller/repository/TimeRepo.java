package com.example.demo.controller.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Time;

public interface TimeRepo extends JpaRepository<Time, Integer>{

}
