package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import com.model.FetchUserIdpojo;

/**
 * Servlet implementation class Adminlogin
 */
@WebServlet("/Adminlogin")
public class Adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adminlogin() {
        super();
        // TODO Auto-generated constructor stub
    }
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		String cid=(String) session.getAttribute("cid");
		System.out.println("cid="+cid);
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		boolean s="admin".equals(username);
		boolean s1="admin".equals(password);
		if(s==true && s1==true){
			session.setAttribute("username", username);
			System.out.println("Login Succesfull");
			response.sendRedirect("Adminhome.jsp");
		}
		else{
			response.sendRedirect("Adminlogin.jsp");
		}
	}

}
