package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */

public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletContext scontext;
	ServletConfig sconfig;

    /**
     * Default constructor. 
     */
    public SecondServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init(ServletConfig config) {
		System.out.println("From init");
		sconfig = config;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		out.println("From Second Servlet");
		scontext = sconfig.getServletContext();
		String name = request.getParameter("custname");
		String password = request.getParameter("custpwd");
		out.println("Welcome " + name + " with custid: " + password+" from 2nd ");
		
		String dname=scontext.getInitParameter("dbun");
		out.println("Context name: "+dname+" 2nd servlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
