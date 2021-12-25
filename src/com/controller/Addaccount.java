package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AddaccountDao;
import com.model.Addaccountpojo;

/**
 * Servlet implementation class Addaccount
 */
@WebServlet("/Addaccount")
public class Addaccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AddaccountDao dao=new AddaccountDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addaccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		 String accno=request.getParameter("accno");
	        String acctype=request.getParameter("acctype");
	        String dateofopen=request.getParameter("dateofopen");
	        String balance=request.getParameter("balance");
	        String cid=(String) session.getAttribute("username");
		
			//System.out.println("cid"+cid);
	        Addaccountpojo c=new Addaccountpojo();
			
			
			c.setAccno(accno);
			c.setAcctype(acctype);
			c.setDateofopen(dateofopen);
			c.setBalance(balance);
			c.setCid(cid);
			
			String customer=dao.addamount(c);
			
			if(customer.equals("SUCCESS")){
				System.out.println("1 add amount");
				response.sendRedirect("Adminhome.jsp");
			}
		}
	}
