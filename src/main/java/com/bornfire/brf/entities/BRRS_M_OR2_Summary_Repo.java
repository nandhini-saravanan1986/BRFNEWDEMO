package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_OR2_Summary_Repo extends JpaRepository<M_OR2_Summary_Entity, Date> {

    @Query(value = "SELECT * FROM BRRS_M_OR2_SUMMARYTABLE WHERE REPORT_DATE =?1", nativeQuery = true)
    List<M_OR2_Summary_Entity> getdatabydateList( Date reportdate); // <-- FIXED PARAM BINDING
}










