package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.RDDao;
import com.model.FDpojo;
import com.model.RDpojo;

/**
 * Servlet implementation class RD
 */
@WebServlet("/RD")
public class RD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private RDDao dao=new RDDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RD() {
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
	        String noofmonth=request.getParameter("noofmonth");
	        String bookdt=request.getParameter("bookdt");
			
			RDpojo c=new RDpojo();
			
			
			c.setAccno(accno);
			c.setAmount(amount);
			c.setNoofmonth(noofmonth);
			c.setBookdt(bookdt);
			
			// session.setAttribute("email", cemail);
			// session.setAttribute("cid1", cid);
			String customer=dao.rd(c);
			
			if(customer.equals("SUCCESS")){
				System.out.println("1 add RD");
				response.sendRedirect("Customerhome.jsp");
			}
	}

}
