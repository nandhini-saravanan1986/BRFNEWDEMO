package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

	public interface BRRS_M_SRWA_12D_DETAIL_Repo extends JpaRepository<M_SRWA_12D_DETAIL_ENTITY, String> {

		@Query(value = "select * from BRRS_M_SRWA_12D_DETAILTABLE", nativeQuery = true)
		List<M_SRWA_12D_DETAIL_ENTITY> getdatabydateList(Date reportdate);
		
		@Query(value = "select * from BRRS_M_SRWA_12D_DETAILTABLE where ROW_ID =?1 and COLUMN_ID=?2", nativeQuery = true)
		List<M_SRWA_12D_DETAIL_ENTITY> GetDataByRowIdAndColumnId(String rowId,String ColumnId);
	}

	
	
