package com.bornfire.brf.entities;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RRReportRepo extends JpaRepository<RRReport, Integer> {
	@Query(value = "select * from RR_RPT_MASTER WHERE REMARKS_5 = 'M1' ORDER BY rpt_code", nativeQuery = true)
	List<RRReport> getReportListmonthly1();
	
	@Query(value = "select * from RR_RPT_MASTER WHERE RPT_CODE =?1", nativeQuery = true)
	Optional<RRReport> getParticularReport3(String rptcode);
	
	@Query(value = "select * from RR_RPT_MASTER where rpt_code=?1", nativeQuery = true)
	RRReport getReportbyrptcode(String rpt_code);
}
