package com.bornfire.xbrl.entities.BRSS;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface  T6CurProdServiceRepo extends JpaRepository<T6Report, Date>{
	
	@Query(value = "select * from T6_PROFILE_OF_NEW_CUSTOMER where trunc(REPORT_DATE)=?1", nativeQuery = true)
	List<T6Report> getT6CurProdServices(Date d1);
}
