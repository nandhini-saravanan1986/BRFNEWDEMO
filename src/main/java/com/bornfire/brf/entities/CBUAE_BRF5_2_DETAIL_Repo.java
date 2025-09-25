package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CBUAE_BRF5_2_DETAIL_Repo extends JpaRepository<CBUAE_BRF5_2_DETAILTABLE01_ENTITY, String> {
	
	@Query(value = "select * from BRF5_2_DETAILTABLE  ", nativeQuery = true)
	List<CBUAE_BRF5_2_DETAILTABLE01_ENTITY> getdatabydateList(Date reportdate);

}
