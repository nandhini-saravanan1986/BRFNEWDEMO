package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Q_ATF_ARCHIVAL_SUMMARY_REPO extends JpaRepository<Q_ATF_ARCHIVAL_SUMMARY_ENTITY, Date>{	
    @Query(value = "SELECT REPORT_DATE, REPORT_VERSION FROM Q_ATF_ARCHIVAL_FIN_SUMMARY_TABLE ORDER BY REPORT_VERSION", nativeQuery = true)
    List<Object> getArchvalList();

    @Query(value = "select * from Q_ATF_ARCHIVAL_FIN_SUMMARY_TABLE where REPORT_DATE = ?1 and REPORT_VERSION = ?2", nativeQuery = true)
    List<Q_ATF_ARCHIVAL_SUMMARY_ENTITY> getdatabydateListarchival(Date report_date, String report_version);
    
//	@Query(value = "select * from Q_ATF_ARCHIVAL_SUMMARY_ENTITY where REPORT_DATE=?1 AND DATA_ENTRY_VERSION=?2", nativeQuery = true)
//	List<Q_ATF_ARCHIVAL_SUMMARY_ENTITY> getdatabydateList(Date reportdate,String DATA_ENTRY_VERSION);
//
//	@Query(value = "select * from Q_ATF_ARCHIVAL_SUMMARY_ENTITY where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 AND DATA_ENTRY_VERSION=?4", nativeQuery = true)
//	List<Q_ATF_ARCHIVAL_SUMMARY_ENTITY> GetDataByRowIdAndColumnId(String rowId,String ColumnId,Date reportdate,String DATA_ENTRY_VERSION);
}
