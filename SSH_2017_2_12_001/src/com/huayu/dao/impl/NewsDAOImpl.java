package com.huayu.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.huayu.dao.INewsDAO;
import com.huayu.pojo.News;
 @Component
public class NewsDAOImpl implements INewsDAO {
	 @Resource
	 private SessionFactory sessionFactory;

	@Override
	public boolean doCreate(News vo) throws Exception {
		// TODO Auto-generated method stub
		return this.sessionFactory.getCurrentSession().save(vo) != null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<News> findAll() throws Exception {
		Criteria criteria =this.sessionFactory.getCurrentSession().createCriteria(News.class);
		return criteria.list();
	}

}
