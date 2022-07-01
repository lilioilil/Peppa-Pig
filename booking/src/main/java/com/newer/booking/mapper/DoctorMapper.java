package com.newer.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.newer.booking.entity.Doctor;

@Mapper
public interface DoctorMapper {

	@Select("select id,name,department,level from doctor")
	@Results(value = {
			@Result(
					column = "department",
					property = "department",
					one = @One(select = "com.newer.booking.mapper.DepartmentMapper.findById"))
	})
	List<Doctor> findAll();
	
	@Select("select id,name,level from doctor where id=#{id}")
	Doctor findById(int id);
}
