package com.bornfire.xbrl.services;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.HashPrintServiceAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;
import javax.print.attribute.PrintServiceAttributeSet;
import javax.print.attribute.standard.MediaSizeName;
import javax.print.attribute.standard.OrientationRequested;
import javax.print.attribute.standard.PrinterName;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bornfire.xbrl.entities.CustomRepDownloadEntity;
import com.bornfire.xbrl.entities.CustomRepDownloadRep;
import com.bornfire.xbrl.entities.CustomReportGeneratorInfo;
import com.bornfire.xbrl.entities.CustomReportParms;
import com.bornfire.xbrl.entities.CustomReportsParmsRepo;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimplePrintServiceExporterConfiguration;

@Service
@Transactional
@ConfigurationProperties("output")
public class CustomRepGeneratorServices {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CustomReportsParmsRepo customReportsParmsRepo;
	
	@Autowired
	CustomRepDownloadRep customRepDownloadRep;

	private static final Logger logger = LoggerFactory.getLogger(CustomRepGeneratorServices.class);

	@Autowired
	Environment env;

	private static String[] columns = null;

	  
	public List<String> getHeaders(String rpt_ref_no) throws IOException {
		CustomReportParms up = customReportsParmsRepo.findByIdcustom(rpt_ref_no);

		String path = env.getProperty("input.importpath");
		path = path + "\\" + up.getOutput_file_name() + ".sql";
		BufferedReader in = new BufferedReader(new FileReader(path));
		String str;
		StringBuffer sb = new StringBuffer();
		while ((str = in.readLine()) != null) {
			sb.append(str + "\n ");
			break;
		}
		in.close();
		String s=sb.toString();
		String[] dt1 = s.split("/");
//		List<String> headers = Arrays.asList("ID", "Name", "lastname", "nid");
		List<String> headers = new ArrayList<String>();
		
		for(String s1:dt1) {
			headers.add(s1);
		}

		
		return headers;
	}
public void copyfile(String sourcepath,String destinationpath) {
	File source = new File(sourcepath);
	File dest = new File(destinationpath);
	try {
	    FileUtils.copyFile(source, dest);
	} catch (IOException e) {
	    e.printStackTrace();
	}
	
}
public void modifyfilecontent(String modifiedPath,CustomReportParms reportparam_info,String input1,String input2,String input3,String input4,String input5,String ConDate) {
//	modifiedPath = "C:\\XBRL\\ReportGeneration\\clob_output"+ConDate+".sql";
	 File fileToBeModified = new File(modifiedPath);
    
       String oldContent = "";
        
       BufferedReader reader = null;
        
       FileWriter writer = null;
        
       try
       {
           reader = new BufferedReader(new FileReader(fileToBeModified));
            
           //Reading all the lines of input text file into oldContent
            
           String line = reader.readLine();
            
           while (line != null) 
			{
				oldContent = oldContent + line + System.lineSeparator();

				line = reader.readLine();
			}
            
           //Replacing oldString with newString in the oldContent
            
           String newContent ;
   

   		if(reportparam_info.getInput_1()!=null && !reportparam_info.getInput_1().isEmpty()) {
   			newContent = oldContent.replaceAll("&1",input1);
   		}else {
   			newContent = oldContent.replaceAll("&1",null);
   		}
   		if(reportparam_info.getInput_2()!=null && !reportparam_info.getInput_2().isEmpty()) {
   			newContent=newContent.replaceAll("&2",input2);
   		}else {
   			newContent=newContent.replaceAll("&2",null);
   		}
   		if(reportparam_info.getInput_3()!=null && !reportparam_info.getInput_3().isEmpty()) {
   			newContent=newContent.replaceAll("&3",input3);
   		}else {
   			newContent=newContent.replaceAll("&3",null);
   		}
   		if(reportparam_info.getInput_4()!=null && !reportparam_info.getInput_4().isEmpty()) {
   			newContent=newContent.replaceAll("&4",input4);
   		}else {
   			newContent=newContent.replaceAll("&4",null);
   		}
   		if(reportparam_info.getInput_5()!=null && !reportparam_info.getInput_5().isEmpty()) {
   			newContent=newContent.replaceAll("&5",input5);
   		}else {
   			newContent=newContent.replaceAll("&5",null);
   		}
   	
			newContent=newContent.replaceAll("&filename",env.getProperty("output.outputpath")+reportparam_info.getRpt_name()+ConDate+".txt");
			
	        
			
				logger.info("fileTobemodified"+fileToBeModified);
				
           
           //Rewriting the input text file with newContent
            
           writer = new FileWriter(fileToBeModified);
            
           writer.write(newContent);
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
       finally
       {
           try
           {
               //Closing the resources
                
               reader.close();
                
               writer.close();
           } 
           catch (IOException e) 
           {
               e.printStackTrace();
           }
       }

}
	public void modifybatfilecontent(String batfilepath,CustomReportParms info,String ConDate) {
		
	//	batfilepath = env.getProperty("input.importpath");
	 File fileToBeModified = new File(batfilepath+"run.bat");
	//	 File fileToBeModified = new File(batfilepath);
		 logger.info("batfilepath in modifybatfilecontent "+ fileToBeModified);   
	       String oldContent = "";
	        
	       BufferedReader reader = null;
	        
	       FileWriter writer = null;
	        
	       try
	       {
	           reader = new BufferedReader(new FileReader(fileToBeModified));
	           //Reading all the lines of input text file into oldContent
	           String line = reader.readLine();
	            
	           while (line != null) 
				{
					oldContent = oldContent + line + System.lineSeparator();

					line = reader.readLine();
				}
	            
	           //Replacing oldString with newString in the oldContent
	            
	           String newContent = oldContent ;
	   

			  // newContent=newContent.replaceAll("&filename","@"+batfilepath+info.getOutput_file_name());
			   newContent=newContent.replaceAll("&filename","@"+env.getProperty("output.modfiedpath")+"clob"+ConDate+".sql");

	           //Rewriting the input text file with newContent
	            
	           writer = new FileWriter(fileToBeModified);
	            
	           writer.write(newContent);
	       }
	       catch (IOException e)
	       {
	           e.printStackTrace();
	       }
	       finally
	       {
	           try
	           {
	               //Closing the resources
	                
	               reader.close();
	                
	               writer.close();
	           } 
	           catch (IOException e) 
	           {
	               e.printStackTrace();
	           }
	       }

		
	}
	public String runSqlReport(String userid,String username,String rpt_ref_no,String input1,String input2,String input3,String input4,String input5,String filename,String reportname)
			throws IOException, SQLException, ParseException {
		Session hs=sessionFactory.getCurrentSession();
		
		System.out.println("report"+userid);
        
SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");  


		SimpleDateFormat formatter2 = new SimpleDateFormat("ddMMyyyyHHmmss");  
		//String d1 = formatter2.format(new Date());

		String ConDate = formatter2.format(new Date());
		CustomReportParms reportparam_info = customReportsParmsRepo.findByIdcustom(rpt_ref_no);
		
		//copying script file
		String path = env.getProperty("input.importpath");
		path = path  + reportparam_info.getOutput_file_name() + ".sql";
		String filePath = null ;

	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.26.46.178:1521/xbrlprod","xbrl","xbrl");
//		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@103.224.241.244:1521/orcl","xbrl","xbrl");

		 Statement stmt = con.createStatement();
		 String sql = "select * from file_type where report_id= '"+reportparam_info.getRpt_code()+"'";
		 ResultSet rs = stmt.executeQuery(sql);
		 
		 
	      int j = 0;
	      System.out.println("Contents of the table are: ");
	     
	      while(rs.next()) {
	         System.out.println(rs.getString("report_id"));
	         Clob clob = rs.getClob("File_data");
	         Reader r = clob.getCharacterStream();
	          filePath = env.getProperty("output.modfiedpath")+"clob"+ConDate+".sql";
	          logger.info("filepath :"+filePath );
	         FileWriter writer = new FileWriter(filePath);
	         int i;
	         while ((i=r.read())!=-1) {
	            writer.write(i);
	         }
	         writer.close();
	         System.out.println(filePath);
	         j++;
	      }
	    
	      
		String modifiedPath=env.getProperty("output.modfiedpath");
		modifiedPath=modifiedPath  + reportparam_info.getOutput_file_name() + ".sql";

		//copyfile(filePath,modifiedPath);
		logger.info("Getting Output file :" + modifiedPath +"hii" + filePath );

		modifyfilecontent(filePath,reportparam_info,input1,input2,input3,input4,input5,ConDate);

		
		//copying bat file
		String batfilepath = env.getProperty("input.importpath");
		batfilepath=batfilepath+"run.bat";
		
		String destbatfilepath=env.getProperty("output.modfiedpath");
		destbatfilepath=destbatfilepath+"run.bat";
		
File file = new File(destbatfilepath); 
        
        file.delete();
		
		copyfile(batfilepath,destbatfilepath);
	    logger.info("batfilepath"+batfilepath+"destbatfilepath"+destbatfilepath);
		modifybatfilecontent(env.getProperty("output.modfiedpath"),reportparam_info,ConDate);
		
	//	modifybatfilecontent(destbatfilepath,reportparam_info,ConDate);

	        
	        File dir = new File(env.getProperty("output.modfiedpath"));
	        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "Start","run.bat");
	        pb.directory(dir);
	        Process p = pb.start();

	System.out.println("date  "+ConDate);
	String finalfilepath = this.env.getProperty("output.outputpath")+reportparam_info.getRpt_name()+ConDate+".txt";
			// FileReader reader = new FileReader(finalfilepath);
				File outputFile;
			outputFile = new File(finalfilepath);
			
			CustomRepDownloadEntity cust = new CustomRepDownloadEntity();
			
			BigDecimal Number = (BigDecimal) hs.createNativeQuery("SELECT CUSTOM_REP_DOWNLOAD.NEXTVAL AS SRL_NO FROM DUAL")
			.getSingleResult();
			cust.setRpt_srl_no(Number.toString());
			cust.setUser_id(userid);
			cust.setUser_name(username);
			cust.setRpt_id(reportparam_info.getRpt_ref_no());
			cust.setDel_on_download('N');
			cust.setRpt_name(reportparam_info.getRpt_name());
			cust.setDownload_flg('N');
			cust.setDownload_userid("");
		
			cust.setRpt_gen_time(new Date());
			cust.setFile_location(finalfilepath);
			hs.saveOrUpdate(cust);
		
			String msg ="File Generated Successfully";
			
			
		return msg;
	}
	
	
	public File downlaodbypath(String Filename)
			throws IOException, SQLException {
		Session hs=sessionFactory.getCurrentSession();
	
			File outputFile;
			outputFile = new File(Filename);
		
			
		return outputFile;
	}

	
	public File runSqlReportData(String userid,String username,String rpt_id,String filepath,String downloadondelete)
			throws IOException, SQLException {
		Session hs=sessionFactory.getCurrentSession();
		
		
		CustomRepDownloadEntity cust = customRepDownloadRep.findByIdcustom(rpt_id);
		
		//copying script file
		String finalfilepath = this.env.getProperty("output.outputpath")+cust.getRpt_name();

			File outputFile;
			outputFile = new File(cust.getFile_location());
			BigDecimal number;
			System.out.println("report"+cust.getNo_of_download() +downloadondelete);
			if(cust.getNo_of_download() == null) {
				 number = new BigDecimal(1);	
			}else {
			 number = cust.getNo_of_download().add(new BigDecimal(1));
			}
			if(downloadondelete.equals( "Y")) { 
				cust.setDel_on_download('Y');
				cust.setRpt_srl_no(cust.getRpt_srl_no());
				cust.setUser_id(cust.getUser_id());
				cust.setUser_name(cust.getUser_name());
				cust.setRpt_id(cust.getRpt_id());
				cust.setRpt_name(cust.getRpt_name());
				cust.setDownload_userid("");
				cust.setDownload_userid(userid);
				cust.setNo_of_download(number);
				cust.setRpt_gen_time(new Date());
				cust.setDownload_flg('Y');
				cust.setFile_location(cust.getFile_location());
				hs.saveOrUpdate(cust);
			}else if(downloadondelete.equals("N")) {

				cust.setDel_on_download('N');
				cust.setRpt_srl_no(cust.getRpt_srl_no());
				cust.setUser_id(cust.getUser_id());
				cust.setUser_name(cust.getUser_name());
				cust.setRpt_id(cust.getRpt_id());				
				cust.setRpt_name(cust.getRpt_name());
				cust.setDownload_userid("");
				cust.setDownload_userid(userid);
				cust.setNo_of_download(number);
				cust.setRpt_gen_time(new Date());
				cust.setDownload_flg('Y');
				cust.setFile_location(cust.getFile_location());
				hs.saveOrUpdate(cust);
			}
			
			
			
			
			
			
			
		return outputFile;
	}

	
	public Page<CustomReportGeneratorInfo> parameterlistwithdecode(String rpt_ref_no, Pageable pageable)
			throws IOException, SQLException {
		Session hs=sessionFactory.getCurrentSession();
		

		CustomReportParms reportparam_info = customReportsParmsRepo.findByIdcustom(rpt_ref_no);

		String path = env.getProperty("input.importpath");
		path = path + "\\" + reportparam_info.getOutput_file_name() + ".bat";

//		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl.bornfire.in","bcs","bcs");
//		ScriptRunner runner=new ScriptRunner(conn, false, false);
//		InputStreamReader reader = new InputStreamReader(new FileInputStream(path));
//		runner.runScript(reader);
//		  runner.setLogWriter(out);//设置是否输出日志
//		reader.close();
//		conn.close();
	      
	 	
		File dir = new File("C:\\Users\\Kalaivanan\\Desktop\\download\\");
        ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/C", "Start","run.bat");
        pb.directory(dir);
        Process p = pb.start();
        
//	      Process process = Runtime.getRuntime().exec("cmd /c run.bat", "Start", new File("C:\\Users\\Kalaivanan\\Desktop\\download\\"));

        
//		  try {
//		      String line;
//		      Process p = Runtime.getRuntime().exec
//		        ("psql -U bcs -d dborclname -h localhost -f "+path);
//		      BufferedReader input =
//		        new BufferedReader
//		          (new InputStreamReader(p.getInputStream()));
//		      while ((line = input.readLine()) != null) {
//		        System.out.println(line);
//		      }
//		      input.close();
//		    }
//		    catch (Exception err) {
//		      err.printStackTrace();
//		    }
		  	

//	        String script_location = path;
//	        try {
//	          
//	                script_location = "@" + path;// ORACLE
//	                ProcessBuilder processBuilder = new ProcessBuilder("sqlplus",
//	                        "bcs/bcs@orcl", script_location); // ORACLE
//
//	                processBuilder.redirectErrorStream(true);
//	                Process process = processBuilder.start();
//	                BufferedReader in = new BufferedReader(new InputStreamReader(
//	                        process.getInputStream()));
//	                String currentLine = null;
//	                while ((currentLine = in.readLine()) != null) {
//	                    System.out.println(" " + currentLine);
//	                }
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        } catch (Exception ex) {
//	            ex.printStackTrace();
//	        }

		
//		BufferedReader in = new BufferedReader(new FileReader(path));
//		String str;
//		StringBuffer sb = new StringBuffer();
//		int j=0;
//		while ((str = in.readLine()) != null) {
//			if (j != 0) {
//				sb.append(str + "\n ");
//			}
//			j++;
//		}
//		in.close();
//		String query=sb.toString();
//		String final_str=null;
//		
//		if(reportparam_info.getInput_1()!=null && !reportparam_info.getInput_1().isEmpty()) {
//			final_str=query.replaceAll("&1",reportparam_info.getInput_1());
//		}
//		if(reportparam_info.getInput_2()!=null && !reportparam_info.getInput_2().isEmpty()) {
//		 final_str=final_str.replaceAll("&2",reportparam_info.getInput_2());
//		}
//		if(reportparam_info.getInput_3()!=null && !reportparam_info.getInput_3().isEmpty()) {
//		 final_str=final_str.replaceAll("&3",reportparam_info.getInput_3());
//		}
//		if(reportparam_info.getInput_4()!=null && !reportparam_info.getInput_4().isEmpty()) {
//		 final_str=final_str.replaceAll("&4",reportparam_info.getInput_4());
//		}
//		if(reportparam_info.getInput_5()!=null && !reportparam_info.getInput_5().isEmpty()) {
//		 final_str=final_str.replaceAll("&5",reportparam_info.getInput_5());
//		}
//
		int pageSize = pageable.getPageSize();
		int Page = pageable.getPageNumber();
		int startItem = Page * pageSize;
//		Session hs = sessionFactory.getCurrentSession();
		List<CustomReportGeneratorInfo> lst = new ArrayList<CustomReportGeneratorInfo>();
//		Query<Object[]> qr;
//
//		qr = hs.createNativeQuery(final_str);
//
//		List<Object[]> result = qr.getResultList();
//
//		try {
////					int i=0;
//			for (Object[] a : result) {
//
//				CustomReportGeneratorInfo info = new CustomReportGeneratorInfo();
//				Object[] str_1 = new Object[a.length];
//				int i = 0;
//				for (Object ainfo : a) {
//					str_1[i] = ainfo;
//					i++;
//				}
//				info.setStr_1(str_1);
//				lst.add(info);
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//			e.printStackTrace();
//		}
		List<CustomReportGeneratorInfo> pagedlist = null;
//
//		if (lst.size() < startItem) {
//			pagedlist = Collections.emptyList();
//		} else {
//			int toIndex = Math.min(startItem + pageSize, lst.size());
//			pagedlist = lst.subList(startItem, toIndex);
//		}
		Page<CustomReportGeneratorInfo> t9Dt1Page = new PageImpl<CustomReportGeneratorInfo>(pagedlist,
				PageRequest.of(Page, pageSize), lst.size());

		return t9Dt1Page;

	}
	
	public ByteArrayInputStream getFileExcel(String userid, String ref_id, String input1, String input2, 
			String input3, String input4, String input5,String filename,String reportname ) throws FileNotFoundException, JRException, SQLException, ParseException {

		ByteArrayOutputStream out = new ByteArrayOutputStream();

		Session hs = sessionFactory.getCurrentSession();
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MMM-yyyy");
		System.out.println("HII"+input1 +"HIII"+input2);

		CustomReportParms reportparam_info = customReportsParmsRepo.findByIdcustom(ref_id);

		String path = env.getProperty("input.importpath");
		path = path + "\\" + reportparam_info.getOutput_file_name() + ".sql";
		BufferedReader in = new BufferedReader(new FileReader(path));
		String str;
		StringBuffer sb = new StringBuffer();
		int j=0;
		try {
			while ((str = in.readLine()) != null) {
				if (j != 0) {
					sb.append(str + "\n ");
				}
				j++;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			in.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String query=sb.toString();
		String final_str=query.replaceAll("&1",reportparam_info.getValue_1());
		
		 final_str=final_str.replaceAll("&2",reportparam_info.getValue_2());
		 final_str=final_str.replaceAll("&3",reportparam_info.getValue_3());
		 final_str=final_str.replaceAll("&4",reportparam_info.getValue_4());
		 final_str=final_str.replaceAll("&5",reportparam_info.getValue_5());

		Session hs1 = sessionFactory.getCurrentSession();
		List<CustomReportGeneratorInfo> lst = new ArrayList<CustomReportGeneratorInfo>();
		Query<Object[]> qr;

		qr = hs1.createNativeQuery(final_str);

		List<Object[]> result = qr.getResultList();

		try {
//					int i=0;
			for (Object[] a : result) {

				CustomReportGeneratorInfo info = new CustomReportGeneratorInfo();
				Object[] str_1 = new Object[a.length];
				int i = 0;
				for (Object ainfo : a) {
					str_1[i] = ainfo;
					i++;
				}
				info.setStr_1(str_1);
				lst.add(info);
			}
		} catch (Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}

		BufferedReader in_clm = new BufferedReader(new FileReader(path));
		
		StringBuffer sb_clm = new StringBuffer();
		try {
			while ((str = in_clm.readLine()) != null) {
					sb_clm.append(str + "\n ");
					break;
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			in_clm.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String s=sb_clm.toString();
		columns = s.split("/");	


		
		String file_Name = "";

		FileOutputStream outputFile;

		logger.info("Getting Output file :" + ref_id);

		file_Name = ref_id + "_" + dateFormat.format(new Date());

		try {
			InputStream fileStream = null;

			Workbook workbook = new XSSFWorkbook();
			CreationHelper createHelper = workbook.getCreationHelper();
			Sheet sheet = workbook.createSheet(reportname);

			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerFont.setFontHeightInPoints((short) 14);
			headerFont.setColor(IndexedColors.BLACK.getIndex());

			
			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFont(headerFont);

			Row TitleRow = sheet.createRow(0);
			Cell cellTitle = TitleRow.createCell((short) 0);
			cellTitle.setCellValue("BANK NAME");
//			sheet.addMergedRegion(CellRangeAddress.valueOf("A1:M2"));
			sheet.addMergedRegion(new CellRangeAddress(0, 0, 0, columns.length-1));
			headerCellStyle.setAlignment(HorizontalAlignment.CENTER_SELECTION);
//			headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
			cellTitle.setCellStyle(headerCellStyle);
			
			Row ReportNameRow = sheet.createRow(2);
			Cell cellReporName = ReportNameRow.createCell((short) 0);
			cellReporName.setCellValue(reportname);
//			sheet.addMergedRegion(CellRangeAddress.valueOf ("A3:M3"));
			sheet.addMergedRegion(new CellRangeAddress(2, 2, 0, columns.length-1));

			headerCellStyle.setAlignment(HorizontalAlignment.CENTER_SELECTION);
//			headerCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
			cellReporName.setCellStyle(headerCellStyle);
			
			
			
			CellStyle reportDateCellStyle = workbook.createCellStyle();
			reportDateCellStyle.setFont(headerFont);
			
//			Row Report_Date_Row = sheet.createRow(3);
//			Cell cellReporDate = Report_Date_Row.createCell((short) 0);
//			cellReporDate.setCellValue("From Date- "+fromDAte+" To Date- "+toDAte);
//			sheet.addMergedRegion(CellRangeAddress.valueOf("A4:E4"));
//			reportDateCellStyle.setAlignment(HorizontalAlignment.LEFT);
////			reportDateCellStyle.setVerticalAlignment(VerticalAlignment.CENTER);
//			cellReporDate.setCellStyle(reportDateCellStyle);
		
	
			Row headerRow = sheet.createRow(5);
			for (int i = 0; i < columns.length; i++) {
				Cell cell = headerRow.createCell(i);
				cell.setCellValue(columns[i]);
				cell.setCellStyle(headerCellStyle);
			}

			CellStyle dateCellStyle = workbook.createCellStyle();
			dateCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("dd-MM-yyyy"));
			
			
			DataFormat fmt = workbook.createDataFormat();
			CellStyle cellStyle = workbook.createCellStyle();
			cellStyle.setDataFormat(
			    fmt.getFormat("@"));
			

			int rowNum = 5;
			int sn = 1;

			for (CustomReportGeneratorInfo pep_List : lst) {
				Row row = sheet.createRow(++rowNum);
				writeBook(pep_List, row, dateCellStyle,sn,cellStyle);
				sn++;
			}

			for (int i = 0; i < columns.length; i++) {
				sheet.autoSizeColumn(i);
			}

			
			workbook.write(out);
			out.close();

			// Closing the workbook
			workbook.close();


		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ByteArrayInputStream(out.toByteArray());

	}
private void writeBook(CustomReportGeneratorInfo aBook, Row row, CellStyle dateCellStyle,int sn,CellStyle dataCell) {

	
	int i=0;
		for (Object a : aBook.getStr_1()) {
			Cell cell = row.createCell(i);
			cell.setCellValue(a.toString());
			cell.setCellStyle(dataCell);
			i++;
		}

}

//**********************************printer

@Autowired
@Qualifier("jdbcTemplate")
private JdbcTemplate jdbcTemplate;

@Autowired
private ResourceLoader resourceLoader;

public JasperPrint exportPdfFile() throws SQLException, JRException, IOException {
 Connection conn = jdbcTemplate.getDataSource().getConnection();

 String path = resourceLoader.getResource("classpath:rpt_users.jrxml").getURI().getPath();

 JasperReport jasperReport = JasperCompileManager.compileReport(path);

 // Parameters for report
 Map<String, Object> parameters = new HashMap<String, Object>();

 JasperPrint print = JasperFillManager.fillReport(jasperReport, parameters, conn);

 return print;
}

public void printReport(JasperPrint jasperPrint, String selectedPrinter) throws JRException {
 PrintRequestAttributeSet printRequestAttributeSet = new HashPrintRequestAttributeSet();
 printRequestAttributeSet.add(MediaSizeName.ISO_A4);
 if (jasperPrint.getOrientationValue() == net.sf.jasperreports.engine.type.OrientationEnum.LANDSCAPE) {
  printRequestAttributeSet.add(OrientationRequested.LANDSCAPE);
 } else {
  printRequestAttributeSet.add(OrientationRequested.PORTRAIT);
 }
 PrintServiceAttributeSet printServiceAttributeSet = new HashPrintServiceAttributeSet();
 printServiceAttributeSet.add(new PrinterName(selectedPrinter, null));

 JRPrintServiceExporter exporter = new JRPrintServiceExporter();
 SimplePrintServiceExporterConfiguration configuration = new SimplePrintServiceExporterConfiguration();
 configuration.setPrintRequestAttributeSet(printRequestAttributeSet);
 configuration.setPrintServiceAttributeSet(printServiceAttributeSet);
 configuration.setDisplayPageDialog(false);
 configuration.setDisplayPrintDialog(false);

 exporter.setExporterInput(new SimpleExporterInput(jasperPrint));
 exporter.setConfiguration(configuration);

 PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
 PrintService selectedService = null;
 if (services.length != 0 || services != null) {
  for (PrintService service : services) {
   String existingPrinter = service.getName();
   if (existingPrinter.equals(selectedPrinter)) {
    selectedService = service;
    break;
   }
  }
 }

 if (selectedService != null) {
  exporter.exportReport();
 } else {
  System.out.println("You did not set the printer!");
 }
}

}
