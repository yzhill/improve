package com.huayu.dao;

import com.huayu.vo.Member;

public interface IUserDAO {
	/**
	 * 用户登录验证
	 * @param vo 传入vo对象
	 * @return 验证的操作结果
	 * @throws Exception
	 */
	public boolean findLogin(Member vo) throws Exception;

}
