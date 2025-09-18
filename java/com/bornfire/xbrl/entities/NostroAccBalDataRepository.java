package com.bornfire.xbrl.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bornfire.xbrl.entities.NostroAccBalData;

@Repository
public interface NostroAccBalDataRepository extends JpaRepository<NostroAccBalData, String> {
    // Add custom queries if needed

	@Query(value = "select * from BCBUAE_NOSTRO_ACC_BAL_DATA where DEL_FLG != 'Y'", nativeQuery = true)
	List<NostroAccBalData> getlist();

}
