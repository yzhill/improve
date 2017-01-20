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
	    	info.add("�û�id����Ϊ��");
	    }
	    if(userpass==null||"".equals(userpass) ){
	    	info.add("���벻��Ϊ��");
	    }
	    if(info.size()==0){
	    	Member vo=new Member();
	    	vo.setUserid(userid);
	    	vo.setPassword(userpass);
	    	try {
				if(DAOFactory.GetIUserDAOInstance().findLogin(vo)){
					info.add("�û���¼�ɹ�����ӭ"+vo.getName()+"����");
				}
				else{
					info.add("�û���¼ʧ�ܣ�������û���������");
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
