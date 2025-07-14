package com.bornfire.brf.services;

import java.io.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.bornfire.brf.entities.RT_NostroAccBalData;
import com.bornfire.brf.entities.RT_NostroAccBalDataRepository;

@Service
public class NostroAccBalDataService {

	@Autowired
	RT_NostroAccBalDataRepository nostroAccBalRepo;

	@Autowired
	private Environment env;

	public boolean updateNostro(RT_NostroAccBalData updatedData) {
		Optional<RT_NostroAccBalData> existingOpt = nostroAccBalRepo.findById(updatedData.getAccountNo());

		if (existingOpt.isPresent()) {
			RT_NostroAccBalData existing = existingOpt.get();

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

	public File generateNostroExcel() {
		File outputFile = null;

		try {
			List<Object[]> nostroList = nostroAccBalRepo.getnostrodatalistdata1();
			File templateFile = new File(
					env.getProperty("output.exportpathtemp") + "CBUAE_Nostro Account_Balance_Data_Template.xls");
			Workbook workbook = WorkbookFactory.create(new FileInputStream(templateFile));
			Sheet sheet = workbook.getSheetAt(0);

			CreationHelper createHelper = workbook.getCreationHelper();
			CellStyle dateStyle = workbook.createCellStyle();
			dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));

			int startRow = 4;

			if (!nostroList.isEmpty()) {
				for (int i = 0; i < nostroList.size(); i++) {
					Object[] data = nostroList.get(i);
					Row row = sheet.getRow(startRow + i);
					if (row == null)
						row = sheet.createRow(startRow + i);

					// 0 - DATA_DATE
					Cell cell0 = row.getCell(0);
					if (cell0 == null)
						cell0 = row.createCell(0);
					if (data[0] instanceof Date) {
						cell0.setCellValue((Date) data[0]);
						cell0.setCellStyle(dateStyle);
					} else {
						cell0.setCellValue("");
					}

					// 1 - BANK_NAME
					Cell cell1 = row.getCell(1);
					if (cell1 == null)
						cell1 = row.createCell(1);
					cell1.setCellValue(data[1] == null ? "" : data[1].toString());

					// 2 - HEAD_OFFICE_SUBSIDIARY
					Cell cell2 = row.getCell(2);
					if (cell2 == null)
						cell2 = row.createCell(2);
					cell2.setCellValue(data[2] == null ? "" : data[2].toString());

					// 3 - SUBSIDIARY
					Cell cell3 = row.getCell(3);
					if (cell3 == null)
						cell3 = row.createCell(3);
					cell3.setCellValue(data[3] == null ? "" : data[3].toString());

					// 4 - BANK_SYMBOL
					Cell cell4 = row.getCell(4);
					if (cell4 == null)
						cell4 = row.createCell(4);
					cell4.setCellValue(data[4] == null ? "" : data[4].toString());

					// 5 - CONVENTIONAL_ISLAMIC
					Cell cell5 = row.getCell(5);
					if (cell5 == null)
						cell5 = row.createCell(5);
					cell5.setCellValue(data[5] == null ? "" : data[5].toString());

					// 6 - LOCAL_FOREIGN
					Cell cell6 = row.getCell(6);
					if (cell6 == null)
						cell6 = row.createCell(6);
					cell6.setCellValue(data[6] == null ? "" : data[6].toString());

					// 7 - CBUAE_TIERING
					Cell cell7 = row.getCell(7);
					if (cell7 == null)
						cell7 = row.createCell(7);
					cell7.setCellValue(data[7] == null ? "" : data[7].toString());

					// 8 - COUNTERPARTY_NOSTRO_ACCOUNT
					Cell cell8 = row.getCell(8);
					if (cell8 == null)
						cell8 = row.createCell(8);
					cell8.setCellValue(data[8] == null ? "" : data[8].toString());

					// 9 - FINAL_RATING_BANKS
					Cell cell9 = row.getCell(9);
					if (cell9 == null)
						cell9 = row.createCell(9);
					cell9.setCellValue(data[9] == null ? "" : data[9].toString());

					// 10 - FINAL_RATING_CBUAE
					Cell cell10 = row.getCell(10);
					if (cell10 == null)
						cell10 = row.createCell(10);
					cell10.setCellValue(data[10] == null ? "" : data[10].toString());

					// 11 - COUNTRY_OF_RISK
					Cell cell11 = row.getCell(11);
					if (cell11 == null)
						cell11 = row.createCell(11);
					cell11.setCellValue(data[11] == null ? "" : data[11].toString());

					// 12 - CBUAE_GEOGRAPHICAL_ZONE
					Cell cell12 = row.getCell(12);
					if (cell12 == null)
						cell12 = row.createCell(12);
					cell12.setCellValue(data[12] == null ? "" : data[12].toString());

					// 13 - CURRENCY
					Cell cell13 = row.getCell(13);
					if (cell13 == null)
						cell13 = row.createCell(13);
					cell13.setCellValue(data[13] == null ? "" : data[13].toString());

					// 14 - COUNTERPARTY_SETTLEMENT_DATE
					Cell cell14 = row.getCell(14);
					if (cell14 == null)
						cell14 = row.createCell(14);
					if (data[14] instanceof Date) {
						cell14.setCellValue((Date) data[14]);
						cell14.setCellStyle(dateStyle);
					} else {
						cell14.setCellValue("");
					}

					// 15 - COUNTERPARTY_BALANCE
					Cell cell15 = row.getCell(15);
					if (cell15 == null)
						cell15 = row.createCell(15);
					cell15.setCellValue(data[15] instanceof BigDecimal ? ((BigDecimal) data[15]).doubleValue() : 0);

					// 16 - COUNTERPARTY_BALANCE_AED
					Cell cell16 = row.getCell(16);
					if (cell16 == null)
						cell16 = row.createCell(16);
					cell16.setCellValue(data[16] instanceof BigDecimal ? ((BigDecimal) data[16]).doubleValue() : 0);

					// 17 - BANK_INTERNAL_SETTLEMENT_DATE
					Cell cell17 = row.getCell(17);
					if (cell17 == null)
						cell17 = row.createCell(17);
					if (data[17] instanceof Date) {
						cell17.setCellValue((Date) data[17]);
						cell17.setCellStyle(dateStyle);
					} else {
						cell17.setCellValue("");
					}

					// 18 - BANK_BALANCE
					Cell cell18 = row.getCell(18);
					if (cell18 == null)
						cell18 = row.createCell(18);
					cell18.setCellValue(data[18] instanceof BigDecimal ? ((BigDecimal) data[18]).doubleValue() : 0);

					// 19 - BANK_BALANCE_AED
					Cell cell19 = row.getCell(19);
					if (cell19 == null)
						cell19 = row.createCell(19);
					cell19.setCellValue(data[19] instanceof BigDecimal ? ((BigDecimal) data[19]).doubleValue() : 0);

					// 20 - ACCOUNT_NO
					Cell cell20 = row.getCell(20);
					if (cell20 == null)
						cell20 = row.createCell(20);
					cell20.setCellValue(data[20] == null ? "" : data[20].toString());

					// 21 - GAP
					Cell cell21 = row.getCell(21);
					if (cell21 == null)
						cell21 = row.createCell(21);
					cell21.setCellValue(data[21] instanceof BigDecimal ? ((BigDecimal) data[21]).doubleValue() : 0);
				}

				workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();

				outputFile = new File(env.getProperty("output.exportpathfinal") + "NostroAccBalance.xls");
				try (FileOutputStream fos = new FileOutputStream(outputFile)) {
					workbook.write(fos);
					System.out.println("Nostro Excel generated: " + outputFile.getAbsolutePath());
				}
				workbook.close();
			} else {
				System.out.println("codeNo Nostro Account Balance data found.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return outputFile;
	}
}
