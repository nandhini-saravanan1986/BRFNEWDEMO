package com.bornfire.xbrl.entities;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface EMAILREP extends JpaRepository<EmailAlert, String> {

	
	@Query(value = "select count(*) from BRBS_EMAIL_NOTIFICATION_TABLE where send_flg ='N'", nativeQuery = true)
	int getEmailSentCount();
	
	
	@Query(value = "SELECT * FROM BRBS_EMAIL_NOTIFICATION_TABLE where send_flg='N'", nativeQuery = true)
	List<EmailAlert> getEmailDetails();
	
	@Query(value = "SELECT * FROM BRBS_EMAIL_NOTIFICATION_TABLE where email_srl_no = ?1", nativeQuery = true)
	EmailAlert getEmailbySRl(BigDecimal srl);
	
	@Query(value = "SELECT RULESEQUENCE_1.NEXTVAL AS SRL_NO FROM DUAL", nativeQuery = true)
	BigDecimal gettestsrlno();
	
	@Query(value = "SELECT EMAILSEQUENCE.NEXTVAL AS SRL_NO FROM DUAL", nativeQuery = true)
	BigDecimal getsequence();
}
