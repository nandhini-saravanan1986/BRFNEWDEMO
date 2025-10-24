package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_SRWA_12H_Summary_Repo extends JpaRepository<M_SRWA_12H_Summary_Entity, Date> {

    // 1️⃣ Fetch all rows or optionally filter by report date
    @Query(value = "select * from BRRS_M_SRWA_12H_SUMMARYTABLE", nativeQuery = true)
    List<M_SRWA_12H_Summary_Entity> getdatabydateList(); // no parameter

    @Query(value = "select * from BRRS_M_SRWA_12H_SUMMARYTABLE where REPORT_DATE = ?1", nativeQuery = true)
    List<M_SRWA_12H_Summary_Entity> getdatabydateList(Date reportDate); // with date filter

    // 2️⃣ Fetch REPORT_DATE and REPORT_VERSION only
    @Query(value = "select REPORT_DATE, REPORT_VERSION from BRRS_M_SRWA_12H_SUMMARYTABLE order by REPORT_VERSION", nativeQuery = true)
    List<Object> getM_SRWA_12HResub();

    // 3️⃣ Fetch specific row by date and version
    @Query(value = "select * from BRRS_M_SRWA_12H_SUMMARYTABLE where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
    List<M_SRWA_12H_Summary_Entity> getdatabydateListsummary(Date reportDate, String reportVersion);

    // 4️⃣ Find the latest version for a report date (derived query)
    Optional<M_SRWA_12H_Summary_Entity> findTopByReportDateOrderByReportVersionDesc(Date reportDate);

    // 5️⃣ Optional duplicate check (derived query)
    Optional<M_SRWA_12H_Summary_Entity> findByReportDateAndReportVersion(Date reportDate, String reportVersion);

}
