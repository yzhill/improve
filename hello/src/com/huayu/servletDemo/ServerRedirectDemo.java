package com.huayu.servletDemo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ServerRedirectDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	    req.getSession().setAttribute("name", "ÀîÐË»ª");
	    req.setAttribute("info", "www.google.com");
	    RequestDispatcher rd=req.getRequestDispatcher("get_info.jsp");
	    rd.forward( req,  resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}
	

}
