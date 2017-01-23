package com.huayu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.huayu.vo.Member;

public class MemberTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Member m=new Member();
			m.setId(3);
			m.setName("ÁÖÐÄÈç");
			m.setPwd("1201");
		  Configuration cfg=new Configuration().configure();
		  @SuppressWarnings("deprecation")
		 SessionFactory sf = cfg.buildSessionFactory();
		 Session session= sf.openSession();
	     session.beginTransaction();
	     session.save(m);
	     session.getTransaction().commit();
	     session.close();
	     sf.close();
	     
	}

}



