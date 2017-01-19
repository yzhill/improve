package com.huayu.servletDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class ClientRedirectDemo extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	       req.getSession().setAttribute("name", "李兴华");
	       req.setAttribute("info", "小李子");
	       resp.sendRedirect("get_info.jsp"); //跳转
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		    this.doGet(req, resp);
	}
	

}
