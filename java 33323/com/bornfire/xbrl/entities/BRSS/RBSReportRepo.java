package com.bornfire.xbrl.entities.BRSS;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface RBSReportRepo extends JpaRepository<RBSReport, Integer> {
	

	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'AML' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportList();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'IFRS9_QUAN' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListIFRSQUAN();
	
	@Query(value = "select * from BRBS_OR_RPT_MAST ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListOR();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'CR_RBS' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListCR();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'RR_RBS' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListRR();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'LR_RBS' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListLR();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'MR_RBS' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListMR();
	
	@Query(value = "select * from BRBS_RPT_MAST  where det_flg='Y' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportList1();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'RL_RBS' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListRL();
	
	@Query(value = "select * from BRBS_RPT_MAST WHERE REMARKS_5 = 'IFRS9_QUALI' ORDER BY srl_no", nativeQuery = true)
	List<RBSReport> getReportListIFRSQUALI();
	
//	@Query(value = "select SUM(NON_FUND_BASED_COMMITMENTS_IN_FAVOUR_OF_BANK) from RR_T3A_SOURCES_AND_USES_OF_FUNDS_TABLE a where a.REPORT_DATE= ?1 ", nativeQuery = true)
//	BigDecimal getsumOf_NON_FUND_BASED_COMMITMENTS_IN_FAVOUR_OF_BANK(Date date);
}