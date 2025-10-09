package com.bornfire.brf.entities;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface Q_ATF_DETAILS_REPO extends JpaRepository<Q_ATF_DETAILS_ENTITY, Date>{	
	@Query(value = "select * from Q_ATF_ACCESS_FIN_DETAIL_TABLE where REPORT_DATE =?1  ", nativeQuery = true)
    List<Q_ATF_DETAILS_ENTITY> getdatabydateList(Date reportdate);

    @Query(value = "select * from Q_ATF_ACCESS_FIN_DETAIL_TABLE where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3 ", nativeQuery = true)
    List<Q_ATF_DETAILS_ENTITY> GetDataByRowIdAndColumnId(String rowId, String columnId, Date reportdate,String version);
}
