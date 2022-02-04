package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.LoginDao;
import com.model.Loginpojo;




/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private LoginDao dao =new LoginDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		    HttpSession session=request.getSession();
		    String cid = request.getParameter("cid");
	        String password = request.getParameter("password");
	        Loginpojo pojo = new Loginpojo();
	        pojo.setCid(cid);
	        pojo.setPassword(password);
	        System.out.println("cid="+cid);
	        session.setAttribute("cid", cid);

	        try {
	            if (dao.validate(pojo)) {
	                
	            	System.out.println("Login Successful");
	                response.sendRedirect("Customerhome.jsp");
	                
	            } else {
	                response.sendRedirect("login.jsp");
	            }
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	}

}
