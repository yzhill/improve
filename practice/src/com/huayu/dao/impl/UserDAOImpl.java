package com.huayu.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.jsp.tagext.TryCatchFinally;

import com.huayu.dao.IUserDAO;
import com.huayu.vo.Member;

public class UserDAOImpl implements IUserDAO {
 	  private Connection conn=null;
 	  private PreparedStatement pstmt=null;
 	  public UserDAOImpl(Connection conn){ //构造方法
 		   this.conn=conn;
 		  
 	  }
	@Override
	public boolean findLogin(Member vo) throws Exception {
		boolean flag=false;
		try {
			String sql="select name from member where userid=? and password=?";
			this.pstmt=this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, vo.getUserid());
			this.pstmt.setString(2,vo.getPassword());
			ResultSet rs=this.pstmt.executeQuery();
			if(rs.next()){
				vo.setName(rs.getString(1)); //取得姓名
				flag=true;
		      } 
		  }	catch (Exception e) {
			  
			throw  e;
			
		 } finally{
			 if(this.pstmt!=null){
				 this.pstmt.close();
			 }
			  
		  }
		
		return flag;	
	   }
		
		
	}


