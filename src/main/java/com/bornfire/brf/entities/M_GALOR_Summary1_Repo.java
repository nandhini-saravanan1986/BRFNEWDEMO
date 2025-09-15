package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface M_GALOR_Summary1_Repo  extends JpaRepository<M_GALOR_Summary_Entity1, Date>{


	@Query(value = "select * from BRRS_M_GALOR_SUMMARYTABLE1  ", nativeQuery = true)
	List<M_GALOR_Summary_Entity1> getdatabydateList(Date rpt_code);
	
}
