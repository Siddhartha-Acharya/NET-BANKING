package com.dao;

import java.sql.DriverManager;

import com.model.Adcustomerpojo;

public class AdcustomerDao {
	
	public String registration(Adcustomerpojo c){
		String sql="insert into cuntomer(cid,plotno,cname,streetname,cphoneno,pincode) values(?,?,?,?,?,?)";
		String url="jdbc:mysql://localhost:3306/netbanking";
		String username="root";
		String password="root";
		java.sql.Connection con=null;
		java.sql.PreparedStatement stmt=null;
		int rs=0;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection(url,username,password);

			stmt=con.prepareStatement(sql);
			stmt.setString(1, c.getCid());
			stmt.setString(2, c.getPlotno());
			stmt.setString(3, c.getCname());
			stmt.setString(4, c.getStreetname());
			stmt.setString(5, c.getCphoneno());
			stmt.setString(6, c.getPincode());
			
			System.out.println(stmt);
			rs=stmt.executeUpdate();
			
			
			
			if(rs!=0){
				return "SUCCESS";
			}
			
			
		}catch(Exception e){
			System.out.println(e);
		}
		
		return "something went worng please try again";
		
	}


}
