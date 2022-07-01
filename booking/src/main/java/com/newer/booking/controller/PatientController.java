package com.newer.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.newer.booking.entity.Patient;
import com.newer.booking.mapper.PatientMapper;

import javax.annotation.Resource;

@CrossOrigin
@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	PatientMapper patientMapper;
	
	// GET /api/patient
	@GetMapping
	public ResponseEntity<List<Patient>> findAll() {
		return new ResponseEntity<List<Patient>>(patientMapper.findAll(), HttpStatus.OK);
	}
	
	// GET /api/patient/id
	@GetMapping("/{id}")
	public ResponseEntity<Patient> load(@PathVariable int id) {
		return new ResponseEntity<Patient>(patientMapper.findById(id), HttpStatus.OK);
	}
	
	// POST /api/patient
	@PostMapping
	public ResponseEntity<Patient> create(@RequestBody Patient patient) {
		patientMapper.save(patient);
		return new ResponseEntity<Patient>(patient, HttpStatus.OK);
	}
	
	// PUT /api/patient/id
	@PutMapping("/{id}")
	public ResponseEntity<Patient> update(
			@PathVariable int id,
			@RequestBody Patient patient) {
		
		patient.setId(id);
		patientMapper.update(patient);
		
		return new ResponseEntity<>(patient, HttpStatus.OK);
	}
	
	// DELETE /api/patient/id
	@DeleteMapping("/{id}")
	public ResponseEntity<String> remove(
			@PathVariable int id) {
		
		patientMapper.remove(id);
		
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
