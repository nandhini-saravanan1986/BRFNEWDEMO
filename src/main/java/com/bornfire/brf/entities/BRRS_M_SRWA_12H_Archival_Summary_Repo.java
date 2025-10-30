package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_SRWA_12H_Archival_Summary_Repo 
        extends JpaRepository<M_SRWA_12H_Archival_Summary_Entity, M_SRWA_12H_Archival_Summary_PK> {

    //Fetch all report dates & versions
    @Query(value = "SELECT REPORT_DATE, REPORT_VERSION " +"FROM BRRS_M_SRWA_12H_ARCHIVALTABLE_SUMMARY " +"ORDER BY REPORT_VERSION",  nativeQuery = true)
    List<Object> getM_SRWA_12Harchival();

    // Fetch specific archival data by report date & version
    @Query(value = "SELECT * FROM BRRS_M_SRWA_12H_ARCHIVALTABLE_SUMMARY " + "WHERE REPORT_DATE = ?1 AND REPORT_VERSION = ?2",nativeQuery = true)
    List<M_SRWA_12H_Archival_Summary_Entity> getdatabydateListarchival(Date reportDate, String reportVersion);

    //  Fetch latest archival version for given date (no version input)
    @Query(value = "SELECT * FROM BRRS_M_SRWA_12H_ARCHIVALTABLE_SUMMARY " +"WHERE REPORT_DATE = ?1 AND REPORT_VERSION IS NOT NULL " + "ORDER BY TO_NUMBER(REPORT_VERSION) DESC " + "FETCH FIRST 1 ROWS ONLY",nativeQuery = true)
    Optional<M_SRWA_12H_Archival_Summary_Entity> getLatestArchivalVersionByDate(Date reportDate);

    // Fetch specific version if provided, otherwise fetch latest
    @Query(value = "SELECT * FROM BRRS_M_SRWA_12H_ARCHIVALTABLE_SUMMARY " +  "WHERE TRUNC(REPORT_DATE) = TRUNC(:reportDate) " +"AND (:reportVersion IS NULL OR REPORT_VERSION = :reportVersion) " + "ORDER BY TO_NUMBER(REPORT_VERSION) DESC " + "FETCH FIRST 1 ROWS ONLY",  nativeQuery = true)
    Optional<M_SRWA_12H_Archival_Summary_Entity> getdatabydateListWithArchivalVersion(
    @Param("reportDate") Date reportDate,
    @Param("reportVersion") String reportVersion);

    // Fetch by primary key (used internally by Spring Data JPA)
    Optional<M_SRWA_12H_Summary_Entity> findByReportDateAndReportVersion(Date reportDate, String reportVersion);
    //Current Report Version Only Shown 
    @Query(value = "SELECT *  FROM BRRS_M_SRWA_12H_ARCHIVALTABLE_SUMMARY WHERE REPORT_VERSION IS NOT NULL ORDER BY REPORT_VERSION DESC FETCH FIRST 1 ROWS ONLY ", nativeQuery = true)
    List<M_SRWA_12H_Archival_Summary_Entity> getdatabydateListWithVersion();

}
