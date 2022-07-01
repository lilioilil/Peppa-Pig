package com.newer.booking.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.newer.booking.mapper.SchedulingMapper;

import javax.annotation.Resource;
@CrossOrigin
@RestController
@RequestMapping("/api/scheduling")
public class SchedulingController {
	
	@Autowired
	SchedulingMapper scheduling;
	
	
	@GetMapping("/dept/{id}")
	public List<HashMap<String, Object>> find(@PathVariable int id) {
		return scheduling.find(id);
	}

}
