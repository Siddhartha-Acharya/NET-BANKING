package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FDDao;
import com.model.Adcustomerpojo;
import com.model.FDpojo;

/**
 * Servlet implementation class FD
 */
@WebServlet("/FD")
public class FD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private FDDao dao=new FDDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FD() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		    String accno=request.getParameter("accno");
	        String amount=request.getParameter("amount");
	        String noofyear=request.getParameter("noofyear");
	        String bookdt=request.getParameter("bookdt");
			
			FDpojo c=new FDpojo();
			
			
			c.setAccno(accno);
			c.setAmount(amount);
			c.setNoofyear(noofyear);
			c.setBookdt(bookdt);
			
			// session.setAttribute("email", cemail);
			// session.setAttribute("cid1", cid);
			String customer=dao.fd(c);
			
			if(customer.equals("SUCCESS")){
				System.out.println("1 add FD");
				response.sendRedirect("Customerhome.jsp");
			}
	}

}
