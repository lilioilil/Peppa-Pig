package com.newer.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.booking.entity.Department;

@Mapper
public interface DepartmentMapper {

	@Select("select id,title,about from department where parent is null")
	@Results(value = {
			@Result(column = "id", property = "id"),
			@Result(
					column = "id", 
					property = "sub", 
					many = @Many(select = "findSub"))
	})
	List<Department> findAll();
	
	@Select("select id,title,about from department where parent=#{id}")
	List<Department> findSub(int id);
	
	@Select("select id,title,about from department where id=#{id}")
	List<Department> findById(int id);
}
