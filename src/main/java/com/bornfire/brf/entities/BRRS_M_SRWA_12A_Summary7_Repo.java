package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_SRWA_12A_Summary7_Repo extends JpaRepository<M_SRWA_12A_Summary_Entity7 , Date> {

	 @Query(value = "SELECT * FROM BRRS_M_SRWA_12A_SUMMARYTABLE7 WHERE REPORT_DATE = ?1", nativeQuery = true)
	    List<M_SRWA_12A_Summary_Entity7> getdatabydateList(Date reportdate);

}
