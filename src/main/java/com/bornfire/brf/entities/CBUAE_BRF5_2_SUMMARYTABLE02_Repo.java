package com.bornfire.brf.entities;

import java.util.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CBUAE_BRF5_2_SUMMARYTABLE02_Repo extends JpaRepository< CBUAE_BRF5_2_SUMMARY_ENTITY02, Date> {
	
	/*
	 * @Query(value = "select * from CBUAE_BRF5_2_SUMMARYTABLE02  ", nativeQuery =
	 * true) List<CBUAE_BRF5_2_SUMMARY_ENTITY02> getdatabydateList(Date reportDate);
	 * 
	 * 
	 * 
	 * @Query(value = "select * from CBUAE_BRF5_2_SUMMARYTABLE02", nativeQuery = true)
	List<CBUAE_BRF5_2_SUMMARY_ENTITY02> getdatabydateList();
	 * 
	 * 
	 * 
	 */
	
	

	@Query(value = "select * from  CBUAE_BRF5_2_SUMMARYTABLE02", nativeQuery = true)
	List<CBUAE_BRF5_2_SUMMARY_ENTITY02> getdatabydateList(Date reportdate);

}
