package com.newer.booking.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SchedulingMapper {

	
	@Select("select * from v_scheduling where pid=#{id}")
	List<HashMap<String, Object>> find(int id);
	
	
}
