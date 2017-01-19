package com.huayu.servletDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ELServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse resp)
			throws ServletException, IOException {
		Dept dept=new Dept();
		dept.setDeptno(30);
		dept.setName("教学部");
		dept.setLoc("商丘");
		request.setAttribute("info",dept);
		request.getRequestDispatcher("dept_info.jsp").forward(request,  resp); //客户端跳转
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet( req,resp);
	}
	
	
	

}
