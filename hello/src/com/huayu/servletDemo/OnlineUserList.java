package com.huayu.servletDemo;

import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;

public class OnlineUserList implements HttpSessionAttributeListener {
	
	private ServletContext app=null;
	
	public void contextInitialized(ServletContextEvent arg0){
		
		this.app= arg0.getServletContext(); //获取ServletContext对象
		this.app.setAttribute("online", new TreeSet());
		
	}

	@Override
	public void attributeAdded(HttpSessionBindingEvent arg0) {
		
		Set all=(Set)this.app.getAttribute("online");
		all.add(arg0.getValue());
		this.app.setAttribute("online", all);
		
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		
	  Set all=(Set)this.app.getAttribute("onlone");
	  all.remove(arg0.getValue());
	  this.app.setAttribute("online", all);
	}
     
	public void sessionDestroyed(HttpSessionEvent event){
		
		Set all=(Set)this.app.getAttribute("online");
		all.remove(event.getSession().getAttribute("userid"));
		this.app.setAttribute("online", all);
	}
	
	
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent arg0) {
	  

	}

}
