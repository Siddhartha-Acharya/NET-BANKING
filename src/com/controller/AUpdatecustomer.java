package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AUpdatecustomerDao;
import com.model.AUpdatecustomerpojo;

/**
 * Servlet implementation class AUpdatecustomer
 */
@WebServlet("/AUpdatecustomer")
public class AUpdatecustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AUpdatecustomerDao dao=new AUpdatecustomerDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AUpdatecustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
	    String cid=request.getParameter("cid");
        String password=request.getParameter("password");
        String cemail=request.getParameter("cemail");
        
        AUpdatecustomerpojo c=new AUpdatecustomerpojo();
		
		
		c.setCid(cid);
		c.setPassword(password);
		c.setCemail(cemail);
		
		String customer=dao.update(c);
		
		if(customer.equals("SUCCESS")){
			System.out.println("1 Update customer");
			response.sendRedirect("Adminhome.jsp");
	}

}
}
