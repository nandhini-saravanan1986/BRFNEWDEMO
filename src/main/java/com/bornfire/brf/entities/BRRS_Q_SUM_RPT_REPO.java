package com.bornfire.brf.entities;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BRRS_Q_SUM_RPT_REPO extends JpaRepository<BRRS_Q_SMME_SUMMARY_RPT_ENTITY_1, Integer> {

    @Query(value = "select * from BRRS_Q_SMME_SUMMARY_TABLE  WHERE REPORT_DATE =:rpt_code", nativeQuery = true)
    List<BRRS_Q_SMME_SUMMARY_RPT_ENTITY_1> getdatabydateList(@Param("rpt_code") Date rpt_code);
}