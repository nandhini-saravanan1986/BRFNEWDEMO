package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_SRWA_12H_Summary_Repo 
        extends JpaRepository<M_SRWA_12H_Summary_Entity, M_SRWA_12H_Summary_PK> {

    // Fetch all rows for a specific report date
    @Query(value = "SELECT * FROM BRRS_M_SRWA_12H_SUMMARYTABLE WHERE REPORT_DATE = ?1", nativeQuery = true)
    List<M_SRWA_12H_Summary_Entity> getdatabydateList(Date rpt_date);
    
@Query(value = "SELECT *  FROM BRRS_M_SRWA_12H_SUMMARYTABLE WHERE REPORT_DATE = ?1   AND REPORT_VERSION IS NOT NULL ORDER BY REPORT_VERSION DESC FETCH FIRST 1 ROWS ONLY ", nativeQuery = true)
List<M_SRWA_12H_Summary_Entity> getdatabydateListWithVersion(String todate);


    // Fetch report date and version (for resubmission)
    @Query(value = "SELECT REPORT_DATE, REPORT_VERSION FROM BRRS_M_SRWA_12H_SUMMARYTABLE ORDER BY REPORT_VERSION", nativeQuery = true)
    List<Object> getM_SRWA_12HResub();

    // Fetch specific record by date and version
    @Query(value = "SELECT * FROM BRRS_M_SRWA_12H_SUMMARYTABLE WHERE REPORT_DATE = ?1 AND REPORT_VERSION = ?2", nativeQuery = true)
    List<M_SRWA_12H_Summary_Entity> getdatabydateListsummary(Date report_date, String report_version);

    // Find the latest version for a report date
    Optional<M_SRWA_12H_Summary_Entity> findTopByReportDateOrderByReportVersionDesc(Date reportDate);

    // Check if a version exists for a report date
    Optional<M_SRWA_12H_Summary_Entity> findByReportDateAndReportVersion(Date reportDate, String reportVersion);

        @Query(value = "SELECT *  FROM BRRS_M_SRWA_12H_SUMMARYTABLE WHERE REPORT_VERSION IS NOT NULL ORDER BY REPORT_VERSION DESC FETCH FIRST 1 ROWS ONLY ", nativeQuery = true)
    List<M_SRWA_12H_Summary_Entity> getdatabydateListWithVersion();
}
