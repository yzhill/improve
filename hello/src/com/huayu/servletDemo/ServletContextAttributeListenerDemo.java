package com.huayu.servletDemo;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeListenerDemo implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("*** ��������-->��������"+event.getName()+",��������:"+event.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent  event) {
		System.out.println("***ɾ������-->��������"+event.getName()+",��������:"+event.getValue());

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent  event) {
		System.out.println("***�����滻-->��������"+event.getName()+",��������:"+event.getValue());
	}

}
