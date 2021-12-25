package com.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.CustomerFetchpojo;


public class CustomerFetchDao {
	
	public ArrayList<CustomerFetchpojo> list ()
	{
		ArrayList<CustomerFetchpojo> a=new ArrayList<CustomerFetchpojo>();
		
		ResultSet rs=null;
		String sql="select * from cuntomer"; 
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
				
				
				
			
				
				CustomerFetchpojo bean =new CustomerFetchpojo();
				
				
				bean.setCid(cid);
				bean.setPlotno(plotno);
				bean.setCname(cname);
				bean.setStreetname(streetname);
				bean.setCphoneno(cphoneno);				
				bean.setPincode(pincode);
				
				a.add(bean);
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		return a;


}
}
