package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UpdateCustomerDao;
import com.model.UpdateCustomerpojo;

/**
 * Servlet implementation class Updatecustomer
 */
@WebServlet("/Updatecustomer")
public class Updatecustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UpdateCustomerDao dao=new UpdateCustomerDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Updatecustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		    String cid=request.getParameter("cid");
	        String password=request.getParameter("password");
	        String cemail=request.getParameter("cemail");
	        
	        UpdateCustomerpojo c=new UpdateCustomerpojo();
			
			
			c.setCid(cid);
			c.setPassword(password);
			c.setCemail(cemail);
			
			String customer=dao.update(c);
			
			if(customer.equals("SUCCESS")){
				System.out.println("1 Update customer");
				response.sendRedirect("Customerhome.jsp");
			}
		}
	}


