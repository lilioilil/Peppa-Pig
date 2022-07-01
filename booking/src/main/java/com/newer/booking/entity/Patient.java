package com.newer.booking.entity;

import org.springframework.stereotype.Component;

/**
 * 就诊人
 * 
 * @author wtao
 *
 */

public class Patient {

	/**
	 * 就诊人编号
	 */
	private int id;
	
	/**
	 * 就诊人姓名
	 */
	private String name;
	
	/**
	 * 身份证号
	 */
	private String idCard;
	
	/**
	 * 手机号
	 */
	private String phone;
	
	/**
	 * 状态
	 */
	private String state;
	
	public Patient() {
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

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	
	
}
