package com.newer.booking.entity;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 部门
 * 
 * @author wtao
 *
 */

public class Department {

	/**
	 * 编号
	 */
	private int id;
	
	/**
	 * 部门名称
	 */
	private String title;
	
	/**
	 * 所属子部门
	 */
	private List<Department> sub;
	
	/**
	 * 部门简介
	 */
	private String about;
	
	public Department() {
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

	public List<Department> getSub() {
		return sub;
	}

	public void setSub(List<Department> sub) {
		this.sub = sub;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
	
	
}
