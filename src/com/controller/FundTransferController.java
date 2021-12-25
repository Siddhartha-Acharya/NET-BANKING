package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.FundTransferDao;
import com.model.FundTransferpojo;
import com.model.Registrationpojo;

/**
 * Servlet implementation class FundTransferController
 */
@WebServlet("/FundTransferController")
public class FundTransferController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private FundTransferDao dao=new FundTransferDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FundTransferController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
        String saccno=request.getParameter("saccno");
        String baccno=request.getParameter("baccno");
		String amount=request.getParameter("amount");
		 String tdt=request.getParameter("tdt");
		
		 FundTransferpojo c=new FundTransferpojo();
		
		
		c.setSaccno(saccno);
		c.setBaccno(baccno);
		c.setAmount(amount);
		c.setTdt(tdt);
		
		String customer=dao.transfer(c);
		
		if(customer.equals("SUCCESS")){
			System.out.println("Fund transfer successful");
			response.sendRedirect("Customerhome.jsp");
		}
	}
	

}
