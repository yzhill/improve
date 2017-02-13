package com.huayu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huayu.dao.INewsDAO;
import com.huayu.service.INewsService;

public class TestDAO {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		INewsService newsService=ctx.getBean("newsServiceImpl",INewsService.class);
        System.out.println(newsService.list());
	}

}
