package com.mph;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
/**
 * Servlet implementation class MyServlet
 */

@WebServlet(urlPatterns="/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("From MyServlet");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>First Servlet</title>");
		out.println("</head>");
		out.println("<body>");
		HttpSession hs=request.getSession();
		hs.setAttribute("Toys", "500");
		out.println("<h2>"+hs.getId()+"</h2>");
		out.println("<h2>"+hs.isNew()+"</h2>");
		out.println("<h2>"+hs.getCreationTime()+"</h2>");
		out.println("<a href='Serv2'>Click for Serv2</a>");
		//out.println();
		out.println("</body>");
		out.println("</html>");
		//response.sendRedirect("URLRewritingSessionServlet?username=Parveen");
		
		//out.println("From My Servlet......");
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
