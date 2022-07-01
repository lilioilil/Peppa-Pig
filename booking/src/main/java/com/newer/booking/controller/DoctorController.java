package com.newer.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.booking.entity.Doctor;
import com.newer.booking.mapper.DoctorMapper;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/api/doctor")
public class DoctorController {
	
	@Autowired
	DoctorMapper doctorMapper;
	
	@GetMapping
	public List<Doctor> findAll() {
		return doctorMapper.findAll();
	}

}
