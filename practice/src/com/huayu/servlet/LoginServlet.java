package com.huayu.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huayu.dao.factory.DAOFactory;
import com.huayu.vo.Member;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String path="login.jsp";
	    int userid=Integer.parseInt(req.getParameter("userid"));
	    String userpass=req.getParameter("userpass");
	    List<String> info=new ArrayList<String>();
	    if(userid==0 ){
	    	info.add("用户id不能为空");
	    }
	    if(userpass==null||"".equals(userpass) ){
	    	info.add("密码不能为空");
	    }
	    if(info.size()==0){
	    	Member vo=new Member();
	    	vo.setUserid(userid);
	    	vo.setPassword(userpass);
	    	try {
				if(DAOFactory.GetIUserDAOInstance().findLogin(vo)){
					info.add("用户登录成功，欢迎"+vo.getName()+"光临");
				}
				else{
					info.add("用户登录失败，错误的用户名和密码");
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
	    	
	    }
	      req.setAttribute("info", info);
	      req.getRequestDispatcher(path).forward(req, resp);
	  
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
	      this.doGet(req, resp);
	}
	   
 
}
