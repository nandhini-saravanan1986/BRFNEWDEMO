package com.bornfire.brf.entities;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
public interface BRRS_M_SEC_Detail_Repo2 extends JpaRepository<BRRS_M_SEC_Detail_Entity2, String> {
   // Fetch all records for a given date
   @Query(value = "select * from BRRS_M_SEC_DETAILTABLE2 where REPORT_DATE = ?1", nativeQuery = true)
   List<BRRS_M_SEC_Detail_Entity2> getdatabydateList(Date reportdate);
   // ✅ Pagination fixed → use OFFSET and LIMIT correctly
   @Query(value = "select * from BRRS_M_SEC_DETAILTABLE2 where REPORT_DATE = ?1 offset ?2 rows fetch next ?3 rows only", nativeQuery = true)
   List<BRRS_M_SEC_Detail_Entity2> getdatabydateList(Date reportdate, int offset, int limit);
   // Count rows by date
   @Query(value = "select count(*) from BRRS_M_SEC_DETAILTABLE2 where REPORT_DATE = ?1", nativeQuery = true)
   int getdatacount(Date reportdate);
 
	@Query(value = "select * from BRRS_M_SEC_DETAILTABLE2 where ROW_ID =?1 and COLUMN_ID=?2 AND REPORT_DATE=?3", nativeQuery = true)
	List<BRRS_M_SEC_Detail_Entity2> GetDataByRowIdAndColumnId(String rowId,String ColumnId,Date reportdate);
}