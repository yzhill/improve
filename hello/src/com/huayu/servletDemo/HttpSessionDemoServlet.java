package com.huayu.servletDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class HttpSessionDemoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	   HttpSession ses= req.getSession();
	   System.out.println("SESSION ID-->"+ses.getId());
	   ses.setAttribute("username", "���˻�");//��������
	   System.out.println("username �������� : "+ses.getAttribute("username")); //ȡ������
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet( req,resp);
	}
	

}
