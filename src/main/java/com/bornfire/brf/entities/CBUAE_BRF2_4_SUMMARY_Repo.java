package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CBUAE_BRF2_4_SUMMARY_Repo extends JpaRepository<CBUAE_BRF2_4_SUMMARY_ENTITY, Date> {

	@Query(value = "select * from CBUAE_BRF2_4_SUMMARYTABLE  ", nativeQuery = true)
	List<CBUAE_BRF2_4_SUMMARY_ENTITY> getdatabydateList(Date rpt_code);

}
