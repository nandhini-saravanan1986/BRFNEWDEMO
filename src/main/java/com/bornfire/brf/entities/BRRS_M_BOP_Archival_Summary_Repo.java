package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_BOP_Archival_Summary_Repo extends JpaRepository<M_BOP_Archival_Summary_Entity, Date>{
	
	@Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_M_BOP_ARCHIVALTABLE_SUMMARY order by REPORT_VERSION", nativeQuery = true)
	List<Object> getM_BOParchival();
	
	@Query(value = "select * from BRRS_M_BOP_ARCHIVALTABLE_SUMMARY where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
	List<M_BOP_Archival_Summary_Entity> getdatabydateListarchival(Date report_date, String report_version);


}


