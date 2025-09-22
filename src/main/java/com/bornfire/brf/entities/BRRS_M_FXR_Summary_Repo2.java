package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface BRRS_M_FXR_Summary_Repo2 extends JpaRepository<M_FXR_Summary_Entity2, Date> {

	@Query(value = "select * from BRRS_M_FXR_SUMMARYTABLE2", nativeQuery = true)
	List<M_FXR_Summary_Entity2> getdatabydateList(Date rpt_code);
	
}
