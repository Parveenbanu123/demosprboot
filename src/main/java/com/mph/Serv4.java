package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv4
 */
@WebServlet("/Serv4")
public class Serv4 extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
        out.println("<title>First Servlet</title>");
        out.println("</head>");
        out.println("<body>");
        HttpSession hs=request.getSession();
        int p1 = Integer.parseInt((String)hs.getAttribute("Toys"));
        int p2 = Integer.parseInt((String)hs.getAttribute("Laptop"));
        int p3 = Integer.parseInt((String)hs.getAttribute("Watch"));
        int total = p1+p2+p3;
        out.println("Total :" + total);
        out.println();
		 out.println("</body>");
         out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
