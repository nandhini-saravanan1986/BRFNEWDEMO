package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface M_GALOR_Archival_Detail_Repo extends JpaRepository<M_GALOR_Archival_Detail_Entity, String>{
	
	@Query(value = "select * from BRRS_M_GALOR_ARCHIVALTABLE_DETAIL where REPORT_DATE=?1 AND DATA_ENTRY_VERSION=?2", nativeQuery = true)
	List<M_GALOR_Archival_Detail_Entity> getdatabydateList(Date reportdate,String DATA_ENTRY_VERSION);
	
	
	@Query(value = "select * from BRRS_M_GALOR_ARCHIVALTABLE_DETAIL where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 AND DATA_ENTRY_VERSION=?4", nativeQuery = true)
	List<M_GALOR_Archival_Detail_Entity> GetDataByRowIdAndColumnId(String rowId,String ColumnId,Date reportdate,String DATA_ENTRY_VERSION);
	
}
