package com.huayu.servletDemo;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionListenerDemo implements HttpSessionListener {

	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("***SESSION´´½¨£¬SESSION ID="+event.getSession().getId());

	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("***SESSIONÏú»Ù£¬SESSION ID="+event.getSession().getId());

	}

}
