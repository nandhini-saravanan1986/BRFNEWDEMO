package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CBUAE_BRF2_4_DETAIL_Repo extends JpaRepository<CBUAE_BRF2_4_DETAIL_ENTITY, String> {

	@Query(value = "select * from CBUAE_BRF2_4_DETAILTABLE  ", nativeQuery = true)
	List<CBUAE_BRF2_4_DETAIL_ENTITY> getdatabydateList(Date reportdate);
	
	@Query(value = "select * from CBUAE_BRF2_4_DETAILTABLE where ROW_ID =?1 and COLUMN_ID=?2", nativeQuery = true)
	List<CBUAE_BRF2_4_DETAIL_ENTITY> GetDataByRowIdAndColumnId(String rowId,String ColumnId);
}
