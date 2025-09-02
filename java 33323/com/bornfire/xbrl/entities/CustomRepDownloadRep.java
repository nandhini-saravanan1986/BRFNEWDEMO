package com.bornfire.xbrl.entities;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomRepDownloadRep extends JpaRepository<CustomRepDownloadEntity, String> {

	@Query(value = "select * from CUSTOM_REPORT_QUEUE_TABLE where Del_on_download = 'N' order by rpt_srl_no DESC", nativeQuery = true)
	Page<CustomRepDownloadEntity> findAllCustom(Pageable pageable);
	
	 @Query(value = "select * from CUSTOM_REPORT_QUEUE_TABLE where rpt_srl_no=?1 ", nativeQuery = true) 
	 CustomRepDownloadEntity findByIdcustom(String rpt_ref_no);
}

