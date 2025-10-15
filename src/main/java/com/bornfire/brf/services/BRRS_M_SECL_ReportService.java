
package com.bornfire.brf.services;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity1;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity2;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity3;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Entity4;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo1;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo2;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo3;
import com.bornfire.brf.entities.BRRS_M_AIDP_Summary_Repo4;
import com.bornfire.brf.entities.BRRS_M_SECL_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SECL_Resub_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SECL_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Archival_Summary_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Detail_Repo;
import com.bornfire.brf.entities.BRRS_M_SFINP2_Summary_Repo;
import com.bornfire.brf.entities.M_LA3_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_LA3_Summary_Entity;
import com.bornfire.brf.entities.M_SECL_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_SECL_Resub_Summary_Entity;
import com.bornfire.brf.entities.M_SECL_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Archival_Summary_Entity;
import com.bornfire.brf.entities.M_SFINP2_Detail_Entity;
import com.bornfire.brf.entities.M_SFINP2_Summary_Entity;
import java.lang.reflect.Method;


@Component
@Service
public class BRRS_M_SECL_ReportService {


	private static final Logger logger = LoggerFactory.getLogger(BRRS_M_SECL_ReportService.class);

	@Autowired
	private Environment env;

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	AuditService auditService;
	
	@Autowired
	BRRS_M_SFINP2_Detail_Repo M_SFINP2_DETAIL_Repo;

	@Autowired
	BRRS_M_AIDP_Summary_Repo1	BRRS_M_aidpRepo1;
				
	@Autowired
	BRRS_M_AIDP_Summary_Repo2	BRRS_M_aidpRepo2;
	@Autowired
	BRRS_M_AIDP_Summary_Repo3	BRRS_M_aidpRepo3;
	@Autowired
	BRRS_M_AIDP_Summary_Repo4	BRRS_M_aidpRepo4;
	
	@Autowired
	BRRS_M_SECL_Summary_Repo	BRRS_M_SECL_Summary_Repo;
	
	@Autowired
	BRRS_M_SFINP2_Summary_Repo M_SFINP2_Summary_Repo;
	
	@Autowired
	BRRS_M_SECL_Archival_Summary_Repo M_SECL_Archival_Summary_Repo;
	
	@Autowired
	BRRS_M_SECL_Resub_Summary_Repo M_SECL_Resub_Summary_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Detail_Repo M_SFINP2_Archival_Detail_Repo;

	@Autowired
	BRRS_M_SFINP2_Archival_Summary_Repo M_SFINP2_Archival_Summary_Repo;

SimpleDateFormat dateformat = new SimpleDateFormat("dd-MMM-yyyy");
	
public ModelAndView getM_SECLView(String reportId, String fromdate, String todate, String currency, String dtltype, Pageable pageable, 
        String type, String version) {

ModelAndView mv = new ModelAndView();
Session hs = sessionFactory.getCurrentSession();

int pageSize = pageable.getPageSize();
int currentPage = pageable.getPageNumber();
int startItem = currentPage * pageSize;

try {
Date d1 = dateformat.parse(todate);

// ---------- CASE 1: ARCHIVAL ----------
if ("ARCHIVAL".equalsIgnoreCase(type) && version != null) {
List<M_SECL_Archival_Summary_Entity> T1Master = 
M_SECL_Archival_Summary_Repo.getdatabydateListarchival(d1, version);

mv.addObject("reportsummary", T1Master);
}

// ---------- CASE 2: RESUB ----------
else if ("RESUB".equalsIgnoreCase(type) && version != null) {
List<M_SECL_Resub_Summary_Entity> T1Master =
M_SECL_Resub_Summary_Repo.getdatabydateListResub(d1, version);

mv.addObject("reportsummary", T1Master);
}

// ---------- CASE 3: NORMAL ----------
else {
List<M_SECL_Summary_Entity> T1Master = 
BRRS_M_SECL_Summary_Repo.getdatabydateList(d1);

mv.addObject("reportsummary", T1Master);
}

} catch (ParseException e) {
e.printStackTrace();
}

mv.setViewName("BRRS/M_SECL");
mv.addObject("displaymode", "summary");
System.out.println("View set to: " + mv.getViewName());
return mv;
}

public List<Object> getM_SECLResub() {
	List<Object> M_SECLResub = new ArrayList<>();
	try {
		M_SECLResub = M_SECL_Resub_Summary_Repo.getM_SECLResub();
		System.out.println("countser" + M_SECLResub.size());
	} catch (Exception e) {
		// Log the exception
		System.err.println("Error fetching M_SECL Archival data: " + e.getMessage());
		e.printStackTrace();

		// Optionally, you can rethrow it or return empty list
		// throw new RuntimeException("Failed to fetch data", e);
	}
	return M_SECLResub;
}


	
	public void updateReport(M_SECL_Summary_Entity updatedEntity) {
	    System.out.println("Came to services");
	    System.out.println("report_date: " + updatedEntity.getReport_date());

	    M_SECL_Summary_Entity existing = BRRS_M_SECL_Summary_Repo.findById(updatedEntity.getReport_date())
	            .orElseThrow(() -> new RuntimeException(
	                    "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));

	    try {
	        // Loop from R11 to R50 and copy fields
	        for (int i = 13; i <= 15; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());
	                    

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R17 to R30 and copy fields
	        for (int i = 17; i <= 30; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R32 to R33 and copy fields
	        for (int i = 32; i <= 33; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R35 to R36 and copy fields
	        for (int i = 35; i <= 36; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R38 to R41 and copy fields
	        for (int i = 38; i <= 41; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R43 to R45 and copy fields
	        for (int i = 43; i <= 45; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R47 to R49 and copy fields
	        for (int i = 47; i <= 49; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R51 to R56 and copy fields
	        for (int i = 51; i <= 56; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	            String[] totalFields = {
	                    "EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS",
	                    "PLEDGED_ASSETS", "TOTAL"
	            };

	            // Loop from R12 to R57 and copy fields
	            for (int i = 12; i <= 57; i++) {
	                String prefix = "R" + i + "_";

	                for (String field : totalFields) {
	                    String getterName = "get" + prefix + field;
	                    String setterName = "set" + prefix + field;

	                    try {
	                        Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                        Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                        Object newValue = getter.invoke(updatedEntity);
	                        setter.invoke(existing, newValue);
	                    } catch (NoSuchMethodException e) {
	                        // Skip if field does not exist for this row/field
	                        continue;
	                    }
	                }
	            }
	            
	    } catch (Exception e) {
	        throw new RuntimeException("Error while updating report fields", e);
	    }

	    // Save updated entity
	    System.out.println("abc");
	    BRRS_M_SECL_Summary_Repo.save(existing);
	}
	
	
	public void updateReportReSub(M_SECL_Resub_Summary_Entity updatedEntity) {
        System.out.println(" Came to Resub Service");
        System.out.println("Report Date: " + updatedEntity.getReport_date());

        // 1️⃣ Find existing record
        M_SECL_Resub_Summary_Entity existing =
                M_SECL_Resub_Summary_Repo.findById(updatedEntity.getReport_date())
                        .orElseThrow(() -> new RuntimeException(
                                "Record not found for REPORT_DATE: " + updatedEntity.getReport_date()));
        
        try {
	        // Loop from R11 to R50 and copy fields
	        for (int i = 13; i <= 15; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());
	                    

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R17 to R30 and copy fields
	        for (int i = 17; i <= 30; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R32 to R33 and copy fields
	        for (int i = 32; i <= 33; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R35 to R36 and copy fields
	        for (int i = 35; i <= 36; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R38 to R41 and copy fields
	        for (int i = 38; i <= 41; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R43 to R45 and copy fields
	        for (int i = 43; i <= 45; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R47 to R49 and copy fields
	        for (int i = 47; i <= 49; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	        // Loop from R51 to R56 and copy fields
	        for (int i = 51; i <= 56; i++) {
	            String prefix = "R" + i + "_";
	            String[] fields = {"EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS", "PLEDGED_ASSETS"};

	            for (String field : fields) {
	                String getterName = "get" + prefix + field;
	                String setterName = "set" + prefix + field;

	                try {
	                    Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                    Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                    Object newValue = getter.invoke(updatedEntity);
	                    setter.invoke(existing, newValue);
	                } catch (NoSuchMethodException e) {
	                    // Skip missing fields
	                    continue;
	                }
	            }
	        }

	            String[] totalFields = {
	                    "EQUITY", "BONDS", "BOBCS", "TREASURY_BILLS", "OTHER_SPECIFY",
	                    "REPURCHASE_AGREEMENTS", "COMMERCIAL_PAPER", "CERTIFICATES_OF_DEPOSITS",
	                    "PLEDGED_ASSETS", "TOTAL"
	            };

	            // Loop from R12 to R57 and copy fields
	            for (int i = 12; i <= 57; i++) {
	                String prefix = "R" + i + "_";

	                for (String field : totalFields) {
	                    String getterName = "get" + prefix + field;
	                    String setterName = "set" + prefix + field;

	                    try {
	                        Method getter = M_SECL_Summary_Entity.class.getMethod(getterName);
	                        Method setter = M_SECL_Summary_Entity.class.getMethod(setterName, getter.getReturnType());

	                        Object newValue = getter.invoke(updatedEntity);
	                        setter.invoke(existing, newValue);
	                    } catch (NoSuchMethodException e) {
	                        // Skip if field does not exist for this row/field
	                        continue;
	                    }
	                }
	            }
	            
        } catch (Exception e) {
            throw new RuntimeException("Error while updating report fields", e);
        }

        System.out.println("💾 Saving Updated Entity");
        M_SECL_Resub_Summary_Repo.save(existing);
    }








public byte[] getM_SECLExcel(String filename,String reportId, String fromdate, String todate, String currency, String dtltype , String type ,
		String version) throws Exception {
	logger.info("Service: Starting Excel generation process in memory.");

	List<M_SECL_Summary_Entity> dataList =BRRS_M_SECL_Summary_Repo.getdatabydateList(dateformat.parse(todate)) ;

	if (dataList.isEmpty()) {
		logger.warn("Service: No data found for BRRS report. Returning empty result.");
		return new byte[0];
	}
	String templateDir = env.getProperty("output.exportpathtemp");
	String templateFileName = filename;
	System.out.println(templateDir);
	System.out.println(filename);
	Path templatePath = Paths.get(templateDir, templateFileName);
	System.out.println(templatePath);
	
	logger.info("Service: Attempting to load template from path: {}", templatePath.toAbsolutePath());

	if (!Files.exists(templatePath)) {
		// This specific exception will be caught by the controller.
		throw new FileNotFoundException("Template file not found at: " + templatePath.toAbsolutePath());
	}
	if (!Files.isReadable(templatePath)) {
		// A specific exception for permission errors.
		throw new SecurityException(
				"Template file exists but is not readable (check permissions): " + templatePath.toAbsolutePath());
	}
	

	// This try-with-resources block is perfect. It guarantees all resources are
	// closed automatically.
	try (InputStream templateInputStream = Files.newInputStream(templatePath);
			Workbook workbook = WorkbookFactory.create(templateInputStream);
			ByteArrayOutputStream out = new ByteArrayOutputStream()) {

		Sheet sheet = workbook.getSheetAt(0);
		
		// --- Style Definitions ---
		CreationHelper createHelper = workbook.getCreationHelper();
		

		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
		dateStyle.setBorderBottom(BorderStyle.THIN);
		dateStyle.setBorderTop(BorderStyle.THIN);
		dateStyle.setBorderLeft(BorderStyle.THIN);
		dateStyle.setBorderRight(BorderStyle.THIN);

		CellStyle textStyle = workbook.createCellStyle();
		textStyle.setBorderBottom(BorderStyle.THIN);
		textStyle.setBorderTop(BorderStyle.THIN);
		textStyle.setBorderLeft(BorderStyle.THIN);
		textStyle.setBorderRight(BorderStyle.THIN);
		
		// Create the font
		Font font = workbook.createFont();
		font.setFontHeightInPoints((short)8); // size 8
		font.setFontName("Arial");    

		CellStyle numberStyle = workbook.createCellStyle();
		//numberStyle.setDataFormat(createHelper.createDataFormat().getFormat("0.000"));
		numberStyle.setBorderBottom(BorderStyle.THIN);
		numberStyle.setBorderTop(BorderStyle.THIN);
		numberStyle.setBorderLeft(BorderStyle.THIN);
		numberStyle.setBorderRight(BorderStyle.THIN);
		numberStyle.setFont(font);
		// --- End of Style Definitions ---
		
          int startRow = 12;
		
		if (!dataList.isEmpty()) {
			for (int i = 0; i < dataList.size(); i++) {
				M_SECL_Summary_Entity record = dataList.get(i);
				System.out.println("rownumber="+startRow + i);
				Row row = sheet.getRow(startRow + i);
				if (row == null) {
					row = sheet.createRow(startRow + i);
				}
				
				Cell cell1 = row.createCell(1);
				if (record.getR13_EQUITY() != null) {
					cell1.setCellValue(record.getR13_EQUITY().doubleValue());
					cell1.setCellStyle(numberStyle);
				} else {
					cell1.setCellValue("");
					cell1.setCellStyle(textStyle);
				}
				
				Cell cell2 = row.createCell(2);
				if (record.getR13_BONDS() != null) {
					cell2.setCellValue(record.getR13_BONDS().doubleValue());
					cell2.setCellStyle(numberStyle);
				} else {
					cell2.setCellValue("");
					cell2.setCellStyle(textStyle);
				}
				
				Cell cell3 = row.createCell(3);
				if (record.getR13_BOBCS() != null) {
					cell3.setCellValue(record.getR13_BOBCS().doubleValue());
					cell3.setCellStyle(numberStyle);
				} else {
					cell3.setCellValue("");
					cell3.setCellStyle(textStyle);
				}
				
				Cell cell4 = row.createCell(4);
				if (record.getR13_TREASURY_BILLS() != null) {
					cell4.setCellValue(record.getR13_TREASURY_BILLS().doubleValue());
					cell4.setCellStyle(numberStyle);
				} else {
					cell4.setCellValue("");
					cell4.setCellStyle(textStyle);
				}
				
				Cell cell5 = row.createCell(5);
				if (record.getR13_REPURCHASE_AGREEMENTS() != null) {
					cell5.setCellValue(record.getR13_REPURCHASE_AGREEMENTS().doubleValue());
					cell5.setCellStyle(numberStyle);
				} else {
					cell5.setCellValue("");
					cell5.setCellStyle(textStyle);
				}
				
				Cell cell6 = row.createCell(6);
				if (record.getR13_COMMERCIAL_PAPER() != null) {
					cell6.setCellValue(record.getR13_COMMERCIAL_PAPER().doubleValue());
					cell6.setCellStyle(numberStyle);
				} else {
					cell6.setCellValue("");
					cell6.setCellStyle(textStyle);
				}
				
				Cell cell7 = row.createCell(7);
				if (record.getR13_CERTIFICATES_OF_DEPOSITS() != null) {
					cell7.setCellValue(record.getR13_CERTIFICATES_OF_DEPOSITS().doubleValue());
					cell7.setCellStyle(numberStyle);
				} else {
					cell7.setCellValue("");
					cell7.setCellStyle(textStyle);
				}
				
				Cell cell8 = row.createCell(8);
				if (record.getR13_PLEDGED_ASSETS() != null) {
					cell8.setCellValue(record.getR13_PLEDGED_ASSETS().doubleValue());
					cell8.setCellStyle(numberStyle);
				} else {
					cell8.setCellValue("");
					cell8.setCellStyle(textStyle);
				}
				

				Cell cell9 = row.createCell(9);
				if (record.getR13_OTHER_SPECIFY() != null) {
					cell9.setCellValue(record.getR13_OTHER_SPECIFY().doubleValue());
					cell9.setCellStyle(numberStyle);
				} else {
					cell9.setCellValue("");
					cell9.setCellStyle(textStyle);
				}
				
				

				 row = sheet.getRow(13);
				 if (row == null) {
				     row = sheet.createRow(13);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR14_EQUITY() != null) {
				     cell1.setCellValue(record.getR14_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR14_BONDS() != null) {
				     cell2.setCellValue(record.getR14_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR14_BOBCS() != null) {
				     cell3.setCellValue(record.getR14_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR14_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR14_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR14_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR14_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR14_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR14_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR14_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR14_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR14_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR14_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR14_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR14_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(14);
				 if (row == null) {
				     row = sheet.createRow(14);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR15_EQUITY() != null) {
				     cell1.setCellValue(record.getR15_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR15_BONDS() != null) {
				     cell2.setCellValue(record.getR15_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR15_BOBCS() != null) {
				     cell3.setCellValue(record.getR15_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR15_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR15_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR15_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR15_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR15_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR15_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR15_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR15_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR15_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR15_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR15_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR15_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }


				 row = sheet.getRow(16);
				 if (row == null) {
				     row = sheet.createRow(16);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR17_EQUITY() != null) {
				     cell1.setCellValue(record.getR17_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR17_BONDS() != null) {
				     cell2.setCellValue(record.getR17_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR17_BOBCS() != null) {
				     cell3.setCellValue(record.getR17_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR17_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR17_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR17_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR17_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR17_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR17_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR17_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR17_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR17_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR17_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR17_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR17_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(17);
				 if (row == null) {
				     row = sheet.createRow(17);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR18_EQUITY() != null) {
				     cell1.setCellValue(record.getR18_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR18_BONDS() != null) {
				     cell2.setCellValue(record.getR18_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR18_BOBCS() != null) {
				     cell3.setCellValue(record.getR18_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR18_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR18_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR18_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR18_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR18_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR18_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR18_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR18_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR18_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR18_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR18_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR18_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(18);
				 if (row == null) {
				     row = sheet.createRow(18);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR19_EQUITY() != null) {
				     cell1.setCellValue(record.getR19_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR19_BONDS() != null) {
				     cell2.setCellValue(record.getR19_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR19_BOBCS() != null) {
				     cell3.setCellValue(record.getR19_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR19_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR19_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR19_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR19_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR19_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR19_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR19_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR19_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR19_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR19_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR19_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR19_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(19);
				 if (row == null) {
				     row = sheet.createRow(19);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR20_EQUITY() != null) {
				     cell1.setCellValue(record.getR20_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR20_BONDS() != null) {
				     cell2.setCellValue(record.getR20_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR20_BOBCS() != null) {
				     cell3.setCellValue(record.getR20_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR20_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR20_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR20_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR20_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR20_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR20_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR20_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR20_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR20_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR20_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR20_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR20_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(20);
				 if (row == null) {
				     row = sheet.createRow(20);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR21_EQUITY() != null) {
				     cell1.setCellValue(record.getR21_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR21_BONDS() != null) {
				     cell2.setCellValue(record.getR21_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR21_BOBCS() != null) {
				     cell3.setCellValue(record.getR21_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR21_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR21_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR21_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR21_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR21_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR21_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR21_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR21_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR21_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR21_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR21_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR21_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(21);
				 if (row == null) {
				     row = sheet.createRow(21);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR22_EQUITY() != null) {
				     cell1.setCellValue(record.getR22_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR22_BONDS() != null) {
				     cell2.setCellValue(record.getR22_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR22_BOBCS() != null) {
				     cell3.setCellValue(record.getR22_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR22_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR22_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR22_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR22_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR22_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR22_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR22_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR22_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR22_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR22_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR22_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR22_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(22);
				 if (row == null) {
				     row = sheet.createRow(22);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR23_EQUITY() != null) {
				     cell1.setCellValue(record.getR23_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR23_BONDS() != null) {
				     cell2.setCellValue(record.getR23_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR23_BOBCS() != null) {
				     cell3.setCellValue(record.getR23_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR23_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR23_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR23_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR23_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR23_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR23_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR23_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR23_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR23_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR23_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR23_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR23_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(23);
				 if (row == null) {
				     row = sheet.createRow(23);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR24_EQUITY() != null) {
				     cell1.setCellValue(record.getR24_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR24_BONDS() != null) {
				     cell2.setCellValue(record.getR24_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR24_BOBCS() != null) {
				     cell3.setCellValue(record.getR24_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR24_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR24_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR24_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR24_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR24_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR24_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR24_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR24_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR24_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR24_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR24_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR24_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(24);
				 if (row == null) {
				     row = sheet.createRow(24);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR25_EQUITY() != null) {
				     cell1.setCellValue(record.getR25_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR25_BONDS() != null) {
				     cell2.setCellValue(record.getR25_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR25_BOBCS() != null) {
				     cell3.setCellValue(record.getR25_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR25_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR25_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR25_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR25_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR25_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR25_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR25_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR25_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR25_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR25_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR25_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR25_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(25);
				 if (row == null) {
				     row = sheet.createRow(25);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR26_EQUITY() != null) {
				     cell1.setCellValue(record.getR26_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR26_BONDS() != null) {
				     cell2.setCellValue(record.getR26_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR26_BOBCS() != null) {
				     cell3.setCellValue(record.getR26_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR26_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR26_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR26_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR26_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR26_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR26_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR26_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR26_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR26_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR26_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR26_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR26_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(26);
				 if (row == null) {
				     row = sheet.createRow(26);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR27_EQUITY() != null) {
				     cell1.setCellValue(record.getR27_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR27_BONDS() != null) {
				     cell2.setCellValue(record.getR27_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR27_BOBCS() != null) {
				     cell3.setCellValue(record.getR27_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR27_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR27_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR27_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR27_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR27_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR27_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR27_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR27_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR27_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR27_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR27_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR27_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(27);
				 if (row == null) {
				     row = sheet.createRow(27);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR28_EQUITY() != null) {
				     cell1.setCellValue(record.getR28_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR28_BONDS() != null) {
				     cell2.setCellValue(record.getR28_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR28_BOBCS() != null) {
				     cell3.setCellValue(record.getR28_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR28_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR28_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR28_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR28_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR28_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR28_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR28_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR28_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR28_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR28_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR28_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR28_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(28);
				 if (row == null) {
				     row = sheet.createRow(28);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR29_EQUITY() != null) {
				     cell1.setCellValue(record.getR29_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR29_BONDS() != null) {
				     cell2.setCellValue(record.getR29_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR29_BOBCS() != null) {
				     cell3.setCellValue(record.getR29_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR29_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR29_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR29_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR29_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR29_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR29_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR29_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR29_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR29_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR29_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR29_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR29_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(29);
				 if (row == null) {
				     row = sheet.createRow(29);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR30_EQUITY() != null) {
				     cell1.setCellValue(record.getR30_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR30_BONDS() != null) {
				     cell2.setCellValue(record.getR30_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR30_BOBCS() != null) {
				     cell3.setCellValue(record.getR30_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR30_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR30_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR30_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR30_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR30_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR30_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR30_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR30_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR30_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR30_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR30_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR30_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }

				 
				 row = sheet.getRow(31);
				 if (row == null) {
				     row = sheet.createRow(31);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR32_EQUITY() != null) {
				     cell1.setCellValue(record.getR32_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR32_BONDS() != null) {
				     cell2.setCellValue(record.getR32_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR32_BOBCS() != null) {
				     cell3.setCellValue(record.getR32_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR32_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR32_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR32_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR32_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR32_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR32_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR32_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR32_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR32_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR32_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR32_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR32_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(32);
				 if (row == null) {
				     row = sheet.createRow(32);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR33_EQUITY() != null) {
				     cell1.setCellValue(record.getR33_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR33_BONDS() != null) {
				     cell2.setCellValue(record.getR33_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR33_BOBCS() != null) {
				     cell3.setCellValue(record.getR33_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR33_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR33_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR33_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR33_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR33_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR33_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR33_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR33_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR33_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR33_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR33_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR33_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



					 row = sheet.getRow(34);
				 if (row == null) {
				     row = sheet.createRow(34);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR35_EQUITY() != null) {
				     cell1.setCellValue(record.getR35_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR35_BONDS() != null) {
				     cell2.setCellValue(record.getR35_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR35_BOBCS() != null) {
				     cell3.setCellValue(record.getR35_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR35_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR35_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR35_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR35_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR35_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR35_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR35_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR35_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR35_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR35_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR35_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR35_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(35);
				 if (row == null) {
				     row = sheet.createRow(35);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR36_EQUITY() != null) {
				     cell1.setCellValue(record.getR36_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR36_BONDS() != null) {
				     cell2.setCellValue(record.getR36_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR36_BOBCS() != null) {
				     cell3.setCellValue(record.getR36_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR36_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR36_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR36_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR36_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR36_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR36_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR36_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR36_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR36_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR36_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR36_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR36_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(37);
				 if (row == null) {
				     row = sheet.createRow(37);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR38_EQUITY() != null) {
				     cell1.setCellValue(record.getR38_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR38_BONDS() != null) {
				     cell2.setCellValue(record.getR38_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR38_BOBCS() != null) {
				     cell3.setCellValue(record.getR38_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR38_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR38_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR38_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR38_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR38_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR38_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR38_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR38_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR38_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR38_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR38_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR38_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(38);
				 if (row == null) {
				     row = sheet.createRow(38);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR39_EQUITY() != null) {
				     cell1.setCellValue(record.getR39_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR39_BONDS() != null) {
				     cell2.setCellValue(record.getR39_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR39_BOBCS() != null) {
				     cell3.setCellValue(record.getR39_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR39_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR39_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR39_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR39_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR39_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR39_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR39_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR39_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR39_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR39_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR39_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR39_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(39);
				 if (row == null) {
				     row = sheet.createRow(39);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR40_EQUITY() != null) {
				     cell1.setCellValue(record.getR40_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR40_BONDS() != null) {
				     cell2.setCellValue(record.getR40_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR40_BOBCS() != null) {
				     cell3.setCellValue(record.getR40_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR40_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR40_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR40_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR40_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR40_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR40_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR40_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR40_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR40_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR40_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR40_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR40_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(40);
				 if (row == null) {
				     row = sheet.createRow(40);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR41_EQUITY() != null) {
				     cell1.setCellValue(record.getR41_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR41_BONDS() != null) {
				     cell2.setCellValue(record.getR41_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR41_BOBCS() != null) {
				     cell3.setCellValue(record.getR41_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR41_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR41_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR41_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR41_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR41_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR41_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR41_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR41_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR41_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR41_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR41_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR41_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(41);
				 if (row == null) {
				     row = sheet.createRow(41);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR42_EQUITY() != null) {
				     cell1.setCellValue(record.getR42_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR42_BONDS() != null) {
				     cell2.setCellValue(record.getR42_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR42_BOBCS() != null) {
				     cell3.setCellValue(record.getR42_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR42_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR42_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR42_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR42_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR42_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR42_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR42_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR42_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR42_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR42_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR42_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR42_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }




				 row = sheet.getRow(42);
				 if (row == null) {
				     row = sheet.createRow(42);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR43_EQUITY() != null) {
				     cell1.setCellValue(record.getR43_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR43_BONDS() != null) {
				     cell2.setCellValue(record.getR43_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR43_BOBCS() != null) {
				     cell3.setCellValue(record.getR43_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR43_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR43_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR43_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR43_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR43_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR43_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR43_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR43_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR43_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR43_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR43_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR43_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(43);
				 if (row == null) {
				     row = sheet.createRow(43);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR44_EQUITY() != null) {
				     cell1.setCellValue(record.getR44_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR44_BONDS() != null) {
				     cell2.setCellValue(record.getR44_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR44_BOBCS() != null) {
				     cell3.setCellValue(record.getR44_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR44_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR44_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR44_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR44_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR44_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR44_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR44_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR44_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR44_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR44_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR44_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR44_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(44);
				 if (row == null) {
				     row = sheet.createRow(44);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR45_EQUITY() != null) {
				     cell1.setCellValue(record.getR45_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR45_BONDS() != null) {
				     cell2.setCellValue(record.getR45_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR45_BOBCS() != null) {
				     cell3.setCellValue(record.getR45_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR45_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR45_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR45_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR45_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR45_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR45_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR45_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR45_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR45_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR45_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR45_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR45_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(45);
				 if (row == null) {
				     row = sheet.createRow(45);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR46_EQUITY() != null) {
				     cell1.setCellValue(record.getR46_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR46_BONDS() != null) {
				     cell2.setCellValue(record.getR46_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR46_BOBCS() != null) {
				     cell3.setCellValue(record.getR46_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR46_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR46_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR46_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR46_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR46_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR46_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR46_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR46_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR46_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR46_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR46_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR46_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }




				 row = sheet.getRow(46);
				 if (row == null) {
				     row = sheet.createRow(46);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR47_EQUITY() != null) {
				     cell1.setCellValue(record.getR47_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR47_BONDS() != null) {
				     cell2.setCellValue(record.getR47_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR47_BOBCS() != null) {
				     cell3.setCellValue(record.getR47_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR47_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR47_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR47_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR47_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR47_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR47_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR47_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR47_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR47_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR47_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR47_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR47_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(47);
				 if (row == null) {
				     row = sheet.createRow(47);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR48_EQUITY() != null) {
				     cell1.setCellValue(record.getR48_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR48_BONDS() != null) {
				     cell2.setCellValue(record.getR48_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR48_BOBCS() != null) {
				     cell3.setCellValue(record.getR48_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR48_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR48_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR48_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR48_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR48_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR48_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR48_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR48_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR48_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR48_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR48_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR48_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(48);
				 if (row == null) {
				     row = sheet.createRow(48);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR49_EQUITY() != null) {
				     cell1.setCellValue(record.getR49_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR49_BONDS() != null) {
				     cell2.setCellValue(record.getR49_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR49_BOBCS() != null) {
				     cell3.setCellValue(record.getR49_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR49_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR49_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR49_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR49_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR49_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR49_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR49_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR49_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR49_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR49_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR49_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR49_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }


				 row = sheet.getRow(49);
				 if (row == null) {
				     row = sheet.createRow(49);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR50_EQUITY() != null) {
				     cell1.setCellValue(record.getR50_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR50_BONDS() != null) {
				     cell2.setCellValue(record.getR50_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR50_BOBCS() != null) {
				     cell3.setCellValue(record.getR50_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR50_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR50_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR50_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR50_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR50_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR50_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR50_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR50_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR50_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR50_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR50_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR50_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }




				 row = sheet.getRow(50);
				 if (row == null) {
				     row = sheet.createRow(50);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR51_EQUITY() != null) {
				     cell1.setCellValue(record.getR51_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR51_BONDS() != null) {
				     cell2.setCellValue(record.getR51_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR51_BOBCS() != null) {
				     cell3.setCellValue(record.getR51_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR51_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR51_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR51_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR51_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR51_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR51_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR51_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR51_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR51_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR51_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR51_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR51_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(51);
				 if (row == null) {
				     row = sheet.createRow(51);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR52_EQUITY() != null) {
				     cell1.setCellValue(record.getR52_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR52_BONDS() != null) {
				     cell2.setCellValue(record.getR52_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR52_BOBCS() != null) {
				     cell3.setCellValue(record.getR52_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR52_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR52_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR52_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR52_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR52_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR52_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR52_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR52_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR52_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR52_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR52_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR52_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(52);
				 if (row == null) {
				     row = sheet.createRow(52);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR53_EQUITY() != null) {
				     cell1.setCellValue(record.getR53_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR53_BONDS() != null) {
				     cell2.setCellValue(record.getR53_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR53_BOBCS() != null) {
				     cell3.setCellValue(record.getR53_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR53_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR53_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR53_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR53_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR53_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR53_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR53_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR53_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR53_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR53_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR53_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR53_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(53);
				 if (row == null) {
				     row = sheet.createRow(53);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR54_EQUITY() != null) {
				     cell1.setCellValue(record.getR54_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR54_BONDS() != null) {
				     cell2.setCellValue(record.getR54_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR54_BOBCS() != null) {
				     cell3.setCellValue(record.getR54_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR54_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR54_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR54_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR54_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR54_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR54_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR54_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR54_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR54_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR54_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR54_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR54_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(54);
				 if (row == null) {
				     row = sheet.createRow(54);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR55_EQUITY() != null) {
				     cell1.setCellValue(record.getR55_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR55_BONDS() != null) {
				     cell2.setCellValue(record.getR55_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR55_BOBCS() != null) {
				     cell3.setCellValue(record.getR55_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR55_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR55_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR55_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR55_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR55_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR55_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR55_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR55_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR55_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR55_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR55_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR55_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }



				 row = sheet.getRow(55);
				 if (row == null) {
				     row = sheet.createRow(55);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR56_EQUITY() != null) {
				     cell1.setCellValue(record.getR56_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR56_BONDS() != null) {
				     cell2.setCellValue(record.getR56_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR56_BOBCS() != null) {
				     cell3.setCellValue(record.getR56_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR56_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR56_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR56_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR56_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR56_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR56_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR56_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR56_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR56_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR56_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR56_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR56_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }


				 row = sheet.getRow(56);
				 if (row == null) {
				     row = sheet.createRow(56);
				 }

				 cell1 = row.createCell(1);
				 if (record.getR57_EQUITY() != null) {
				     cell1.setCellValue(record.getR57_EQUITY().doubleValue());
				     cell1.setCellStyle(numberStyle);
				 } else {
				     cell1.setCellValue("");
				     cell1.setCellStyle(textStyle);
				 }

				 cell2 = row.createCell(2);
				 if (record.getR57_BONDS() != null) {
				     cell2.setCellValue(record.getR57_BONDS().doubleValue());
				     cell2.setCellStyle(numberStyle);
				 } else {
				     cell2.setCellValue("");
				     cell2.setCellStyle(textStyle);
				 }

				 cell3 = row.createCell(3);
				 if (record.getR57_BOBCS() != null) {
				     cell3.setCellValue(record.getR57_BOBCS().doubleValue());
				     cell3.setCellStyle(numberStyle);
				 } else {
				     cell3.setCellValue("");
				     cell3.setCellStyle(textStyle);
				 }

				 cell4 = row.createCell(4);
				 if (record.getR57_TREASURY_BILLS() != null) {
				     cell4.setCellValue(record.getR57_TREASURY_BILLS().doubleValue());
				     cell4.setCellStyle(numberStyle);
				 } else {
				     cell4.setCellValue("");
				     cell4.setCellStyle(textStyle);
				 }

				 cell5 = row.createCell(5);
				 if (record.getR57_REPURCHASE_AGREEMENTS() != null) {
				     cell5.setCellValue(record.getR57_REPURCHASE_AGREEMENTS().doubleValue());
				     cell5.setCellStyle(numberStyle);
				 } else {
				     cell5.setCellValue("");
				     cell5.setCellStyle(textStyle);
				 }

				 cell6 = row.createCell(6);
				 if (record.getR57_COMMERCIAL_PAPER() != null) {
				     cell6.setCellValue(record.getR57_COMMERCIAL_PAPER().doubleValue());
				     cell6.setCellStyle(numberStyle);
				 } else {
				     cell6.setCellValue("");
				     cell6.setCellStyle(textStyle);
				 }

				 cell7 = row.createCell(7);
				 if (record.getR57_CERTIFICATES_OF_DEPOSITS() != null) {
				     cell7.setCellValue(record.getR57_CERTIFICATES_OF_DEPOSITS().doubleValue());
				     cell7.setCellStyle(numberStyle);
				 } else {
				     cell7.setCellValue("");
				     cell7.setCellStyle(textStyle);
				 }

				 cell8 = row.createCell(8);
				 if (record.getR57_PLEDGED_ASSETS() != null) {
				     cell8.setCellValue(record.getR57_PLEDGED_ASSETS().doubleValue());
				     cell8.setCellStyle(numberStyle);
				 } else {
				     cell8.setCellValue("");
				     cell8.setCellStyle(textStyle);
				 }

				 cell9 = row.createCell(9);
				 if (record.getR57_OTHER_SPECIFY() != null) {
				     cell9.setCellValue(record.getR57_OTHER_SPECIFY().doubleValue());
				     cell9.setCellStyle(numberStyle);
				 } else {
				     cell9.setCellValue("");
				     cell9.setCellStyle(textStyle);
				 }
			}
			workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
		} else {
			
		}

		// Write the final workbook content to the in-memory stream.
		workbook.write(out);

		logger.info("Service: Excel data successfully written to memory buffer ({} bytes).", out.size());

		return out.toByteArray();
	}
}

public List<Object> getM_SECLArchival() {
	List<Object> M_SECLArchivallist = new ArrayList<>();
//	List<Object> M_FXRArchivallist2 = new ArrayList<>();
//	List<Object> M_FXRArchivallist3 = new ArrayList<>();
	try {
		M_SECLArchivallist = M_SECL_Archival_Summary_Repo.getM_SECLarchival();
		
		
		System.out.println("countser" + M_SECLArchivallist.size());
//		System.out.println("countser" + M_FXRArchivallist.size());
//		System.out.println("countser" + M_FXRArchivallist.size());
	} catch (Exception e) {
		// Log the exception
		System.err.println("Error fetching M_SECL Archival data: " + e.getMessage());
		e.printStackTrace();

		// Optionally, you can rethrow it or return empty list
		// throw new RuntimeException("Failed to fetch data", e);
	}
	return M_SECLArchivallist;
}


public byte[] getExcelM_SECLARCHIVAL(String filename, String reportId, String fromdate,
		String todate,
		String currency, String dtltype, String type, String version) throws Exception {
	logger.info("Service: Starting Excel generation process in memory.");
	if ("ARCHIVAL".equals(type) && version != null) {
	}
		List<M_SECL_Archival_Summary_Entity> dataList1 = M_SECL_Archival_Summary_Repo
				.getdatabydateListarchival(dateformat.parse(todate), version);
		
		
	
	if (dataList1.isEmpty()) {
		logger.warn("Service: No data found for M_FXR report. Returning empty result.");
		return new byte[0];
	}

	String templateDir = env.getProperty("output.exportpathtemp");
	String templateFileName = filename;
	System.out.println(filename);
	Path templatePath = Paths.get(templateDir, templateFileName);
	System.out.println(templatePath);

	logger.info("Service: Attempting to load template from path: {}", templatePath.toAbsolutePath());

	if (!Files.exists(templatePath)) {
		// This specific exception will be caught by the controller.
		throw new FileNotFoundException("Template file not found at: " + templatePath.toAbsolutePath());
	}
	if (!Files.isReadable(templatePath)) {
		// A specific exception for permission errors.
		throw new SecurityException(
				"Template file exists but is not readable (check permissions): " + templatePath.toAbsolutePath());
	}

	// This try-with-resources block is perfect. It guarantees all resources are
	// closed automatically.
	try (InputStream templateInputStream = Files.newInputStream(templatePath);
			Workbook workbook = WorkbookFactory.create(templateInputStream);
			ByteArrayOutputStream out = new ByteArrayOutputStream()) {
		Sheet sheet = workbook.getSheetAt(0);

		// --- Style Definitions ---
		CreationHelper createHelper = workbook.getCreationHelper();

		CellStyle dateStyle = workbook.createCellStyle();
		dateStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
		dateStyle.setBorderBottom(BorderStyle.THIN);
		dateStyle.setBorderTop(BorderStyle.THIN);
		dateStyle.setBorderLeft(BorderStyle.THIN);
		dateStyle.setBorderRight(BorderStyle.THIN);
		CellStyle textStyle = workbook.createCellStyle();
		textStyle.setBorderBottom(BorderStyle.THIN);
		textStyle.setBorderTop(BorderStyle.THIN);
		textStyle.setBorderLeft(BorderStyle.THIN);
		textStyle.setBorderRight(BorderStyle.THIN);

		// Create the font
		Font font = workbook.createFont();
		font.setFontHeightInPoints((short) 8); // size 8
		font.setFontName("Arial");
		CellStyle numberStyle = workbook.createCellStyle();
		// numberStyle.setDataFormat(createHelper.createDataFormat().getFormat("0.000"));
		numberStyle.setBorderBottom(BorderStyle.THIN);
		numberStyle.setBorderTop(BorderStyle.THIN);
		numberStyle.setBorderLeft(BorderStyle.THIN);
		numberStyle.setBorderRight(BorderStyle.THIN);
		numberStyle.setFont(font);
		// --- End of Style Definitions ---	
		

int startRow = 12;

if (!dataList1.isEmpty()) {
	for (int i = 0; i < dataList1.size(); i++) {
		M_SECL_Archival_Summary_Entity record = dataList1.get(i);
		System.out.println("rownumber="+startRow + i);
		Row row = sheet.getRow(startRow + i);
		if (row == null) {
			row = sheet.createRow(startRow + i);
		}
		
		Cell cell1 = row.createCell(1);
		if (record.getR13_EQUITY() != null) {
			cell1.setCellValue(record.getR13_EQUITY().doubleValue());
			cell1.setCellStyle(numberStyle);
		} else {
			cell1.setCellValue("");
			cell1.setCellStyle(textStyle);
		}
		
		Cell cell2 = row.createCell(2);
		if (record.getR13_BONDS() != null) {
			cell2.setCellValue(record.getR13_BONDS().doubleValue());
			cell2.setCellStyle(numberStyle);
		} else {
			cell2.setCellValue("");
			cell2.setCellStyle(textStyle);
		}
		
		Cell cell3 = row.createCell(3);
		if (record.getR13_BOBCS() != null) {
			cell3.setCellValue(record.getR13_BOBCS().doubleValue());
			cell3.setCellStyle(numberStyle);
		} else {
			cell3.setCellValue("");
			cell3.setCellStyle(textStyle);
		}
		
		Cell cell4 = row.createCell(4);
		if (record.getR13_TREASURY_BILLS() != null) {
			cell4.setCellValue(record.getR13_TREASURY_BILLS().doubleValue());
			cell4.setCellStyle(numberStyle);
		} else {
			cell4.setCellValue("");
			cell4.setCellStyle(textStyle);
		}
		
		Cell cell5 = row.createCell(5);
		if (record.getR13_REPURCHASE_AGREEMENTS() != null) {
			cell5.setCellValue(record.getR13_REPURCHASE_AGREEMENTS().doubleValue());
			cell5.setCellStyle(numberStyle);
		} else {
			cell5.setCellValue("");
			cell5.setCellStyle(textStyle);
		}
		
		Cell cell6 = row.createCell(6);
		if (record.getR13_COMMERCIAL_PAPER() != null) {
			cell6.setCellValue(record.getR13_COMMERCIAL_PAPER().doubleValue());
			cell6.setCellStyle(numberStyle);
		} else {
			cell6.setCellValue("");
			cell6.setCellStyle(textStyle);
		}
		
		Cell cell7 = row.createCell(7);
		if (record.getR13_CERTIFICATES_OF_DEPOSITS() != null) {
			cell7.setCellValue(record.getR13_CERTIFICATES_OF_DEPOSITS().doubleValue());
			cell7.setCellStyle(numberStyle);
		} else {
			cell7.setCellValue("");
			cell7.setCellStyle(textStyle);
		}
		
		Cell cell8 = row.createCell(8);
		if (record.getR13_PLEDGED_ASSETS() != null) {
			cell8.setCellValue(record.getR13_PLEDGED_ASSETS().doubleValue());
			cell8.setCellStyle(numberStyle);
		} else {
			cell8.setCellValue("");
			cell8.setCellStyle(textStyle);
		}
		

		Cell cell9 = row.createCell(9);
		if (record.getR13_OTHER_SPECIFY() != null) {
			cell9.setCellValue(record.getR13_OTHER_SPECIFY().doubleValue());
			cell9.setCellStyle(numberStyle);
		} else {
			cell9.setCellValue("");
			cell9.setCellStyle(textStyle);
		}
		
		

		 row = sheet.getRow(13);
		 if (row == null) {
		     row = sheet.createRow(13);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR14_EQUITY() != null) {
		     cell1.setCellValue(record.getR14_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR14_BONDS() != null) {
		     cell2.setCellValue(record.getR14_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR14_BOBCS() != null) {
		     cell3.setCellValue(record.getR14_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR14_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR14_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR14_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR14_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR14_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR14_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR14_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR14_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR14_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR14_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR14_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR14_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(14);
		 if (row == null) {
		     row = sheet.createRow(14);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR15_EQUITY() != null) {
		     cell1.setCellValue(record.getR15_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR15_BONDS() != null) {
		     cell2.setCellValue(record.getR15_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR15_BOBCS() != null) {
		     cell3.setCellValue(record.getR15_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR15_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR15_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR15_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR15_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR15_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR15_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR15_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR15_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR15_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR15_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR15_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR15_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }


		 row = sheet.getRow(16);
		 if (row == null) {
		     row = sheet.createRow(16);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR17_EQUITY() != null) {
		     cell1.setCellValue(record.getR17_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR17_BONDS() != null) {
		     cell2.setCellValue(record.getR17_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR17_BOBCS() != null) {
		     cell3.setCellValue(record.getR17_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR17_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR17_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR17_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR17_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR17_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR17_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR17_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR17_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR17_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR17_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR17_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR17_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(17);
		 if (row == null) {
		     row = sheet.createRow(17);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR18_EQUITY() != null) {
		     cell1.setCellValue(record.getR18_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR18_BONDS() != null) {
		     cell2.setCellValue(record.getR18_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR18_BOBCS() != null) {
		     cell3.setCellValue(record.getR18_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR18_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR18_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR18_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR18_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR18_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR18_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR18_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR18_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR18_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR18_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR18_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR18_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(18);
		 if (row == null) {
		     row = sheet.createRow(18);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR19_EQUITY() != null) {
		     cell1.setCellValue(record.getR19_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR19_BONDS() != null) {
		     cell2.setCellValue(record.getR19_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR19_BOBCS() != null) {
		     cell3.setCellValue(record.getR19_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR19_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR19_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR19_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR19_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR19_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR19_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR19_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR19_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR19_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR19_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR19_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR19_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(19);
		 if (row == null) {
		     row = sheet.createRow(19);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR20_EQUITY() != null) {
		     cell1.setCellValue(record.getR20_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR20_BONDS() != null) {
		     cell2.setCellValue(record.getR20_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR20_BOBCS() != null) {
		     cell3.setCellValue(record.getR20_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR20_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR20_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR20_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR20_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR20_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR20_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR20_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR20_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR20_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR20_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR20_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR20_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(20);
		 if (row == null) {
		     row = sheet.createRow(20);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR21_EQUITY() != null) {
		     cell1.setCellValue(record.getR21_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR21_BONDS() != null) {
		     cell2.setCellValue(record.getR21_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR21_BOBCS() != null) {
		     cell3.setCellValue(record.getR21_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR21_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR21_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR21_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR21_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR21_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR21_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR21_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR21_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR21_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR21_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR21_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR21_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(21);
		 if (row == null) {
		     row = sheet.createRow(21);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR22_EQUITY() != null) {
		     cell1.setCellValue(record.getR22_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR22_BONDS() != null) {
		     cell2.setCellValue(record.getR22_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR22_BOBCS() != null) {
		     cell3.setCellValue(record.getR22_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR22_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR22_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR22_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR22_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR22_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR22_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR22_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR22_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR22_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR22_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR22_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR22_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(22);
		 if (row == null) {
		     row = sheet.createRow(22);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR23_EQUITY() != null) {
		     cell1.setCellValue(record.getR23_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR23_BONDS() != null) {
		     cell2.setCellValue(record.getR23_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR23_BOBCS() != null) {
		     cell3.setCellValue(record.getR23_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR23_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR23_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR23_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR23_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR23_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR23_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR23_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR23_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR23_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR23_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR23_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR23_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(23);
		 if (row == null) {
		     row = sheet.createRow(23);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR24_EQUITY() != null) {
		     cell1.setCellValue(record.getR24_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR24_BONDS() != null) {
		     cell2.setCellValue(record.getR24_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR24_BOBCS() != null) {
		     cell3.setCellValue(record.getR24_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR24_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR24_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR24_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR24_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR24_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR24_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR24_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR24_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR24_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR24_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR24_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR24_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(24);
		 if (row == null) {
		     row = sheet.createRow(24);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR25_EQUITY() != null) {
		     cell1.setCellValue(record.getR25_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR25_BONDS() != null) {
		     cell2.setCellValue(record.getR25_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR25_BOBCS() != null) {
		     cell3.setCellValue(record.getR25_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR25_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR25_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR25_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR25_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR25_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR25_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR25_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR25_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR25_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR25_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR25_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR25_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(25);
		 if (row == null) {
		     row = sheet.createRow(25);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR26_EQUITY() != null) {
		     cell1.setCellValue(record.getR26_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR26_BONDS() != null) {
		     cell2.setCellValue(record.getR26_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR26_BOBCS() != null) {
		     cell3.setCellValue(record.getR26_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR26_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR26_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR26_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR26_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR26_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR26_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR26_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR26_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR26_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR26_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR26_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR26_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(26);
		 if (row == null) {
		     row = sheet.createRow(26);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR27_EQUITY() != null) {
		     cell1.setCellValue(record.getR27_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR27_BONDS() != null) {
		     cell2.setCellValue(record.getR27_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR27_BOBCS() != null) {
		     cell3.setCellValue(record.getR27_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR27_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR27_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR27_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR27_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR27_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR27_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR27_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR27_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR27_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR27_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR27_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR27_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(27);
		 if (row == null) {
		     row = sheet.createRow(27);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR28_EQUITY() != null) {
		     cell1.setCellValue(record.getR28_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR28_BONDS() != null) {
		     cell2.setCellValue(record.getR28_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR28_BOBCS() != null) {
		     cell3.setCellValue(record.getR28_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR28_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR28_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR28_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR28_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR28_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR28_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR28_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR28_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR28_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR28_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR28_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR28_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(28);
		 if (row == null) {
		     row = sheet.createRow(28);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR29_EQUITY() != null) {
		     cell1.setCellValue(record.getR29_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR29_BONDS() != null) {
		     cell2.setCellValue(record.getR29_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR29_BOBCS() != null) {
		     cell3.setCellValue(record.getR29_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR29_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR29_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR29_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR29_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR29_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR29_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR29_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR29_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR29_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR29_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR29_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR29_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(29);
		 if (row == null) {
		     row = sheet.createRow(29);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR30_EQUITY() != null) {
		     cell1.setCellValue(record.getR30_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR30_BONDS() != null) {
		     cell2.setCellValue(record.getR30_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR30_BOBCS() != null) {
		     cell3.setCellValue(record.getR30_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR30_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR30_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR30_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR30_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR30_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR30_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR30_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR30_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR30_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR30_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR30_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR30_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }

		 
		 row = sheet.getRow(31);
		 if (row == null) {
		     row = sheet.createRow(31);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR32_EQUITY() != null) {
		     cell1.setCellValue(record.getR32_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR32_BONDS() != null) {
		     cell2.setCellValue(record.getR32_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR32_BOBCS() != null) {
		     cell3.setCellValue(record.getR32_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR32_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR32_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR32_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR32_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR32_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR32_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR32_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR32_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR32_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR32_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR32_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR32_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(32);
		 if (row == null) {
		     row = sheet.createRow(32);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR33_EQUITY() != null) {
		     cell1.setCellValue(record.getR33_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR33_BONDS() != null) {
		     cell2.setCellValue(record.getR33_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR33_BOBCS() != null) {
		     cell3.setCellValue(record.getR33_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR33_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR33_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR33_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR33_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR33_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR33_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR33_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR33_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR33_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR33_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR33_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR33_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



			 row = sheet.getRow(34);
		 if (row == null) {
		     row = sheet.createRow(34);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR35_EQUITY() != null) {
		     cell1.setCellValue(record.getR35_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR35_BONDS() != null) {
		     cell2.setCellValue(record.getR35_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR35_BOBCS() != null) {
		     cell3.setCellValue(record.getR35_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR35_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR35_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR35_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR35_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR35_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR35_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR35_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR35_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR35_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR35_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR35_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR35_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(35);
		 if (row == null) {
		     row = sheet.createRow(35);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR36_EQUITY() != null) {
		     cell1.setCellValue(record.getR36_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR36_BONDS() != null) {
		     cell2.setCellValue(record.getR36_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR36_BOBCS() != null) {
		     cell3.setCellValue(record.getR36_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR36_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR36_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR36_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR36_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR36_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR36_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR36_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR36_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR36_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR36_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR36_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR36_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(37);
		 if (row == null) {
		     row = sheet.createRow(37);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR38_EQUITY() != null) {
		     cell1.setCellValue(record.getR38_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR38_BONDS() != null) {
		     cell2.setCellValue(record.getR38_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR38_BOBCS() != null) {
		     cell3.setCellValue(record.getR38_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR38_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR38_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR38_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR38_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR38_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR38_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR38_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR38_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR38_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR38_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR38_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR38_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(38);
		 if (row == null) {
		     row = sheet.createRow(38);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR39_EQUITY() != null) {
		     cell1.setCellValue(record.getR39_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR39_BONDS() != null) {
		     cell2.setCellValue(record.getR39_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR39_BOBCS() != null) {
		     cell3.setCellValue(record.getR39_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR39_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR39_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR39_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR39_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR39_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR39_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR39_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR39_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR39_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR39_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR39_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR39_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(39);
		 if (row == null) {
		     row = sheet.createRow(39);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR40_EQUITY() != null) {
		     cell1.setCellValue(record.getR40_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR40_BONDS() != null) {
		     cell2.setCellValue(record.getR40_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR40_BOBCS() != null) {
		     cell3.setCellValue(record.getR40_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR40_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR40_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR40_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR40_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR40_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR40_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR40_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR40_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR40_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR40_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR40_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR40_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(40);
		 if (row == null) {
		     row = sheet.createRow(40);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR41_EQUITY() != null) {
		     cell1.setCellValue(record.getR41_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR41_BONDS() != null) {
		     cell2.setCellValue(record.getR41_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR41_BOBCS() != null) {
		     cell3.setCellValue(record.getR41_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR41_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR41_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR41_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR41_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR41_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR41_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR41_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR41_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR41_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR41_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR41_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR41_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(41);
		 if (row == null) {
		     row = sheet.createRow(41);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR42_EQUITY() != null) {
		     cell1.setCellValue(record.getR42_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR42_BONDS() != null) {
		     cell2.setCellValue(record.getR42_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR42_BOBCS() != null) {
		     cell3.setCellValue(record.getR42_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR42_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR42_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR42_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR42_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR42_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR42_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR42_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR42_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR42_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR42_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR42_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR42_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }




		 row = sheet.getRow(42);
		 if (row == null) {
		     row = sheet.createRow(42);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR43_EQUITY() != null) {
		     cell1.setCellValue(record.getR43_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR43_BONDS() != null) {
		     cell2.setCellValue(record.getR43_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR43_BOBCS() != null) {
		     cell3.setCellValue(record.getR43_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR43_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR43_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR43_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR43_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR43_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR43_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR43_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR43_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR43_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR43_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR43_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR43_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(43);
		 if (row == null) {
		     row = sheet.createRow(43);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR44_EQUITY() != null) {
		     cell1.setCellValue(record.getR44_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR44_BONDS() != null) {
		     cell2.setCellValue(record.getR44_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR44_BOBCS() != null) {
		     cell3.setCellValue(record.getR44_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR44_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR44_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR44_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR44_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR44_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR44_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR44_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR44_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR44_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR44_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR44_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR44_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(44);
		 if (row == null) {
		     row = sheet.createRow(44);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR45_EQUITY() != null) {
		     cell1.setCellValue(record.getR45_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR45_BONDS() != null) {
		     cell2.setCellValue(record.getR45_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR45_BOBCS() != null) {
		     cell3.setCellValue(record.getR45_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR45_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR45_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR45_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR45_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR45_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR45_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR45_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR45_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR45_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR45_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR45_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR45_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(45);
		 if (row == null) {
		     row = sheet.createRow(45);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR46_EQUITY() != null) {
		     cell1.setCellValue(record.getR46_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR46_BONDS() != null) {
		     cell2.setCellValue(record.getR46_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR46_BOBCS() != null) {
		     cell3.setCellValue(record.getR46_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR46_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR46_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR46_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR46_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR46_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR46_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR46_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR46_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR46_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR46_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR46_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR46_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }




		 row = sheet.getRow(46);
		 if (row == null) {
		     row = sheet.createRow(46);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR47_EQUITY() != null) {
		     cell1.setCellValue(record.getR47_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR47_BONDS() != null) {
		     cell2.setCellValue(record.getR47_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR47_BOBCS() != null) {
		     cell3.setCellValue(record.getR47_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR47_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR47_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR47_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR47_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR47_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR47_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR47_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR47_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR47_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR47_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR47_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR47_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(47);
		 if (row == null) {
		     row = sheet.createRow(47);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR48_EQUITY() != null) {
		     cell1.setCellValue(record.getR48_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR48_BONDS() != null) {
		     cell2.setCellValue(record.getR48_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR48_BOBCS() != null) {
		     cell3.setCellValue(record.getR48_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR48_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR48_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR48_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR48_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR48_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR48_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR48_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR48_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR48_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR48_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR48_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR48_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(48);
		 if (row == null) {
		     row = sheet.createRow(48);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR49_EQUITY() != null) {
		     cell1.setCellValue(record.getR49_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR49_BONDS() != null) {
		     cell2.setCellValue(record.getR49_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR49_BOBCS() != null) {
		     cell3.setCellValue(record.getR49_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR49_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR49_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR49_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR49_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR49_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR49_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR49_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR49_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR49_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR49_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR49_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR49_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }


		 row = sheet.getRow(49);
		 if (row == null) {
		     row = sheet.createRow(49);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR50_EQUITY() != null) {
		     cell1.setCellValue(record.getR50_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR50_BONDS() != null) {
		     cell2.setCellValue(record.getR50_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR50_BOBCS() != null) {
		     cell3.setCellValue(record.getR50_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR50_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR50_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR50_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR50_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR50_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR50_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR50_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR50_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR50_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR50_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR50_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR50_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }




		 row = sheet.getRow(50);
		 if (row == null) {
		     row = sheet.createRow(50);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR51_EQUITY() != null) {
		     cell1.setCellValue(record.getR51_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR51_BONDS() != null) {
		     cell2.setCellValue(record.getR51_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR51_BOBCS() != null) {
		     cell3.setCellValue(record.getR51_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR51_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR51_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR51_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR51_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR51_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR51_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR51_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR51_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR51_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR51_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR51_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR51_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(51);
		 if (row == null) {
		     row = sheet.createRow(51);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR52_EQUITY() != null) {
		     cell1.setCellValue(record.getR52_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR52_BONDS() != null) {
		     cell2.setCellValue(record.getR52_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR52_BOBCS() != null) {
		     cell3.setCellValue(record.getR52_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR52_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR52_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR52_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR52_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR52_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR52_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR52_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR52_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR52_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR52_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR52_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR52_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(52);
		 if (row == null) {
		     row = sheet.createRow(52);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR53_EQUITY() != null) {
		     cell1.setCellValue(record.getR53_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR53_BONDS() != null) {
		     cell2.setCellValue(record.getR53_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR53_BOBCS() != null) {
		     cell3.setCellValue(record.getR53_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR53_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR53_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR53_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR53_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR53_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR53_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR53_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR53_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR53_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR53_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR53_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR53_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(53);
		 if (row == null) {
		     row = sheet.createRow(53);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR54_EQUITY() != null) {
		     cell1.setCellValue(record.getR54_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR54_BONDS() != null) {
		     cell2.setCellValue(record.getR54_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR54_BOBCS() != null) {
		     cell3.setCellValue(record.getR54_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR54_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR54_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR54_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR54_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR54_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR54_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR54_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR54_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR54_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR54_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR54_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR54_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(54);
		 if (row == null) {
		     row = sheet.createRow(54);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR55_EQUITY() != null) {
		     cell1.setCellValue(record.getR55_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR55_BONDS() != null) {
		     cell2.setCellValue(record.getR55_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR55_BOBCS() != null) {
		     cell3.setCellValue(record.getR55_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR55_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR55_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR55_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR55_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR55_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR55_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR55_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR55_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR55_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR55_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR55_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR55_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }



		 row = sheet.getRow(55);
		 if (row == null) {
		     row = sheet.createRow(55);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR56_EQUITY() != null) {
		     cell1.setCellValue(record.getR56_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR56_BONDS() != null) {
		     cell2.setCellValue(record.getR56_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR56_BOBCS() != null) {
		     cell3.setCellValue(record.getR56_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR56_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR56_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR56_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR56_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR56_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR56_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR56_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR56_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR56_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR56_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR56_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR56_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }


		 row = sheet.getRow(56);
		 if (row == null) {
		     row = sheet.createRow(56);
		 }

		 cell1 = row.createCell(1);
		 if (record.getR57_EQUITY() != null) {
		     cell1.setCellValue(record.getR57_EQUITY().doubleValue());
		     cell1.setCellStyle(numberStyle);
		 } else {
		     cell1.setCellValue("");
		     cell1.setCellStyle(textStyle);
		 }

		 cell2 = row.createCell(2);
		 if (record.getR57_BONDS() != null) {
		     cell2.setCellValue(record.getR57_BONDS().doubleValue());
		     cell2.setCellStyle(numberStyle);
		 } else {
		     cell2.setCellValue("");
		     cell2.setCellStyle(textStyle);
		 }

		 cell3 = row.createCell(3);
		 if (record.getR57_BOBCS() != null) {
		     cell3.setCellValue(record.getR57_BOBCS().doubleValue());
		     cell3.setCellStyle(numberStyle);
		 } else {
		     cell3.setCellValue("");
		     cell3.setCellStyle(textStyle);
		 }

		 cell4 = row.createCell(4);
		 if (record.getR57_TREASURY_BILLS() != null) {
		     cell4.setCellValue(record.getR57_TREASURY_BILLS().doubleValue());
		     cell4.setCellStyle(numberStyle);
		 } else {
		     cell4.setCellValue("");
		     cell4.setCellStyle(textStyle);
		 }

		 cell5 = row.createCell(5);
		 if (record.getR57_REPURCHASE_AGREEMENTS() != null) {
		     cell5.setCellValue(record.getR57_REPURCHASE_AGREEMENTS().doubleValue());
		     cell5.setCellStyle(numberStyle);
		 } else {
		     cell5.setCellValue("");
		     cell5.setCellStyle(textStyle);
		 }

		 cell6 = row.createCell(6);
		 if (record.getR57_COMMERCIAL_PAPER() != null) {
		     cell6.setCellValue(record.getR57_COMMERCIAL_PAPER().doubleValue());
		     cell6.setCellStyle(numberStyle);
		 } else {
		     cell6.setCellValue("");
		     cell6.setCellStyle(textStyle);
		 }

		 cell7 = row.createCell(7);
		 if (record.getR57_CERTIFICATES_OF_DEPOSITS() != null) {
		     cell7.setCellValue(record.getR57_CERTIFICATES_OF_DEPOSITS().doubleValue());
		     cell7.setCellStyle(numberStyle);
		 } else {
		     cell7.setCellValue("");
		     cell7.setCellStyle(textStyle);
		 }

		 cell8 = row.createCell(8);
		 if (record.getR57_PLEDGED_ASSETS() != null) {
		     cell8.setCellValue(record.getR57_PLEDGED_ASSETS().doubleValue());
		     cell8.setCellStyle(numberStyle);
		 } else {
		     cell8.setCellValue("");
		     cell8.setCellStyle(textStyle);
		 }

		 cell9 = row.createCell(9);
		 if (record.getR57_OTHER_SPECIFY() != null) {
		     cell9.setCellValue(record.getR57_OTHER_SPECIFY().doubleValue());
		     cell9.setCellStyle(numberStyle);
		 } else {
		     cell9.setCellValue("");
		     cell9.setCellStyle(textStyle);
		 }
	}
	workbook.getCreationHelper().createFormulaEvaluator().evaluateAll();
} else {
	
}

// Write the final workbook content to the in-memory stream.
workbook.write(out);

logger.info("Service: Excel data successfully written to memory buffer ({} bytes).", out.size());

return out.toByteArray();
		}
	}
}