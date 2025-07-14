package com.bornfire.xbrl.services;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bornfire.xbrl.entities.CustomReportParms;
import com.bornfire.xbrl.entities.CustomReportsParmsRepo;

@Service
@Transactional
@ConfigurationProperties("output")
public class CustomRepParamServices {

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	CustomReportsParmsRepo customReportsParmsRepo;

	private static final Logger logger = LoggerFactory.getLogger(CustomRepParamServices.class);

	public String customParam(CustomReportParms customReportParms, String formmode) throws IOException, SQLException {

		Session hs = sessionFactory.getCurrentSession();
		String msg = "";
		if (formmode.equals("add")) {
			CustomReportParms up = customReportParms;
			up.setEntity_flg("N");
			up.setModify_flg("Y");
			up.setDel_flg("N");
			customReportsParmsRepo.save(up);
			try{  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.26.46.178:1521/xbrlprod","xbrl","xbrl"); 
				//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@103.224.241.244:1521/orcl","xbrl","xbrl");  

				PreparedStatement ps=con.prepareStatement(  
				"insert into file_type values(?,?)");  
				              
				File f=new File(up.getLocation());  
				FileReader fr=new FileReader(f);  
				              
				ps.setNString(2,up.getRpt_code());  
				ps.setCharacterStream(1,fr,(int)f.length());  
				int i=ps.executeUpdate();  
				System.out.println(i+" records affected");  
				              
				con.close();  
				              
				}catch (Exception e) {e.printStackTrace();} 
			msg = "Added Sucessfully";
		} else if (formmode.equals("edit")) {
			CustomReportParms up = customReportParms;
			up.setEntity_flg("Y");
			up.setModify_flg("N");
			up.setDel_flg("N");
			File tempFile = new File(up.getLocation());
			boolean exists = tempFile.exists();
			if(exists == true) {
				msg = " Modified  Sucessfully";
				customReportsParmsRepo.save(up);
									try {
						logger.info("insert");
						Class.forName("oracle.jdbc.driver.OracleDriver");  
						Connection con=DriverManager.getConnection("jdbc:oracle:thin:@172.26.46.178:1521/xbrlprod","xbrl","xbrl"); 
						//Connection con=DriverManager.getConnection("jdbc:oracle:thin:@103.224.241.244:1521/orcl","xbrl","xbrl");  

						PreparedStatement ps=con.prepareStatement(  
						"update file_type set file_data =? where report_id =?");  
						              
						File f=new File(up.getLocation());  
						FileReader fr=new FileReader(f);  
						              
						ps.setNString(2,up.getRpt_code());  
						ps.setCharacterStream(1,fr,(int)f.length());  
						int i=ps.executeUpdate();  
						System.out.println(i+" records affected");  
						              
						con.close();  
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}  
					
				
	
			}else {
				msg = " File Not Exist";
			}
			
	
			
			
		}else if (formmode.equals("verify")) {
			CustomReportParms up = customReportParms;
			up.setEntity_flg("Y");
			up.setModify_flg("N");
			up.setDel_flg("N");
			customReportsParmsRepo.save(up);
			msg = " Verify  Sucessfully";
		}
		return msg;
	}
	
	public CustomReportParms getParam(String rpt_ref_no) {

		CustomReportParms up = customReportsParmsRepo.findByIdcustom(rpt_ref_no);

		return up;

	}

}
