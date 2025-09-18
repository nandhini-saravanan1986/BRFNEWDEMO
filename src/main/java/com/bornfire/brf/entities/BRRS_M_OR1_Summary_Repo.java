package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_OR1_Summary_Repo extends JpaRepository<M_OR1_Summary_Entity, Date> {
	@Query(value = "select * from BRRS_M_OR1_SUMMARYTABLE where report_date = ?1 ", nativeQuery = true)
	List<M_OR1_Summary_Entity> getdatabydateList(Date rpt_date);

}
