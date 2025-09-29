package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CBUAE_BRF5_17_DETAIL_Repo extends JpaRepository<CBUAE_BRF5_17_DETAIL_ENTITY, String> {

    
    @Query(value = "SELECT * FROM CBUAE_BRF5_17_DETAILTABLE WHERE REPORT_DATE = :reportdate", nativeQuery = true)
    List<CBUAE_BRF5_17_DETAIL_ENTITY> getdatabydateList(@Param("reportdate") Date reportdate); 
    
    @Query(value = "select * from CBUAE_BRF5_17_DETAILTABLE where ROW_ID =?1 and COLUMN_ID=?2", nativeQuery = true)
	List<CBUAE_BRF5_17_DETAIL_ENTITY> GetDataByRowIdAndColumnId(String rowId,String ColumnId); 

}

