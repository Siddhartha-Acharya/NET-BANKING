package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UCustomerFetchDao;
import com.model.UCustomerFetchpojo;

/**
 * Servlet implementation class UCustomerFetch
 */
@WebServlet("/UCustomerFetch")
public class UCustomerFetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private UCustomerFetchDao dao=new UCustomerFetchDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UCustomerFetch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session =request.getSession();
		//String cid=request.getParameter("cid");
	//	session.setAttribute("cid1", cid);
		
		//System.out.println("ccid="+cid);
		
		ArrayList<UCustomerFetchpojo> s=dao.list();
	    session.setAttribute("ucustomer", s);
	   response.sendRedirect("CustomerFetch.jsp");
	   
	}

}
