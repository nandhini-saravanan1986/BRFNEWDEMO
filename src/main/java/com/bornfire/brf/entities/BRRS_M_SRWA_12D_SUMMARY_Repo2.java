package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_SRWA_12D_SUMMARY_Repo2 extends JpaRepository<M_SRWA_12D_SUMMARY_ENTITY2, Date> {

	@Query(value = "select * from BRRS_M_SRWA_12D_SUMMARYTABLE2 where report_date = ?1", nativeQuery = true)
	List<M_SRWA_12D_SUMMARY_ENTITY2> getdatabydateList(Date rpt_date);

}
