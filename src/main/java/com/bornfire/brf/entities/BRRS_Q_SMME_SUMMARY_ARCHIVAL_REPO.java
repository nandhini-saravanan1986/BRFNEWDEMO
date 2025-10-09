package com.bornfire.brf.entities;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BRRS_Q_SMME_SUMMARY_ARCHIVAL_REPO extends JpaRepository<Q_SMME_SUMMARY_TABLE_ARCHIVAL_ENTITY, Integer> {

    @Query(value = "SELECT REPORT_DATE, REPORT_VERSION FROM BRRS_Q_SMME_ARCHIVAL_TABLE_SUMMARY ORDER BY REPORT_VERSION", nativeQuery = true)
    List<Object> getArchvalList();

    @Query(value = "select * from BRRS_Q_SMME_ARCHIVAL_TABLE_SUMMARY where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
    List<Q_SMME_SUMMARY_TABLE_ARCHIVAL_ENTITY> getdatabydateListarchival(Date report_date, String report_version);
}