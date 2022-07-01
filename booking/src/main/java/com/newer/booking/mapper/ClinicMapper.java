package com.newer.booking.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.newer.booking.entity.Clinic;

@Mapper
public interface ClinicMapper {

	@Select("select id,title,fees from clinic where id=#{id}")
	Clinic findById(int id);
}
