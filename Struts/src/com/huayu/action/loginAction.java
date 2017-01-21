package com.huayu.action;

import com.huayu.vo.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class loginAction extends ActionSupport implements ModelDriven<User> {
	private User user=new User();
	
	
	
	public String login(){
		
		
		System.out.println(user.getBooklist().get(0).getUsername());
		System.out.println(user.getBooklist().get(1).getUsername());
		return SUCCESS;
	}


	@Override
	public void validate() {
		
		if(user.getUsername()==null ||"".equals(user.getUsername())){
			this.addFieldError("username","用户名不能为空");
			//return INPUT;
			
		}
	}


	@Override
	public User getModel() {
		
		return user;
	}

}
