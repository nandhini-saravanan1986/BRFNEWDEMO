package com.bornfire.xbrl.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bornfire.xbrl.entities.Fxriskdata;

@Repository
public interface FxRiskDataRepository extends JpaRepository<Fxriskdata, String> {
    // Add custom queries if needed

	@Query(value = "select * from BCBUAE_FX_RISK_DATA where DEL_FLG != 'Y' ", nativeQuery = true)
	List<Fxriskdata> getlist();

}
