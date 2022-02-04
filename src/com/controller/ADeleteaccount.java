package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.DeleteaccountDao;
import com.model.Deleteaccountpojo;

/**
 * Servlet implementation class ADeleteaccount
 */
@WebServlet("/ADeleteaccount")
public class ADeleteaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private DeleteaccountDao dao=new DeleteaccountDao();
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ADeleteaccount() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
			 HttpSession session=request.getSession();
			 String accno=request.getParameter("accno");
		       
			 Deleteaccountpojo c=new Deleteaccountpojo();
				
				
				c.setAccno(accno);
				
				
				String customer=dao.delete(c);
				
				if(customer.equals("SUCCESS")){
					System.out.println("1 account delete");
					response.sendRedirect("Adminhome.jsp");
				}
			
		}


}
