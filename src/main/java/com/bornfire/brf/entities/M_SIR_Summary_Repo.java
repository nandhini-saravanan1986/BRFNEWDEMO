package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface M_SIR_Summary_Repo extends JpaRepository<M_SIR_Summary_Entity, Date>{
	
@Query(value = "select * from BRRS_M_SIR_SUMMARYTABLE where report_date=?1", nativeQuery=true)
List<M_SIR_Summary_Entity> getdatabydateList(Date report_date);

}
