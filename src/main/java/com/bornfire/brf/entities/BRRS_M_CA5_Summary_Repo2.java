package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_CA5_Summary_Repo2 extends JpaRepository<M_CA5_Summary_Entity2, Date> {

	@Query(value = "select * from BRRS_M_CA5_SUMMARYTABLE2 where report_date = ?1", nativeQuery = true)
	List<M_CA5_Summary_Entity2> getdatabydateList(Date rpt_date);

}
