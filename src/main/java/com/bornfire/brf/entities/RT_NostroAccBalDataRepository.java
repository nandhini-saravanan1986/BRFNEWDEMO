package com.bornfire.brf.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RT_NostroAccBalDataRepository extends JpaRepository<RT_NostroAccBalData, String> {
	// Add custom queries if needed

	@Query(value = "select * from BCBUAE_NOSTRO_ACC_BAL_DATA where DEL_FLG != 'Y'", nativeQuery = true)
	List<RT_NostroAccBalData> getlist();


	@Query(value = "SELECT " + "DATA_DATE, BANK_NAME, HEAD_OFFICE_SUBSIDIARY, SUBSIDIARY, "
			+ "BANK_SYMBOL, CONVENTIONAL_ISLAMIC, LOCAL_FOREIGN, CBUAE_TIERING, "
			+ "COUNTERPARTY_NOSTRO_ACCOUNT, FINAL_RATING_BANKS, FINAL_RATING_CBUAE, "
			+ "COUNTRY_OF_RISK, CBUAE_GEOGRAPHICAL_ZONE, CURRENCY, "
			+ "COUNTERPARTY_SETTLEMENT_DATE, COUNTERPARTY_BALANCE, COUNTERPARTY_BALANCE_AED, "
			+ "BANK_INTERNAL_SETTLEMENT_DATE, BANK_BALANCE, BANK_BALANCE_AED, " + "ACCOUNT_NO, GAP "
			+ "FROM BCBUAE_NOSTRO_ACC_BAL_DATA", nativeQuery = true)
	List<Object[]> getnostrodatalistdata1();

}
