package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UpdateaccountDao;
import com.model.Updateaccountpojo;

/**
 * Servlet implementation class AUpdateaccount
 */
@WebServlet("/AUpdateaccount")
public class AUpdateaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 private UpdateaccountDao dao=new UpdateaccountDao();
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public AUpdateaccount() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			HttpSession session=request.getSession();
			 String accno=request.getParameter("accno");
		        String balance=request.getParameter("balance");
		        String cid=request.getParameter("cid");
		        
		        Updateaccountpojo c=new Updateaccountpojo();
				
		        c.setAccno(accno);
				c.setBalance(balance);
				c.setCid(cid);
				
				
				String customer=dao.update(c);
				
				if(customer.equals("SUCCESS")){
					System.out.println("1 Update account");
					response.sendRedirect("Adminhome.jsp");
				}
		}


}
