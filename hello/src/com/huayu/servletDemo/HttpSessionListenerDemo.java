package com.huayu.servletDemo;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionListenerDemo implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("***SESSION������SESSION ID="+event.getSession().getId());

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("***SESSION���٣�SESSION ID="+event.getSession().getId());

	}

}
