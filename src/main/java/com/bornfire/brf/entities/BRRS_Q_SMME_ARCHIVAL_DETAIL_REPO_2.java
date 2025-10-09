package com.bornfire.brf.entities;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BRRS_Q_SMME_ARCHIVAL_DETAIL_REPO_2 extends JpaRepository<BRRS_Q_SMME_ARCHIVAL_DETAIL_Entity_2, String> {

	@Query(value = "select * from BRRS_Q_SMME_ARCHIVAL_TABLE_DETAIL where REPORT_DATE=?1 AND DATA_ENTRY_VERSION=?2", nativeQuery = true)
	List<BRRS_Q_SMME_ARCHIVAL_DETAIL_Entity_2> getdatabydateList(Date reportdate,String DATA_ENTRY_VERSION);

	@Query(value = "select * from BRRS_Q_SMME_ARCHIVAL_TABLE_DETAIL where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 AND DATA_ENTRY_VERSION=?4", nativeQuery = true)
	List<BRRS_Q_SMME_ARCHIVAL_DETAIL_Entity_2> GetDataByRowIdAndColumnId(String rowId,String ColumnId,Date reportdate,String DATA_ENTRY_VERSION);
}
