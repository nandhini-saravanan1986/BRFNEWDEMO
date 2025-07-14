package com.bornfire.xbrl.entities.BRSS;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RRReportRepo extends JpaRepository<RRReport, Integer> {
	

	
	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'RR' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportList();
	
	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'M1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListmonthly();
	
	@Query(value = "select * from RR_RPT_MAST WHERE REMARKS_5 = 'Q1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListquarterly();
	
	
		
}
