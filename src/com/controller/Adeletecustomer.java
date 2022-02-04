package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.AdeletecustomerDao;
import com.model.Adeletecustomerpojo;

/**
 * Servlet implementation class Adeletecustomer
 */
@WebServlet("/Adeletecustomer")
public class Adeletecustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AdeletecustomerDao dao=new AdeletecustomerDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Adeletecustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 String cid=request.getParameter("cid");
	       
		 Adeletecustomerpojo c=new Adeletecustomerpojo();
			
			
			c.setCid(cid);
			
			
			String customer=dao.delete(c);
			
			if(customer.equals("SUCCESS")){
				System.out.println("1 customer delete");
				response.sendRedirect("Adminhome.jsp");
	}

}
}