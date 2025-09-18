package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_CA5_Archival_Summary_Repo2 extends JpaRepository<M_CA5_Archival_Summary_Entity2, Date> {

    @Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_M_CA5_ARCHIVALTABLE_SUMMARY2 order by REPORT_VERSION", nativeQuery = true)
    List<Object> getM_CA5archival();

    @Query(value = "select * from BRRS_M_CA5_ARCHIVALTABLE_SUMMARY2 where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
    List<M_CA5_Archival_Summary_Entity2> getdatabydateListarchival(Date report_date, String report_version);
}
