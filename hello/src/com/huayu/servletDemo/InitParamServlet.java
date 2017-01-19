package com.huayu.servletDemo;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class InitParamServlet extends HttpServlet {
	private String initParam=null;
	public void init(ServletConfig config){
		this.initParam=config.getInitParameter("ref");
	}
	public void doGet(HttpServletRequest req,HttpServletResponse resp){
		System.out.println("初始化参数："+this.initParam);
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse resp){
		this.doGet(req, resp);
	}
}
