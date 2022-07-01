package com.newer.booking.entity;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * 门诊
 * 
 * @author wtao
 *
 */

public class Clinic {

	/**
	 * 门诊编号
	 */
	private int id;
	
	/**
	 * 门诊类型
	 */
	private String title;
	
	/**
	 * 门诊收费
	 */
	private BigDecimal fees;
	
	public Clinic() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public BigDecimal getFees() {
		return fees;
	}

	public void setFees(BigDecimal fees) {
		this.fees = fees;
	}
	
}
