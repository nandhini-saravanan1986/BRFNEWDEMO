package com.bornfire.brf.entities;

import java.util.Date;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CBUAE_BRF5_2_SUMMARYTABLE01_Repo  extends JpaRepository<CBUAE_BRF5_2_SUMMARY_ENTITY, Date> {

	@Query(value = "select * from CBUAE_BRF5_2_SUMMARYTABLE01", nativeQuery = true)
List<CBUAE_BRF5_2_SUMMARY_ENTITY> getdatabydateList(Date reportdate);
	


}
