package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.UpdateCustomerpojo;



public class UpdateCustomerDao {
	
	public String update(UpdateCustomerpojo pojo)
	{
		String sql="UPDATE cuntomer SET cid=?, password=? WHERE cemail=?";
		String dburl="jdbc:mysql://localhost:3306/netbanking";
	  	String dbname="root";
	  	String dbpass="root";
		Connection con=null;
	  	PreparedStatement stmt=null;
	  	int rs=0;
	  	 try
		  {
	  		  Class.forName("com.mysql.jdbc.Driver");
				con=DriverManager.getConnection(dburl,dbname,dbpass);
				stmt=con.prepareStatement(sql);
				stmt.setString(1, pojo.getCid());
				stmt.setString(2, pojo.getPassword());
				stmt.setString(3, pojo.getCemail());
				
				System.out.println(stmt);
			    rs=stmt.executeUpdate();
			    
			    if (rs!=0)
			    {
		             return "SUCCESS";
			    }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	  	 
		return "Something went wrong plzz try again";
	}


}
