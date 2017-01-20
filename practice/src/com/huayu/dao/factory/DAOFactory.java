package com.huayu.dao.factory;

import com.huayu.dao.IUserDAO;
import com.huayu.dao.proxy.UserDAOProxy;

public class DAOFactory {
	public static IUserDAO GetIUserDAOInstance(){
		
		 return new UserDAOProxy();
	}

}
