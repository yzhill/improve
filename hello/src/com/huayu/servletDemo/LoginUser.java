package com.huayu.servletDemo;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class LoginUser implements HttpSessionBindingListener {
	
	  private String name;
	  public LoginUser(String name){
		   this.setName(name);
		  
	  }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		
		System.out.println("***在session中保存loginuser对象name="+this.getName()+"session id="+event.getSession().getId());
		
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		
		System.out.println("***在session中移除loginuser对象name="+this.getName()+"session id="+event.getSession().getId());
	}

}
