package com.mph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirsttServlet
 */

public class FirsttServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ServletConfig sconfig;
	ServletContext scontext;

	/**
	 * Default constructor.
	 */
	public FirsttServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	public void init(ServletConfig config) {
		System.out.println("From init");
		sconfig = config;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		scontext = sconfig.getServletContext();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1 style='color:blue'>" + request.getContentLength() + "</h1>");
		out.println("<a href='SecondServlet'>Click</a>");
		out.println("<h1 style='color:red'>" + request.getContentLength() + "</h1>");
		out.println("<h1 style='color:yello'>" + request.getMethod() + "</h1>");
		out.println("<h1 style='color:green'>" + request.getQueryString() + "</h1>");
		out.println("<h1 style='color:orange'>" + request.getRequestURI() + "</h1>");
		out.println("<h1 style='color:blue'>" + request.getServletPath() + "</h1>");
		out.println("<h1 style='color:pink'>" + request.getHeaderNames() + "</h1>");
		out.println("</body>");
		out.println("</html>");

		String name = request.getParameter("custname");
		String password = request.getParameter("custpwd");
		out.println("Welcome " + name + " with custid: " + password);
		
		//Servlet Config 
		String uname = sconfig.getInitParameter("un");
		String pass = sconfig.getInitParameter("pwd");
		
		//Servlet Context
		String dname=scontext.getInitParameter("dbun");
		out.println("Context name: "+dname+"from 1st servlet");
		
		if (name.equals(uname) && password.equals(pass)) {
			RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
			rd.include(request, response);
		} else {
			out.println("<a href='http://www.google.com'>Google</a>");
		}
		Enumeration<String> params = request.getParameterNames();
		while (params.hasMoreElements()) {
			String pnames = (String) params.nextElement();
			out.println(pnames + " -- " + request.getParameter(pnames));
		}
//		Enumeration attributes=request.getAttributeNames();
//		while(attributes.hasMoreElements()) {
//			String attr=(String) attributes.nextElement();
//			out.println(attr);
//		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	public void destroy() {
		System.out.println("From destroy");
	}

}
