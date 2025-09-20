package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_Q_SMME_DEP_Repo extends JpaRepository<BRRS_Q_SMME_DEP_Entity, Date> {

//    @Query(value = "SELECT * FROM BRRS_Q_SMME_DEP_SUMMARYTABLE WHERE REPORT_DATE = :reportDate", nativeQuery = true)
//    List<BRRS_Q_SMME_DEP_Entity> getDataByReportDate(@Param("reportDate") Date reportDate);
    
    @Query(value = "select * from BRRS_Q_SMME_DEP_SUMMARYTABLE", nativeQuery = true)
	List<BRRS_Q_SMME_DEP_Entity> getdatabydateList(Date rpt_code);
}
