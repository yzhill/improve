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
	       req.getSession().setAttribute("name", "���˻�");
	       req.setAttribute("info", "С����");
	       resp.sendRedirect("get_info.jsp"); //��ת
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		    this.doGet(req, resp);
	}
	

}
