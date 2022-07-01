package com.newer.booking.entity;

import org.springframework.stereotype.Component;

import java.sql.Date;

/**
 * 门诊排班
 * 
 * @author wtao
 *
 */

public class Scheduling {

	/**
	 * 门诊排班编号
	 */
	private int id;
	
	/**
	 * 门诊医生
	 */
	private Doctor doctor;
	
	/**
	 * 出诊时间
	 */
	private Date time;
	
	/**
	 * 门诊类型
	 */
	private Clinic clinic;
	
	/**
	 * 已预约的人数
	 */
	private int count;
	
	public Scheduling() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Clinic getClinic() {
		return clinic;
	}

	public void setClinic(Clinic clinic) {
		this.clinic = clinic;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
	
}
