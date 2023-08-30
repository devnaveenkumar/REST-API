package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.ApplicationModel;

import jakarta.transaction.Transactional;


public interface ApplicationRepo extends JpaRepository<ApplicationModel, Integer>{
	//select
	@Query(value="select * from toystoretable where id=:i", nativeQuery = true)
	public List<ApplicationModel> getmodelinfo(@Param("i") int i);
	
	//delete
	@Modifying
	@Transactional
	@Query(value="delete from toystoretable where id=:idd", nativeQuery = true)
	public void deletefromtable(@Param("idd") int idd);
	
	//update
	@Modifying
	@Transactional
	@Query(value="update toystoretable set price = 500 where id =:i", nativeQuery = true)
	public void updatetable(@Param("i") int i);
	
}
