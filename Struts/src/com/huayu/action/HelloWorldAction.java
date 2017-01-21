package com.huayu.action;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		System.out.println("Ö´ÐÐAction!!");
		return SUCCESS;
	}
    public String update(){
    	
    	return "update";
    }
    public String add(){
    	return "add";
    	
    }

}
