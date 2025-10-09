package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Q_ATF_ACCESS_FIN_REPO extends JpaRepository<Q_ATF_ACCESS_FIN_ENTITY, Date>{	
	@Query(value = "select * from Q_ATF_ACCESS_FIN_SUMMARY_RPT where REPORT_DATE =?1  ", nativeQuery = true)
    List<Q_ATF_ACCESS_FIN_ENTITY> getdatabydateList(Date reportdate);
}
