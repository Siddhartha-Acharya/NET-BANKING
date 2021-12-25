package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AdcustomerDao;
import com.model.Adcustomerpojo;
import com.model.Registrationpojo;

/**
 * Servlet implementation class Adcustomer
 */
@WebServlet("/Adcustomer")
public class Adcustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AdcustomerDao dao=new AdcustomerDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adcustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
        String cid=(String)session.getAttribute("username");
        String plotno=request.getParameter("plotno");
        String cname=request.getParameter("cname");
        String streetname=request.getParameter("streetname");
        String cphoneno=request.getParameter("cphoneno");
		String pincode=request.getParameter("pincode");
		//System.out.println("cid"+cid);
		Adcustomerpojo c=new Adcustomerpojo();
		
		
		c.setCid(cid);
		c.setPlotno(plotno);
		c.setCname(cname);
		c.setStreetname(streetname);
		c.setCphoneno(cphoneno);
		c.setPincode(pincode);
		
		String customer=dao.registration(c);
		
		if(customer.equals("SUCCESS")){
			System.out.println("1 add customer");
			response.sendRedirect("Adminhome.jsp");
		}
	}
	

}
