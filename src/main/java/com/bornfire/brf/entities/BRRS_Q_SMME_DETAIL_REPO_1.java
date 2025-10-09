package com.bornfire.brf.entities;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BRRS_Q_SMME_DETAIL_REPO_1 extends JpaRepository<BRRS_Q_SMME_DETAIL_Entity_1, String> {

    @Query(value = "select * from BRRS_Q_SMME_DETAIL_TABLE where REPORT_DATE =?1  ", nativeQuery = true)
    List<BRRS_Q_SMME_DETAIL_Entity_1> getdatabydateList(Date reportdate);
    
    @Query(value = "select * from BRRS_Q_SMME_DETAIL_TABLE where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 ", nativeQuery = true)
    List<BRRS_Q_SMME_DETAIL_Entity_1> GetDataByRowIdAndColumnId(String rowId, String columnId, Date reportdate,String version);

	

}
