package com.huayu.servletDemo;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class ServletRequestAttributeListeneDemo implements
		ServletRequestAttributeListener {

	@Override
	
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		
		System.out.println("***����request����-->�������ƣ�"+arg0.getName()+",�������ݣ�"+arg0.getValue());
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		
		System.out.println("***ɾ��request����-->�������ƣ�"+arg0.getName()+",�������ݣ�"+arg0.getValue());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		System.out.println("***�滻request����-->�������ƣ�"+arg0.getName()+",�������ݣ�"+arg0.getValue());

	}

}
