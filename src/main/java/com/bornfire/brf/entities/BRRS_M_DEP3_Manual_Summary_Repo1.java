package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_DEP3_Manual_Summary_Repo1 extends JpaRepository<M_DEP3_Manual_Summary_Entity1, Date> {

    @Query(value = "SELECT * FROM BRRS_M_DEP3_MANUAL_SUMMARYTABLE1 WHERE REPORT_DATE = ?1", nativeQuery = true)
    List<M_DEP3_Manual_Summary_Entity1> getdatabydateList(Date reportDate);
}








