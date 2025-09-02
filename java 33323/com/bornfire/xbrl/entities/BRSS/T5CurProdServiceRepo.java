package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface  T5CurProdServiceRepo extends JpaRepository<T5AReport, Date>{
	
	@Query(value = "select * from T5A_PROFILE_FACE_TO_FACE where trunc(REPORT_DATE)=?1", nativeQuery = true)
	List<T5AReport> getT5ACurProdServices(Date d1);
	
	
	
}

