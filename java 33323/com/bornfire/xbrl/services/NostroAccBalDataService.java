package com.bornfire.xbrl.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bornfire.xbrl.entities.NostroAccBalData;
import com.bornfire.xbrl.entities.NostroAccBalDataRepository;


@Service
public class NostroAccBalDataService {

    @Autowired
    NostroAccBalDataRepository nostroAccBalRepo;

    public boolean updateNostro(NostroAccBalData updatedData) {
        Optional<NostroAccBalData> existingOpt = nostroAccBalRepo.findById(updatedData.getAccountNo());

        if (existingOpt.isPresent()) {
            NostroAccBalData existing = existingOpt.get();

            // Only update fields expected from the form
            existing.setBankName(updatedData.getBankName());
            existing.setHeadOfficeSubsidiary(updatedData.getHeadOfficeSubsidiary());
            existing.setSubsidiary(updatedData.getSubsidiary());
            existing.setBankSymbol(updatedData.getBankSymbol());
            existing.setConventionalIslamic(updatedData.getConventionalIslamic());
            existing.setLocalForeign(updatedData.getLocalForeign());
            existing.setCbuaeTiering(updatedData.getCbuaeTiering());
            existing.setCounterpartyNostroAccount(updatedData.getCounterpartyNostroAccount());
            existing.setFinalRatingBanks(updatedData.getFinalRatingBanks());
            existing.setFinalRatingCbuae(updatedData.getFinalRatingCbuae());
            existing.setCountryOfRisk(updatedData.getCountryOfRisk());
            existing.setCbuaeGeographicalZone(updatedData.getCbuaeGeographicalZone());
            existing.setCurrency(updatedData.getCurrency());
            existing.setCounterpartySettlementDate(updatedData.getCounterpartySettlementDate());
            existing.setCounterpartyBalance(updatedData.getCounterpartyBalance());
            existing.setCounterpartyBalanceAed(updatedData.getCounterpartyBalanceAed());
            existing.setBankInternalSettlementDate(updatedData.getBankInternalSettlementDate());
            existing.setBankBalance(updatedData.getBankBalance());
            existing.setBankBalanceAed(updatedData.getBankBalanceAed());
            existing.setGap(updatedData.getGap());
            existing.setReportSubmitDate(updatedData.getReportSubmitDate());

            // save updated data
            nostroAccBalRepo.save(existing);
            return true;
        } else {
            return false; // record not found
        }
    }
}

