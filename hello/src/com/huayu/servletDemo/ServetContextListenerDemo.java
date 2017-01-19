package com.huayu.servletDemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServetContextListenerDemo implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent  event) {
		System.out.println("-->ÈÝÆ÷Ïú»Ù -->"+event.getServletContext().getContextPath());

	}
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("--> ÈÝÆ÷³õÊ¼»¯-->"+event.getServletContext().getContextPath());

	}

}
