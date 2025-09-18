package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.sql.DataSource;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import com.bornfire.xbrl.entities.ReportCodeMap;
import com.bornfire.xbrl.entities.XBRLRRCMapTb;
import com.monitorjbl.xlsx.StreamingReader;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.ooxml.JRXlsxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

@Service
@Transactional
@ConfigurationProperties("output")
public class ReportCodeMappingService {

	private static final Logger logger = LoggerFactory.getLogger(ReferenceCodeConfigure.class);

	ReportCodeMap reportCodeMap;

	@Autowired
	SessionFactory sessionFactory;
	
	@NotNull
	private String exportpath;
	
	@Autowired
	DataSource srcdataSource;
	
	public String getExportpath() {
		return exportpath;
	}

	public void setExportpath(String exportpath) {
		this.exportpath = exportpath;
	}

	public Page<ReportCodeMap> getRepCodeMapLists(Pageable pageable) {

		logger.info("ReportCodeMapping--->>>getRepCodeMapLists()");

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		Session hs = sessionFactory.getCurrentSession();
		List<ReportCodeMap> repCodeList = new ArrayList<>();
		Query qr = hs.createNativeQuery("SELECT CUST_ID, " + "ACCT_NO," + "SCH_TYPE," + "SCH_CODE," + "GLSL_CODE, "
				+ "nvl2(BLS0100_S1,'BLS0100_S1,',null)||nvl2(BLS0100_S2,'BLS0100_S2,',null)||nvl2(BLS0100_S3,'BLS0100_S3,',null)||nvl2(BLS0100_S4,'BLS0100_S4,',null)||nvl2(BLS0110,',BLS0110',null)||nvl2(BLS0106,'BLS0106'||BLS0106,null) AS MAPPED_REPSFROM FROM XBRL_RRC_MAP_TABLE "
				+ " order by SCH_TYPE");

		qr.setFirstResult(0);
		qr.setMaxResults(300);
		List<Object[]> result = qr.getResultList();
		logger.info("returning getRepCodeMapLists()");
		logger.info("Size of ReportMaplist :" + result.size());
		for (Object[] a : result) {

			String cust_id = (String) a[0];
			String acct_no = (String) a[1];
			String sch_type = (String) a[2];
			String sch_code = (String) a[3];
			String glsl_code = (String) a[4];
			String mapped = (String) a[5];

			repCodeList.add(new ReportCodeMap(cust_id, acct_no, sch_type, sch_code, glsl_code, mapped));
		}

		List<ReportCodeMap> pagedlist;

		if (repCodeList.size() < startItem) {
			pagedlist = Collections.emptyList();
		} else {
			int toIndex = Math.min(startItem + pageSize, repCodeList.size());
			pagedlist = repCodeList.subList(startItem, toIndex);
		}

		logger.info("Converting to Page");
		Page<ReportCodeMap> repcodeDtlPage = new PageImpl<ReportCodeMap>(pagedlist,
				PageRequest.of(currentPage, pageSize), repCodeList.size());

		return repcodeDtlPage;

	}

	
	public List<ReportCodeMap> getRepCodeMapLists() {

		logger.info("ReportCodeMapping--->>>getRepCodeMapLists()");

		Session hs = sessionFactory.getCurrentSession();
		List<ReportCodeMap> repCodeList = new ArrayList<>();
		Query qr = hs.createNativeQuery("SELECT CUST_ID, " + "ACCT_NO," + "SCH_TYPE," + "SCH_CODE," + "GLSL_CODE, "
				+ "nvl2(BLS0100_S1,'BLS0100_S1,',null)||nvl2(BLS0100_S2,'BLS0100_S2,',null)||nvl2(BLS0100_S3,'BLS0100_S3,',null)||nvl2(BLS0100_S4,'BLS0100_S4,',null)||nvl2(BLS0110,',BLS0110',null)||nvl2(BLS0106,'BLS0106'||BLS0106,null) AS MAPPED_REPSFROM FROM XBRL_RRC_MAP_TABLE "
				+ " order by SCH_TYPE");

		qr.setFirstResult(0);
		qr.setMaxResults(300);
		List<Object[]> result = qr.getResultList();
		logger.info("returning getRepCodeMapLists()");
		logger.info("Size of ReportMaplist :" + result.size());
		for (Object[] a : result) {

			String cust_id = (String) a[0];
			String acct_no = (String) a[1];
			String sch_type = (String) a[2];
			String sch_code = (String) a[3];
			String glsl_code = (String) a[4];
			String mapped = (String) a[5];

			repCodeList.add(new ReportCodeMap(cust_id, acct_no, sch_type, sch_code, glsl_code, mapped));
		}

		return repCodeList;

	}

	
	public Page<ReportCodeMap> getSearchResult(String acctnum, Pageable pageable) {

		logger.info("ReportCodeMapping--->>>getRepCodeMapLists()");

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;

		Session hs = sessionFactory.getCurrentSession();
		List<ReportCodeMap> repCodeList = new ArrayList<>();
		Query qr = hs.createNativeQuery("SELECT CUST_ID, " + "ACCT_NO," + "SCH_TYPE," + "SCH_CODE," + "GLSL_CODE, "
				+ "nvl2(BLS0100_S1,'BLS0100_S1,',null)||nvl2(BLS0100_S2,'BLS0100_S2,',null)||nvl2(BLS0100_S3,'BLS0100_S3,',null)||nvl2(BLS0100_S4,'BLS0100_S4,',null)||nvl2(BLS0110,',BLS0110',null)||nvl2(BLS0106,'BLS0106'||BLS0106,null) AS MAPPED_REPSFROM FROM XBRL_RRC_MAP_TABLE "
				+ "where ACCT_NO = ?1 order by SCH_TYPE").setString(1, acctnum);

		qr.setFirstResult(0);
		qr.setMaxResults(300);
		List<Object[]> result = qr.getResultList();
		logger.info("returning getRepCodeMapLists()");
		logger.info("Size of ReportMaplist :" + result.size());
		for (Object[] a : result) {

			String cust_id = (String) a[0];
			String acct_no = (String) a[1];
			String sch_type = (String) a[2];
			String sch_code = (String) a[3];
			String glsl_code = (String) a[4];
			String mapped = (String) a[5];

			repCodeList.add(new ReportCodeMap(cust_id, acct_no, sch_type, sch_code, glsl_code, mapped));
		}

		List<ReportCodeMap> pagedlist;

		if (repCodeList.size() < startItem) {
			pagedlist = Collections.emptyList();
		} else {
			int toIndex = Math.min(startItem + pageSize, repCodeList.size());
			pagedlist = repCodeList.subList(startItem, toIndex);
		}

		logger.info("Converting to Page");
		Page<ReportCodeMap> repcodeDtlPage = new PageImpl<ReportCodeMap>(pagedlist,
				PageRequest.of(currentPage, pageSize), repCodeList.size());

		return repcodeDtlPage;

	}

	public File getDownloadFile(String function) {
		
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		String path = exportpath;
		String fileName = "REPORT_CODE_MAINTENANCE"+dateFormat.format(new Date())+".xlsx";
		File outputFile;

		File jasperFile;
		
		File folders = new File(path);
		if (!folders.exists()) {
			folders.mkdirs();
		}
		
		try {
			
			if(function == "mapped") {
				jasperFile = ResourceUtils.getFile("classpath:static/jasper/ReportCodeMaintenance/ReportCodeMaintenance_mapped.jasper");
				JasperReport jr = (JasperReport) JRLoader.loadObject(jasperFile);
				HashMap<String, Object> map = new HashMap<String, Object>();

				path = path + "/" + fileName;
				JasperPrint jp = JasperFillManager.fillReport(jr, map, srcdataSource.getConnection());
				JRXlsxExporter exporter = new JRXlsxExporter();
				exporter.setExporterInput(new SimpleExporterInput(jp));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(path));
				exporter.exportReport();
				logger.info("Excel File exported");
				
			}else if(function == "unmapped") {
				
				jasperFile = ResourceUtils.getFile("classpath:static/jasper/ReportCodeMaintenance/ReportCodeMaintenance_unmapped.jasper");
				JasperReport jr = (JasperReport) JRLoader.loadObject(jasperFile);
				HashMap<String, Object> map = new HashMap<String, Object>();

				
				path = path + "/" + fileName;
				JasperPrint jp = JasperFillManager.fillReport(jr, map, srcdataSource.getConnection());
				JRXlsxExporter exporter = new JRXlsxExporter();
				exporter.setExporterInput(new SimpleExporterInput(jp));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(path));
				exporter.exportReport();
				logger.info("Excel File exported");
				
			}else {
				
				jasperFile = ResourceUtils.getFile("classpath:static/jasper/ReportCodeMaintenance/ReportCodeMaintenance.jasper");
				JasperReport jr = (JasperReport) JRLoader.loadObject(jasperFile);
				HashMap<String, Object> map = new HashMap<String, Object>();

				path = path + "/" + fileName;
				JasperPrint jp = JasperFillManager.fillReport(jr, map, srcdataSource.getConnection());
				JRXlsxExporter exporter = new JRXlsxExporter();
				exporter.setExporterInput(new SimpleExporterInput(jp));
				exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(path));
				exporter.exportReport();
				logger.info("Excel File exported");
			}
			
			
		} catch (FileNotFoundException|JRException|SQLException e) {
			
			e.printStackTrace();
		}


		outputFile = new File(path);	

		
	return outputFile;
	}

	
	
	public String processUploadFiles(MultipartFile file, String userid)
			throws SQLException, FileNotFoundException, IOException {

		String fileName = file.getOriginalFilename();
		File convertedFile = multipartToFile(file, fileName);

		String fileExt = "";

		int i = fileName.lastIndexOf('.');
		if (i > 0) {
			fileExt = fileName.substring(i + 1);
		}

		logger.info("fileExt: " + fileExt);

		String Errormsg = "";

		String status = "";

		Session theSession = sessionFactory.getCurrentSession();

		if (fileExt.equals("xlsx") || fileExt.equals("xls")) {
			
			logger.info("reading values from Excel");

			String cellval = "";

			try (InputStream is = new FileInputStream(convertedFile);

					Workbook workbook = StreamingReader.builder().rowCacheSize(100).bufferSize(4096).open(is)) {

				for (Sheet s : workbook) {

					logger.info("inside workbook");

					for (Row r : s) {
						ArrayList<String> resultList = new ArrayList<>();
						if (r.getRowNum() == 0) {

							continue;

						}

						cellval = "";
						String val = null;
						for (int j = 0; j < 11; j++) {
							Cell cell = r.getCell(j);
							if (cell == null || cell.getStringCellValue().length() == 0) {
								val = null;
							} else {
								val = cell.getStringCellValue();
							}
							resultList.add(val);

						}
						
						String cust_id =  resultList.get(0);
						String acct_no =  resultList.get(1);
						String sch_type =  resultList.get(2);
						String sch_code =  resultList.get(3);
						String glsl_code =  resultList.get(4);
						String bls0100_s1 =  resultList.get(5);
						String bls0100_s2 =  resultList.get(6);
						String bls0100_s3 =  resultList.get(7);
						String bls0100_s4 =  resultList.get(8);
						String bls0110 =  resultList.get(9);
						
						if(acct_no==null) {
							break;
						}
						
						System.out.println(acct_no);
						
						
						
						XBRLRRCMapTb rrc = new XBRLRRCMapTb(cust_id, acct_no, sch_type, sch_code, glsl_code, 
								userid, new Date(), userid, new Date(), bls0100_s1, bls0100_s2, 
								bls0100_s3, bls0100_s4, bls0110);
						
						theSession.saveOrUpdate(rrc);
						theSession.flush();
						theSession.clear();
					}

					logger.info("inserted values into XBRL_RRC_MAP_TABLE");
				}

				status = "success";
			} catch (Exception e) {
				e.printStackTrace();
				status = "failed";
			}
		} else {
			
			logger.info("Invalid file format");
		}

		
		return status;

	}
	
	public static File multipartToFile(MultipartFile multipart, String fileName)
			throws IllegalStateException, IOException {
		File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + fileName);
		multipart.transferTo(convFile);
		return convFile;
	}

}
