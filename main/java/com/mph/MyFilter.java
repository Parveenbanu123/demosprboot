package com.mph;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;



public class MyFilter extends HttpFilter implements Filter {
    FilterConfig fc;   
   
    public MyFilter() {
        super();
        
    }

	
	public void destroy() {
		System.out.println("From Filter destroy()...");
		fc=null;
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		String cun=req.getParameter("custname");
		String cpwd=req.getParameter("custpwd");
		if(cun.equals("Parveen")&&cpwd.equals("pass")) {
		chain.doFilter(request, response);
		}
		else {
			response.setContentType("text/html");
			out.println("You are not a valid user...");
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("From Filter init()...");
		fc=fConfig;
	}

}
