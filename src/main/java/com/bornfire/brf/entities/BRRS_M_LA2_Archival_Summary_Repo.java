package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_LA2_Archival_Summary_Repo extends JpaRepository<M_LA2_Archival_Summary_Entity, Date> {

  @Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_M_LA2_ARCHIVALTABLE_SUMMARY order by REPORT_VERSION", nativeQuery = true)
    List<Object> getM_LA2archival();

    @Query(value = "select * from BRRS_M_LA2_ARCHIVALTABLE_SUMMARY where REPORT_DATE = to_date(?1,'dd-MM-yyyy') and REPORT_VERSION = ?2", nativeQuery = true)
    List<M_LA2_Archival_Summary_Entity> getdatabydateListarchival(String report_date, Object version);
}


