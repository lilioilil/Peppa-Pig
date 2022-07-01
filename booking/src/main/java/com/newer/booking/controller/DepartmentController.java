package com.newer.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.booking.entity.Department;
import com.newer.booking.mapper.DepartmentMapper;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/api/dept")
public class DepartmentController {
	
	@Autowired
	DepartmentMapper departmentMapper;
	
	@GetMapping
	public List<Department> findAll() {
		return departmentMapper.findAll();
	}

}
