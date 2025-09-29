package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;  // <-- IMPORT THIS
import org.springframework.stereotype.Repository;

@Repository
public interface CBUAE_BRF5_17_SUMMARY_Repo extends JpaRepository<CBUAE_BRF5_17_SUMMARY_ENTITY, Date> {

    @Query(value = "SELECT * FROM CBUAE_BRF5_17_SUMMARYTABLE WHERE REPORT_DATE =?1", nativeQuery = true)
    List<CBUAE_BRF5_17_SUMMARY_ENTITY> getdatabydateList( Date reportdate); // <-- FIXED PARAM BINDING
}
