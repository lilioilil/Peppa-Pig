package com.newer.booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.newer.booking.entity.Patient;

@Mapper
public interface PatientMapper {

	@Insert("insert into(name,id_card,phone) values(#{name}, #{idCard}, #{phone})")
	@Options(useGeneratedKeys = true, keyColumn = "id", keyProperty = "id")
	void save(Patient patient);
	
	@Select("select id,name,id_card,phone from patient where id=#{id}")
	Patient findById(int id);
	
	@Select("select id,name,id_card,phone from patient where state=1")
	@Results(value = {
			@Result(column = "id_card", property = "idCard")
	})
	List<Patient> findAll();
	
	@Update("update patient set name=#{name}, id_card=#{idCard}, phone=#{phone} where id=#{id}")
	void update(Patient patient);
	
	
	@Update("update patient set state=2 where id=#{id}")
	void remove(int id);
}
