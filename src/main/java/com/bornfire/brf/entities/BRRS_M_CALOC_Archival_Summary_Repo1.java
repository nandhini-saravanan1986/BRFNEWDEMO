package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_CALOC_Archival_Summary_Repo1 extends JpaRepository<M_CALOC_Archival_Summary_Entity1 , Date>{
	
	@Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_M_CALOC_ARCHIVALTABLE_SUMMARY1 order by REPORT_VERSION", nativeQuery = true)
	List<Object> getM_CALOCarchival();

	@Query(value = "select * from BRRS_M_CALOC_ARCHIVALTABLE_SUMMARY1 where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
	List<M_CALOC_Archival_Summary_Entity1> getdatabydateListarchival(Date report_date, String report_version);
	
	

}




