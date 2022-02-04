package com.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.AccountFetchpojo;

public class AccountFetchDao {
	
	public ArrayList<AccountFetchpojo> list ()
	{
		ArrayList<AccountFetchpojo> a=new ArrayList<AccountFetchpojo>();
		
		ResultSet rs=null;
		String sql="select * from account"; 
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
				String accno=rs.getString("accno");
				String acctype=rs.getString("acctype");
				String dateofopen=rs.getString("dateofopen");
				String balance=rs.getString("balance");
				String cid=rs.getString("cid");				
								
				AccountFetchpojo bean =new AccountFetchpojo();
				
				
				bean.setAccno(accno);
				bean.setAcctype(acctype);
				bean.setDateofopen(dateofopen);
				bean.setBalance(balance);
				bean.setCid(cid);				
				
				
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

