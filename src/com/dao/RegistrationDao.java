package com.dao;

import java.sql.DriverManager;
import com.model.Registrationpojo;



public class RegistrationDao {
	
	public String registration(Registrationpojo c){
		String sql="insert into login(cid,password) values(?,?)";
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
			stmt.setString(2, c.getPassword());
			
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
