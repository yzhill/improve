package com.huayu.servletDemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LifeCycleServlet extends HttpServlet {
	
	public void init() throws ServletException {
		  System.out.println("1.servlet��ʼ��");
	  }
	  public void doGet(HttpServletRequest req,HttpServletResponse resp){
		  System.out.println("2.servlet����-->doGet()��doPost()");
	  }
	  public void doPost(HttpServletRequest req,HttpServletResponse resp){
		  this.doGet(req, resp);
	  }
	  public void destory(){
		  System.out.println("3.Servlet����-->destory()");
	  }
	  
    
}
