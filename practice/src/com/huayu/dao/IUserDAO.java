package com.huayu.dao;

import com.huayu.vo.Member;

public interface IUserDAO {
	/**
	 * �û���¼��֤
	 * @param vo ����vo����
	 * @return ��֤�Ĳ������
	 * @throws Exception
	 */
	public boolean findLogin(Member vo) throws Exception;

}
