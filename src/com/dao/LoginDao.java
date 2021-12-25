package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.model.Loginpojo;

public class LoginDao {
	
	public boolean validate(Loginpojo pojo) throws ClassNotFoundException, SQLException {
		boolean status = false;
		
		System.out.println(pojo.getCid());
		try{

		Class.forName("com.mysql.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/netbanking",
				"root", "root");
		PreparedStatement preparedStatement = connection
				.prepareStatement("select * from login where cid = ? and password = ? ");
		preparedStatement.setString(1, pojo.getCid());
		preparedStatement.setString(2, pojo.getPassword());

		System.out.println(preparedStatement);
		ResultSet rs = preparedStatement.executeQuery();
		status = rs.next();
		//return status;
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		return status;
	}

	

}
