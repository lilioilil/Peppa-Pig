package com.newer.booking.entity;

import org.springframework.stereotype.Component;

/**
 * 医生
 * 
 * @author wtao
 *
 */

public class Doctor {

	/**
	 * 医生编号
	 */
	private int id;
	
	/**
	 * 医生姓名
	 */
	private String name;
	
	/**
	 * 医生所在科室
	 */
	private Department department;
	
	/**
	 * 医生职称
	 */
	private String level;
	
	public Doctor() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	
	
	
}
