package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BRRS_M_SRWA_12A_SummaryM_Repo extends JpaRepository<M_SRWA_12A_Summary_M_Entity , Date> {

	
	    
	    
	    
	    @Query(value = "SELECT * FROM BRRS_M_SRWA_12A_SUMMARYTABLE_M WHERE TRUNC(REPORT_DATE) = TRUNC(:reportdate)", nativeQuery = true)
	    List<M_SRWA_12A_Summary_M_Entity> getdatabydateList(@Param("reportdate") Date reportdate);


}
