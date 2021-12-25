package com.dao;

import java.sql.DriverManager;

import com.model.Addaccountpojo;

public class AddaccountDao {
	
	public String addamount(Addaccountpojo c){
		String sql="insert into account(accno,acctype,dateofopen,balance,cid) values(?,?,?,?,?)";
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
			stmt.setString(1, c.getAccno());
			stmt.setString(2, c.getAcctype());
			stmt.setString(3, c.getDateofopen());
			stmt.setString(4, c.getBalance());
			stmt.setString(5, c.getCid());
			
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
