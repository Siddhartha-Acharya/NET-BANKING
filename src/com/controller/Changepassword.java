package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ChangePasswordDao;
import com.model.Changepasswordpojo;


/**
 * Servlet implementation class Changepassword
 */
@WebServlet("/Changepassword")
public class Changepassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private ChangePasswordDao dao=new ChangePasswordDao(); 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Changepassword() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session=request.getSession();
		String cid=request.getParameter("cid");
		
		String password=request.getParameter("password");
		
	
		Changepasswordpojo pojo=new Changepasswordpojo();
		pojo.setCid(cid);
		pojo.setPassword(password);
		
		
		String s=dao.insert(pojo);
		if(s.equals("SUCCESS"))
		{
			response.sendRedirect("login.jsp");
			System.out.println("Changed Password");
		}
		else
		{
			response.sendRedirect("Changepassword.jsp");
		}
	}
	

}
