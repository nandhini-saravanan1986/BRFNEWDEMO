package com.bornfire.xbrl.entities;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomReportsParmsRepo extends JpaRepository<CustomReportParms, String> {

	Optional<CustomReportParms> findById(String directorId);

	@Query(value = "select * from CUSTOM_RPT_PARMS order by rpt_ref_no DESC", nativeQuery = true)
	Page<CustomReportParms> findAllCustom(Pageable pageable);
	
	 @Query(value = "select * from CUSTOM_RPT_PARMS where rpt_ref_no=?1 ", nativeQuery = true) 
	 CustomReportParms findByIdcustom(String rpt_ref_no);

	 
}
