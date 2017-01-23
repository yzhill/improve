package com.huayu;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.huayu.vo.Member;

public class MembeTest {
	private static SessionFactory sf=null;
	@SuppressWarnings("deprecation")
	@BeforeClass 
	public static void beforeClass(){
	  sf=new AnnotationConfiguration().configure().buildSessionFactory();
		
		}

	@Test
	public void testMemberSave() {
		Member m=new Member();
		m.setId(1);
		m.setName("Íõ×ÔÈç");
		m.setPwd("1201");
		m.setBirthday(new Date());

	 Session session= sf.openSession();
     session.beginTransaction();
     session.save(m);
     session.getTransaction().commit();
     session.close();
	}  
     
    @AfterClass
   public static void afterClass(){
    	 
    	 sf.close();
    	 
       }
		
	}


