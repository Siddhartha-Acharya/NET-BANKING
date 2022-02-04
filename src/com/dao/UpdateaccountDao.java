package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.model.Updateaccountpojo;

public class UpdateaccountDao {
	
	public String update(Updateaccountpojo pojo)
	{
		String sql="UPDATE account SET accno=?, balance=? WHERE cid=?";
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
				stmt.setString(1, pojo.getAccno());
				stmt.setString(2, pojo.getBalance());
				stmt.setString(3, pojo.getCid());
				
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
