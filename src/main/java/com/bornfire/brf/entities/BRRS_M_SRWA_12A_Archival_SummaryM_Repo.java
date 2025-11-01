package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_SRWA_12A_Archival_SummaryM_Repo extends JpaRepository<M_SRWA_12A_Archival_Summary_M_Entity, Date> {

    @Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_M_SRWA_12A_ARCHIVALTABLE_SUMMARY_M order by REPORT_VERSION", nativeQuery = true)
    List<Object> getM_SRWA_12Aarchival();

    @Query(value = "select * from BRRS_M_SRWA_12A_ARCHIVALTABLE_SUMMARY_M where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
    List<M_SRWA_12A_Archival_Summary_M_Entity> getdatabydateListarchival(Date report_date, String report_version);
}
