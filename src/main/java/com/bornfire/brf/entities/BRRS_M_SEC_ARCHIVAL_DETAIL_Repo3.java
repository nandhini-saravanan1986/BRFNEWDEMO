package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface BRRS_M_SEC_ARCHIVAL_DETAIL_Repo3 extends JpaRepository<BRRS_M_SEC_ARCHIVAL_DETAIL_Entity3, String> {

	@Query(value = "select * from BRRS_M_SEC_ARCHIVALTABLE_DETAIL3 where REPORT_DATE=?1 AND DATA_ENTRY_VERSION=?2", nativeQuery = true)
	List<BRRS_M_SEC_ARCHIVAL_DETAIL_Entity3> getdatabydateList(Date reportdate,String DATA_ENTRY_VERSION);
	
	@Query(value = "select * from BRRS_M_SEC_ARCHIVALTABLE_DETAIL3 where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 AND DATA_ENTRY_VERSION=?4", nativeQuery = true)
	List<BRRS_M_SEC_ARCHIVAL_DETAIL_Entity3> GetDataByRowIdAndColumnId(String rowId,String ColumnId,Date reportdate,String DATA_ENTRY_VERSION);
}

