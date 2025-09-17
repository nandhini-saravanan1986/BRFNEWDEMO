package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_AIDP_Summary_Repo3 extends JpaRepository<BRRS_M_AIDP_Summary_Entity3, Date> {

	@Query(value = "select * from BRRS_M_AIDP_SUMMARYTABLE3 ", nativeQuery = true)
	List<BRRS_M_AIDP_Summary_Entity3> getdatabydateList(Date rpt_code);
	
}
