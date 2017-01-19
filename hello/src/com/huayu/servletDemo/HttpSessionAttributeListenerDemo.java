package com.huayu.servletDemo;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class HttpSessionAttributeListenerDemo implements
		HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println(event.getSession().getId()+"����������-->�������ƣ�-->"+event.getName()+",��������"+event.getValue());

	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println(event.getSession().getId()+"��ɾ������-->�������ƣ�-->"+event.getName()+",��������"+event.getValue());

	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println(event.getSession().getId()+"���滻����-->�������ƣ�-->"+event.getName()+",��������"+event.getValue());

	}

}
