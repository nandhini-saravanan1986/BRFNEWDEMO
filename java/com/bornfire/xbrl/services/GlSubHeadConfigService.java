package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.Clob;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.persistence.Query;
import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.xbrl.config.CompressFiles;
import com.bornfire.xbrl.entities.BRSS.BRBS_CONTACT_DETAILS_ENTITY;
import com.bornfire.xbrl.entities.glsubhead.GlSubHeadMeta;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
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
public class GlSubHeadConfigService {
	
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
	
	private static final Logger logger = LoggerFactory.getLogger(GlSubHeadConfigService.class);
	
	public ModelAndView getGlSubHeadMeta(Pageable pageable) {
		
		logger.info("GlSubHeadConfigService -> getGlSubHeadMeta()");
		ModelAndView mv = new ModelAndView();

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;
		
		Session hs = sessionFactory.getCurrentSession();
		
		List<GlSubHeadMeta> glSubHeadList = hs.createQuery("from GlSubHeadMeta WHERE schm_type is not null ").getResultList();
		
		logger.info("after the query");
		
		List<GlSubHeadMeta> pagedlist;
		
		if (glSubHeadList.size() < startItem) {
			pagedlist = Collections.emptyList();
		} else {
			int toIndex = Math.min(startItem + pageSize, glSubHeadList.size());
			pagedlist = glSubHeadList.subList(startItem, toIndex);
		}
		
		Page<GlSubHeadMeta> glSubHeadPage = new PageImpl<GlSubHeadMeta>(pagedlist, PageRequest.of(currentPage, pageSize),
				glSubHeadList.size());
		
		 int totalPages = glSubHeadPage.getTotalPages();
	        if (totalPages > 0) {
	            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
	                .boxed()
	                .collect(Collectors.toList());
	            mv.addObject("pageNumbers", pageNumbers);
	        }
	       
	    logger.info("after pagenation");   
	     
		mv.setViewName("XBRLGlSubHeadConfig");
		mv.addObject("glsubhead", glSubHeadPage);
		mv.addObject("singledetail", new GlSubHeadMeta());
		
		logger.info("returning mv");
		return mv;
	}
	
	public ModelAndView getGlSubHead(GlSubHeadMeta glSubHeadMeta,Pageable pageable) {
		
		ModelAndView mv = new ModelAndView();

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;
		
		


		Session hs = sessionFactory.getCurrentSession();
		List<GlSubHeadMeta> glSubHeadList = new ArrayList<GlSubHeadMeta>();

		GlSubHeadMeta gl;

	
		gl = hs.find(GlSubHeadMeta.class, glSubHeadMeta.getGlSubHeadMetaId());
		

		if (gl == null) {

			mv.addObject("searchmsg", "No data found");

		}

		glSubHeadList.add(gl);
		System.out.println(glSubHeadList.toString());
		
		
		
logger.info("after the query");
		
		List<GlSubHeadMeta> pagedlist;
		
		if (glSubHeadList.size() < startItem) {
			pagedlist = Collections.emptyList();
		} else {
			int toIndex = Math.min(startItem + pageSize, glSubHeadList.size());
			pagedlist = glSubHeadList.subList(startItem, toIndex);
		}
		
		
		
		Page<GlSubHeadMeta> glSubHeadPage = new PageImpl<GlSubHeadMeta>(pagedlist, PageRequest.of(currentPage, pageSize),
				glSubHeadList.size());
		
		
	    logger.info("after pagenation");	
		mv.setViewName("XBRLGlSubHeadConfig");
		mv.addObject("glsubhead", glSubHeadPage);
		mv.addObject("singledetail", new GlSubHeadMeta());
	
		
		logger.info("returning mv");

		return mv;

	}
	
	public String detailChanges(GlSubHeadMeta detail, Character changeType, String userid) {

		String msg = "";

		try {
			
			Session hs = sessionFactory.getCurrentSession();

			if (changeType.equals('A')) {
				
				
				hs.saveOrUpdate(detail);
				
				logger.info("Added Record");
				msg = "Added Successfully";
			} else if (changeType.equals('E')) {
				
				
				
				hs.saveOrUpdate(detail);
				logger.info("Edited Record");
				msg = "Edited Successfully";
				
			} else if (changeType.equals('D')) {
				
				
				hs.remove(detail);
				logger.info("Deleted Record");
				msg = "Deleted Successfully";
			}

		} catch (Exception e) {

			msg = "error occured. Please contact Administrator";
			e.printStackTrace();
		}

		return msg;
	}
	
	public File getFile(String filetype)
			throws FileNotFoundException, JRException, SQLException {

		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

		String path = exportpath;
		String fileName = "";
		String zipFileName = "";
		File outputFile;

		logger.info("Getting Output file for glsubheadconfig");

	
			fileName = "GlSubHeadConfig";

		

		zipFileName = path + "/" + fileName + ".zip";

		if (!filetype.equals("xbrl")) {

			try {

				
				File jasperFile = null;
				HashMap<String, Object> map = new HashMap<String, Object>();
				
		//		System.out.println(new File("classpath:static/jasper/MISReports/TotalDeposits/TotalDeposits.jasper").getAbsolutePath());

				if (filetype.equals("detailexcel")) {
					jasperFile = ResourceUtils.getFile("classpath:static/jasper/GlSubHead/GlSubHead.jasper");

				} else {
					jasperFile = ResourceUtils.getFile("classpath:static/jasper/GlSubHead/GlSubHead.jasper");

				}

				JasperReport jr = (JasperReport) JRLoader.loadObject(jasperFile);

				logger.info("Assigning Parameters for Jasper");
				
				

				File folders = new File(path);
				if (!folders.exists()) {
					folders.mkdirs();
				}

				if (filetype.equals("pdf")) {
					fileName = fileName + ".pdf";
					path = path + "/" + fileName;
					JasperPrint jp = JasperFillManager.fillReport(jr, map, srcdataSource.getConnection());
					JasperExportManager.exportReportToPdfFile(jp, path);
					logger.info("PDF File exported");
				} else {
					fileName = fileName + ".xlsx";
					path = path + "/" + fileName;
					JasperPrint jp = JasperFillManager.fillReport(jr, map, srcdataSource.getConnection());
					JRXlsxExporter exporter = new JRXlsxExporter();
					exporter.setExporterInput(new SimpleExporterInput(jp));
					exporter.setExporterOutput(new SimpleOutputStreamExporterOutput(path));
					exporter.exportReport();
					logger.info("Excel File exported");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		} else {

			Session hs = sessionFactory.getCurrentSession();
			try {

				fileName = fileName + ".xml";
				path = path + "/" + fileName;

				Query qr = hs.createNativeQuery(
						"SELECT a.xbrl_rpt.getClobVal() as xbrl FROM PSC0300_XBRL_OUTPUT a where a.report_date=?1");

				
				logger.info("Getting XBRL File");
				Clob clob = (Clob) qr.getSingleResult();

				Reader reader = clob.getCharacterStream();
				FileWriter fileWriter = new FileWriter(path);
				int i;
				while ((i = reader.read()) != -1) {
					fileWriter.write((char) i);
				}
				fileWriter.close();
				reader.close();
			} catch (Exception e) {
				e.printStackTrace();

			}

		}

		if (filetype.equals("xbrl")) {
			logger.info("Compressing XBRL File");
			CompressFiles.zipSingleFile(new File(path), zipFileName);
			outputFile = new File(zipFileName);
		} else {
			outputFile = new File(path);
		}

		return outputFile;

	}
	
public ModelAndView RBSCONTACTLIST(Pageable pageable) {
		
		logger.info("GlSubHeadConfigService -> getGlSubHeadMeta()");
		ModelAndView mv = new ModelAndView();

		int pageSize = pageable.getPageSize();
		int currentPage = pageable.getPageNumber();
		int startItem = currentPage * pageSize;
		
		Session hs = sessionFactory.getCurrentSession();
		
		List<BRBS_CONTACT_DETAILS_ENTITY> glSubHeadList = hs.createQuery("from BRBS_CONTACT_DETAILS_ENTITY ").getResultList();
		
		logger.info("after the query");
		
		List<BRBS_CONTACT_DETAILS_ENTITY> pagedlist;
		
		if (glSubHeadList.size() < startItem) {
			pagedlist = Collections.emptyList();
		} else {
			int toIndex = Math.min(startItem + pageSize, glSubHeadList.size());
			pagedlist = glSubHeadList.subList(startItem, toIndex);
		}
		
		Page<BRBS_CONTACT_DETAILS_ENTITY> glSubHeadPage = new PageImpl<BRBS_CONTACT_DETAILS_ENTITY>(pagedlist, PageRequest.of(currentPage, pageSize),
				glSubHeadList.size());
		
		 int totalPages = glSubHeadPage.getTotalPages();
	        if (totalPages > 0) {
	            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
	                .boxed()
	                .collect(Collectors.toList());
	            mv.addObject("pageNumbers", pageNumbers);
	        }
	       
	    logger.info("after pagenation");   
	     
		mv.setViewName("RBSCONTACT");
		mv.addObject("ContactInfo", glSubHeadPage);
		mv.addObject("singledetail", new BRBS_CONTACT_DETAILS_ENTITY());
		
		logger.info("returning mv");
		return mv;
	}
public String RBSdetailChanges(BRBS_CONTACT_DETAILS_ENTITY detail, Character changeType, String userid) {

	String msg = "";

	try {
		
		Session hs = sessionFactory.getCurrentSession();

		if (changeType.equals('A')) {
			
			
			hs.saveOrUpdate(detail);
			
			logger.info("Added Record");
			msg = "Added Successfully";
		} else if (changeType.equals('E')) {
			
			
			
			hs.saveOrUpdate(detail);
			logger.info("Edited Record");
			msg = "Edited Successfully";
			
		} else if (changeType.equals('D')) {
			
			
			hs.remove(detail);
			logger.info("Deleted Record");
			msg = "Deleted Successfully";
		}

	} catch (Exception e) {

		msg = "error occured. Please contact Administrator";
		e.printStackTrace();
	}

	return msg;
}
}
