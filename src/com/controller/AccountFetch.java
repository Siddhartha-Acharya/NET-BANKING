package com.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.AccountFetchDao;
import com.model.AccountFetchpojo;

/**
 * Servlet implementation class AccountFetch
 */
@WebServlet("/AccountFetch")
public class AccountFetch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private AccountFetchDao dao=new AccountFetchDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountFetch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		ArrayList<AccountFetchpojo> s=dao.list();
	    session.setAttribute("account", s);
	    response.sendRedirect("Accountfetch.jsp");
	}

}
