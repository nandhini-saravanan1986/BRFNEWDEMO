package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_Q_SMME_Intrest_Income_Summary_Repo extends JpaRepository<Q_SMME_Intrest_Income_Summary_Entity, Date> {

    @Query(value = "SELECT * FROM BRRS_Q_SMME_INTREST_INCOME_SUMMARYTABLE WHERE REPORT_DATE=?1", nativeQuery = true)
    List<Q_SMME_Intrest_Income_Summary_Entity> getdatabydateList(Date reportdate);
}


