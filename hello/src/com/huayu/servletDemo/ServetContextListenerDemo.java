package com.huayu.servletDemo;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServetContextListenerDemo implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent  event) {
		System.out.println("-->�������� -->"+event.getServletContext().getContextPath());

	}
	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.out.println("--> ������ʼ��-->"+event.getServletContext().getContextPath());

	}

}
