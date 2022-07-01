package com.newer.booking.entity;

import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 预约挂号
 * 
 * @author wtao
 *
 */

public class Appointment {

	/**
	 * 预约编号
	 */
	private int id;
	
	/**
	 * 就诊人
	 */
	private Patient patient;
	
	/**
	 * 医生
	 */
	private Doctor doctor;
	
	/**
	 * 预约时间
	 */
	private Date time;
	
	/**
	 * 预约流水号
	 */
	private int num;
	
	/**
	 * 预约门诊
	 */
	private Clinic clinic;
	
	/**
	 * 挂号时间
	 */
	private Date generate;
	
	/**
	 * 预约状态
	 */
	private String state;
	
	public Appointment() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public Date getGenerate() {
		return generate;
	}

	public void setGenerate(Date generate) {
		this.generate = generate;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
}
