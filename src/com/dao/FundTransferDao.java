package com.dao;

import java.sql.DriverManager;

import com.model.FundTransferpojo;

public class FundTransferDao {
	
	
	public String transfer(FundTransferpojo c){
		String sql="insert into fundtransfer(saccno, baccno,amount,tdt) values(?,?,?,?)";
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
			stmt.setString(1, c.getSaccno());
			stmt.setString(2, c.getBaccno());
			stmt.setString(3, c.getAmount());
			stmt.setString(4, c.getTdt());
			
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
