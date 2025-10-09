package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Q_ATF_ARCHIVAL_DETAIL_REPO extends JpaRepository<Q_ATF_DETAIL_ARCHIVAL_ENTITY, Date>{	
	@Query(value = "select * from Q_ATF_ACCESS_FIN_DETAIL_ARCHIVAL_TABLE where REPORT_DATE=?1 AND DATA_ENTRY_VERSION=?2", nativeQuery = true)
	List<Q_ATF_DETAIL_ARCHIVAL_ENTITY> getdatabydateList(Date reportdate,String DATA_ENTRY_VERSION);

	@Query(value = "select * from Q_ATF_ACCESS_FIN_DETAIL_ARCHIVAL_TABLE where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 AND DATA_ENTRY_VERSION=?4", nativeQuery = true)
	List<Q_ATF_DETAIL_ARCHIVAL_ENTITY> GetDataByRowIdAndColumnId(String rowId,String ColumnId,Date reportdate,String DATA_ENTRY_VERSION);
}
