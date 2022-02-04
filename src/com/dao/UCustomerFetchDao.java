package com.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import com.model.UCustomerFetchpojo;

public class UCustomerFetchDao {
	
	public ArrayList<UCustomerFetchpojo> list ()
	{
		ArrayList<UCustomerFetchpojo> a=new ArrayList<UCustomerFetchpojo>();
		
		ResultSet rs=null;
		String sql="select * from customer"; 
		String url="jdbc:mysql://localhost:3306/netbanking";
		String username="root";
		String password="root";
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,username,password);
			stmt=con.prepareStatement(sql);
			rs=stmt.executeQuery();
			
			while(rs.next())
			{
				String cid=rs.getString("cid");
				String plotno=rs.getString("plotno");
				String cname=rs.getString("cname");
				String streetname=rs.getString("streetname");
				String cphoneno=rs.getString("cphoneno");				
				String pincode=rs.getString("pincode");
				String cemail=rs.getString("cemail");
				String adharno=rs.getString("adharno");
				String panno=rs.getString("panno");
				String dob=rs.getString("dob");
				String gender=rs.getString("gender");
				
				
				
				UCustomerFetchpojo bean =new UCustomerFetchpojo();
				
				bean.setCid(cid);
				bean.setPlotno(plotno);
				bean.setCname(cname);
				bean.setStreetname(streetname);
				bean.setCphoneno(cphoneno);				
				bean.setPincode(pincode);
				bean.setCemail(cemail);
				bean.setAdharno(adharno);
				bean.setPanno(panno);
				bean.setDob(dob);
				bean.setGender(gender);
				
				
				
				a.add(bean);
				//stmt.setString(1, bean.getCid());
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		return a;
	}

}
