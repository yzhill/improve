package com.huayu.servletDemo;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletRequestAttributeListeneDemo implements
		ServletRequestAttributeListener {

	@Override
	
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		
		System.out.println("***增加request属性-->属性名称："+arg0.getName()+",属性内容："+arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		
		System.out.println("***删除request属性-->属性名称："+arg0.getName()+",属性内容："+arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("***替换request属性-->属性名称："+arg0.getName()+",属性内容："+arg0.getValue());

	}

}
