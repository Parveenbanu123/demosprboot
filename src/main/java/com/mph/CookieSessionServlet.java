package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CookieSessionServlet
 */
@WebServlet("/CookieSessionServlet")
public class CookieSessionServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CookieSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println(request.getParameter("username"));
		out.println(request.getParameter("JSessionId"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String username=request.getParameter("username");
		Cookie c=new Cookie("UN",username);
		response.addCookie(c);
		c.setMaxAge(1000);
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
			for(Cookie cookie:cookies) {
				System.out.println(cookie.getName());
				if(cookie.getName().equals("UN")) {
					username=cookie.getValue();
					out.println(username);
				}
			}
		}
	}

}
