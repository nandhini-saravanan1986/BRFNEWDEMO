package com.bornfire.brf.entities;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BRRS_M_UNCONS_INVEST_Summary_Repo4 extends JpaRepository<M_UNCONS_INVEST_Summary_Entity4, Date> {
	@Query(value = "select * from BRRS_M_UNCONS_INVEST_SUMMARYTABLE4  ", nativeQuery = true)
	List<M_UNCONS_INVEST_Summary_Entity4> getdatabydateList(Date rpt_code);
	
}