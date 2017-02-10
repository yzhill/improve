package com.huayu;

import static org.junit.Assert.*;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.huayu.vo.Group;
import com.huayu.vo.Member;
import com.huayu.vo.User;

public class MembeTest {
	private static SessionFactory sf=null;
	@SuppressWarnings("deprecation")
	
	@BeforeClass 
	public static void beforeClass(){
	new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
	  sf=new AnnotationConfiguration().configure().buildSessionFactory();
		
		}




	@Test
	public void testMemberSave() {
		Member m=new Member();
		m.setId(1);
		m.setName("王自如");
		m.setPwd("1201");
		m.setBirthday(new Date());

	 Session session= sf.openSession();
     session.beginTransaction();
     session.save(m);
     session.getTransaction().commit();
     session.close();
	}  
	
	@SuppressWarnings("deprecation")
	@Test
	public void testSchemaExport(){
	  
		new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
		
		
	}
	@Test
	public void testSave(){
		User u=new User();
		u.setName("周杰伦");
		Group g=new Group();
		g.setName("歌手组");
		u.setGroup(g);
		Session session=sf.openSession();
		session.beginTransaction();
		//session.save(g);
	    session.save(u);
	    session.getTransaction().commit();
	   
	}
	@Test
	public void testSaveGroup(){ //增加
		User u1=new User();
		u1.setName("周杰伦");
		User u2=new User();
		u2.setName("林心如");
		Group g=new Group();
		g.setName("g1");
		g.getUsers().add(u1);  //一找多
		g.getUsers().add(u2);
		u1.setGroup(g);     //多找一
		u2.setGroup(g);
		Session session=sf.openSession();
		session.beginTransaction();
		//session.save(g);
	    session.save(g); //cascade 级联  保存组自动保存用户
	    session.getTransaction().commit();
	    session.close();
	   
	}
	@Test
	public void testGetGroup(){
		testSaveGroup();
		
		Session s=sf.openSession();
		s.beginTransaction();
		Group g=(Group)s.get(Group.class, 1);
		s.getTransaction().commit();
		for(User u: g.getUsers()){
		System.out.println(u.getName());
			
		}
	}
	@Test
	public void testUpateUsers(){ //更新
		testSaveGroup();
		
		Session s=sf.openSession();
		s.beginTransaction();
		User u=(User)s.get(User.class, 2);
		s.getTransaction().commit();
		s.close();
		u.setName("霍建华");
		u.getGroup().setName("g7");
		Session s2=sf.openSession();
		s2.beginTransaction();
		s2.update(u);
		
		s2.getTransaction().commit();
		s2.close();
	}
	@Test
	public void testDeleteUsers(){  //删除
		testSaveGroup();
		
		Session s=sf.openSession();
		s.beginTransaction();
		User u=(User)s.load(User.class, 3);
		u.setGroup(null);
		s.delete(u);   //两种方法删除
		//s.createQuery("delete from User u where u.id=2").executeUpdate();
		s.getTransaction().commit();
		s.close();
		
	}
	
	
     
    @AfterClass
   public static void afterClass(){
    	 
    	 sf.close();
    	 
       }
		
	}


