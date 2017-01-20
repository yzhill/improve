package com.huayu.dao.proxy;

import com.huayu.dao.IUserDAO;
import com.huayu.dao.impl.UserDAOImpl;
import com.huayu.dbc.DatabaseConnection;
import com.huayu.vo.Member;

public class UserDAOProxy implements IUserDAO {
	private DatabaseConnection dbc=null;
	private IUserDAO dao=null;
	public UserDAOProxy(){
		
		this.dbc=new DatabaseConnection(); //ʵ�������ݿ�����
		this.dao=new UserDAOImpl(this.dbc.getConnection()); 
	}

	@Override
	public boolean findLogin(Member vo) throws Exception {
		boolean flag=false;
		try {
			flag=this.dao.findLogin(vo);
		} catch (Exception e) {
			throw e;
		}finally{
			this.dbc.close();
		}
		return flag;
	}

}
