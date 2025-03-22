package com.mph;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebInitParam;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter(filterName="FirstFilter",urlPatterns="/MyServlet",initParams= {
		@WebInitParam(name="fun",value="Parveen"),
		@WebInitParam(name="fpwd",value="pass")
})
public class FirstFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
	FilterConfig fc; 
    public FirstFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("From Filter destroy()...");
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		System.out.println("From Dofilter()");
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		String cun=req.getParameter("custname");
		String cpwd=req.getParameter("custpwd");
		
		String funame=fc.getInitParameter("fun");
		String fpwd=fc.getInitParameter("fpwd");
		if(cun.equals(funame)&&cpwd.equals(fpwd)) {
			long starttime =  System.currentTimeMillis();
			chain.doFilter(request, response);
			long endtime =  System.currentTimeMillis();
			long timetaken = endtime-starttime;
			System.out.println("Time taken by the servlet : " + timetaken);
		}
		else {
			response.setContentType("text/html;charset=UTF-8");
			out.println("You are not a valid user...");
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("From Filter init()...");
		this.fc=fConfig;
	}

}
