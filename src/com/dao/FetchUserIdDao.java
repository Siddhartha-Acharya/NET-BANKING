package com.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.model.FetchUserIdpojo;

public class FetchUserIdDao {
	
	public ArrayList<FetchUserIdpojo> list ()
	{
		ArrayList<FetchUserIdpojo> a=new ArrayList<FetchUserIdpojo>();
		
		ResultSet rs=null;
		String sql="select * from login"; 
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
				
				
				FetchUserIdpojo bean =new FetchUserIdpojo();
				
				
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
