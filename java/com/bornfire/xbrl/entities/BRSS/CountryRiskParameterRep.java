package com.bornfire.xbrl.entities.BRSS;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface CountryRiskParameterRep  extends JpaRepository<CountryRiskParameter, String>{


	@Query(value = "select * from T4_COUNTRY_RISK_PARAMETER where DEL_FLG = 'N' ", nativeQuery = true)
	List<CountryRiskParameter> getall();



	@Query(value = "select * from T4_COUNTRY_RISK_PARAMETER a where a.COUNTRY_CODE='Y' ", nativeQuery = true)
	Page<CountryRiskParameter> findAllCustomTEST(Pageable pageable);
	

}
