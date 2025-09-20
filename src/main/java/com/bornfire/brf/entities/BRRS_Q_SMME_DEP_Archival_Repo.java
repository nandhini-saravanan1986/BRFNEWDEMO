package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_Q_SMME_DEP_Archival_Repo extends JpaRepository<BRRS_Q_SMME_DEP_Archival_Entity, Date> {


	
	 @Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_Q_SMME_DEP_ARCHIVAL_SUMMARYTABLE order by REPORT_VERSION", nativeQuery = true)
	    List<Object> getQ_SMME_DEParchival();

	    @Query(value = "select * from BRRS_Q_SMME_DEP_ARCHIVAL_SUMMARYTABLE where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
	    List<BRRS_Q_SMME_DEP_Archival_Entity> getdatabydateListarchival(Date report_date, String report_version);
}
