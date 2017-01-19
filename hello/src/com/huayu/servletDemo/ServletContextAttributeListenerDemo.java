package com.huayu.servletDemo;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeListenerDemo implements
		ServletContextAttributeListener {

	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		System.out.println("*** 增加属性-->属性名称"+event.getName()+",属性内容:"+event.getValue());
		
	}

	@Override
	public void attributeRemoved(ServletContextAttributeEvent  event) {
		System.out.println("***删除属性-->属性名称"+event.getName()+",属性内容:"+event.getValue());

	}

	@Override
	public void attributeReplaced(ServletContextAttributeEvent  event) {
		System.out.println("***增加替换-->属性名称"+event.getName()+",属性内容:"+event.getValue());
	}

}
